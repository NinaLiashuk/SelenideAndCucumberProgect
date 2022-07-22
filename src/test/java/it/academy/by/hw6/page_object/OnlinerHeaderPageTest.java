package it.academy.by.hw6.page_object;

import it.academy.by.hw6.navigation.OpenOnlinerPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;
import static it.academy.by.hw6.navigation.OpenOnlinerPage.openOnlinerHeaderPage;

public class OnlinerHeaderPageTest {

    private OnlinerHeaderPage onlinerHeaderPage = new OnlinerHeaderPage();

    @BeforeAll
    public static void openBrowser(){
        OpenOnlinerPage.openOnlinerHeaderPage();
    }

    @Test
    @DisplayName("assert that move mouse to Car Market link show dropdown list")
    public void moveMouseToCarMarketTitleShouldShowDropdownList() {
        onlinerHeaderPage
                .moveToLinkOnHeaderPage("Автобарахолка")
                .assertThatDropdownListIsDisplayed("Автобарахолка");
    }

    @Test
    @DisplayName("check that Car Market dropdown list have size from value")
    public void carMarketDropdownListShouldHaveSize() {
        onlinerHeaderPage
                .moveToLinkOnHeaderPage("Автобарахолка")
                .assertThatDropdownListHasSize("Автобарахолка", 36);
    }

    @ParameterizedTest
    @CsvSource(value = {"Минск", "Гродно", "Брест", "Opel", "Kawasaki"})
    public void carMarketDropdownListContainsValues(String value){
        onlinerHeaderPage
                .moveToLinkOnHeaderPage("Автобарахолка")
                .assertThatDropdownListContainsValue("Автобарахолка", value);
    }

    @Test
    @DisplayName("assert that move mouse to Houses And Homes link show dropdown list")
    public void moveMouseToHousesTitleShouldShowDropdownList() {
        onlinerHeaderPage
                .moveToLinkOnHeaderPage("Дома и квартиры")
                .assertThatDropdownListIsDisplayed("Дома и квартиры");
    }

    @Test
    @DisplayName("check that Houses And Homes dropdown list have size from value")
    public void housesAndHomesDropdownListShouldHaveSize() {
        onlinerHeaderPage
                .moveToLinkOnHeaderPage("Дома и квартиры")
                .assertThatDropdownListHasSize("Дома и квартиры", 28);
    }

    @ParameterizedTest
    @DisplayName("check that Houses And Homes dropdown list have values from parameters")
    @CsvSource(value = {"Минск", "Гродно", "2-комнатные", "3-комнатные", "$"})
    public void housesAndHomesDropdownListContainsValues(String value){
        onlinerHeaderPage
                .moveToLinkOnHeaderPage("Дома и квартиры")
                .assertThatDropdownListContainsValue("Дома и квартиры", value);
    }
}