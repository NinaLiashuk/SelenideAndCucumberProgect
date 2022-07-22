package it.academy.by.hw6.page_object;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import static com.codeborne.selenide.Selenide.*;


public class OnlinerHeaderPage extends AbstractPage{

    private static final List<SelenideElement> categoriesOnHeaderPage =
            $$x("//*[contains(@class, 'b-main-navigation__text')]/ancestor::li");

    private static final String ITEMS_INTO_DROPDOWN_LIST =
            ".//span[contains(@class, 'b-main-navigation__dropdown-advert-sign')]";

    public OnlinerHeaderPage moveToLinkOnHeaderPage(String link){
        $$(categoriesOnHeaderPage).findBy(Condition.text(link)).hover();
        return this;
    }

    public List<SelenideElement> dropdownList (String link){
        return $$(categoriesOnHeaderPage)
                .findBy(Condition.text(link))
                .$$x(ITEMS_INTO_DROPDOWN_LIST)
                .stream()
                .peek(SelenideElement::getText)
                .collect(Collectors.toList());
    }

    public void assertThatDropdownListIsDisplayed(String link){
        $$(dropdownList(link)).shouldBe(CollectionCondition.allMatch("", WebElement::isDisplayed));
    }

    public void assertThatDropdownListHasSize(String link, int size){
        System.out.println(dropdownList(link).size());
        $$(dropdownList(link)).shouldHaveSize(size);
    }

    public void assertThatDropdownListContainsValue(String link, String value){
        $$(dropdownList(link)).findBy(Condition.text(value)).shouldBe(Condition.visible, Duration.ofSeconds(10));
    }
}
