package org.acsapatkedd.youtubetest.stepdefinitions;

import io.cucumber.java.en.Then;
import org.acsapatkedd.youtubetest.config.TestConfig;
import org.acsapatkedd.youtubetest.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfig.class)
public class YouTubeHomeStepDefs {

    @Autowired
    private HomePage homePage;

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.navigateToHomePage();
    }

    @And ("hovered over the cookie popup")
    public void hoveredOverTheCookiePopup(){
        homePage.hoverOverTheCookiePopup();
    }

    @And ("scrolled to the bottom of the cookie popup")
    public void scrolledToTheBottomOfTheCookiePopup(){
        homePage.scrollToTheBottomOfTHeCookiePopup();
    }

    @And ("the ELFOGADOM button is clicked")
    public void elfogadomButtonIsClicked() {
        homePage.clickElfogadomButton();
    }

    @Given ("the search field is clicked")
    public void searchFieldIsClicked() {
        homePage.clickInSearchField();
    }

    @When ("search field is filled with {string}")
    public void searchFieldIsFilledWith(final String content){
        homePage.fillSearchFieldWith(content);
    }

    @And ("magnifying glass is clicked")
    public void magnifyingGlassIsClicked(){
        homePage.clickMagnifyingGlass();
    }

    @Then("the url of the page should be {string}")
    public void titleOfPageShouldBe(final String url){
        homePage.titleShouldBe(url);
    }
}
