package it.academy.by.hw6.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import it.academy.by.hw6.page_object.OnlinerHeaderPage;

import static it.academy.by.hw6.navigation.OpenOnlinerPage.openOnlinerHeaderPage;

public class OnlinerStepdefs {

    private static OnlinerHeaderPage headerPage = new OnlinerHeaderPage();

    @Given("the user opens Onliner website")
    public void userOpenOnlinerWebsite() {
        openOnlinerHeaderPage();
    }

    @When("the user move mouse to {string}")
    public void theUserMoveMouseTo(String value) {
        headerPage.moveToLinkOnHeaderPage(value);
    }

    @Then("dropdown list with title {string} is displayed")
    public void dropdownListWithTitleIsDisplayed(String value) {
        headerPage.assertThatDropdownListIsDisplayed(value);
    }

    @And("dropdown list with title {string} hase size {int}")
    public void dropdownListWithTitleHaseSize(String value, int value1) {
        headerPage.assertThatDropdownListHasSize(value,value1);
    }

    @And("dropdown list with title {string} contains {string}")
    public void dropdownListWithTitleContains(String value, String value1) {
        headerPage.assertThatDropdownListContainsValue(value, value1);
    }
}
