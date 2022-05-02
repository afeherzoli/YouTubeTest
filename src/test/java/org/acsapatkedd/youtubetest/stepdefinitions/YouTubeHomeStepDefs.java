package org.acsapatkedd.youtubetest.stepdefinitions;

import io.cucumber.java.en.Then;
import org.acsapatkedd.youtubetest.config.TestConfig;
import org.acsapatkedd.youtubetest.pageobjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.acsapatkedd.youtubetest.pageobjects.SignInPage;
import org.awaitility.Awaitility;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.time.Duration;

import static org.acsapatkedd.youtubetest.config.TestConfig.PAGE_OR_ELEMENT_LOAD_WAIT_SECONDS;

@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfig.class)
public class YouTubeHomeStepDefs {

    @Autowired
    private HomePage homePage;

    @Autowired
    private SignInPage signInPage;

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

    @When ("search field is filled with {string}")
    public void searchFieldIsFilledWith(final String content){
        homePage.fillSearchFieldWith(content);
    }

    @Given ("the search field is clicked")
    public void searchFieldIsClicked(){
        homePage.clickInSearchField();
    }

    @And ("magnifying glass is clicked")
    public void magnifyingGlassIsClicked(){
        homePage.clickMagnifyingGlass();
        homePage.waitForPageReadiness();
    }

    @Then("the title of the page should be {string}")
    public void titleOfPageShouldBe(final String title){
        homePage.titleShouldBe(title);
    }
}
