package org.acsapatkedd.youtubetest.pageobjects;

import org.awaitility.Awaitility;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import org.acsapatkedd.youtubetest.factory.WebDriverFactory;

@Component
public class HomePage extends CommonPageObject {
    private static final String HOME_PAGE_URL = "https://www.youtube.com/";

    @FindBy(xpath = "//*[@id=\"dialog\"]")
    private WebElement cookiePopup;

    @FindBy(xpath = "//ytd-button-renderer[2]/a/tp-yt-paper-button")
    private WebElement acceptButton;

    @FindBy(xpath = "//input[@id=\"search\"]")
    private WebElement searchField;

    @FindBy(xpath = "//ytd-searchbox/button")
    private WebElement magnifyingGlass;

    public HomePage(final WebDriverFactory factory) {
        super(factory);
    }

    public void navigateToHomePage() {
        navigateToUrl(HOME_PAGE_URL);
    }

    public void hoverOverTheCookiePopup() {
        Actions actions = new Actions(getWebDriverFromFactory());
        actions.moveToElement(cookiePopup);
        actions.build().perform();
    }

    public void scrollToTheBottomOfTHeCookiePopup() {
        scrollTillElementIsVisible(acceptButton);
    }

    public void clickElfogadomButton() {
        clickWithJsExecutor(acceptButton);
    }

    public void fillSearchFieldWith(String content) {
        searchField.sendKeys(content);
    }

    public void clickInSearchField() {
        clickWithJsExecutor(searchField);
    }

    public void clickMagnifyingGlass() {
        clickWithJsExecutor(magnifyingGlass);
    }

    public void titleShouldBe(String title) {
        Assert.assertEquals(title, getWebDriverFromFactory().getTitle());
    }
}
