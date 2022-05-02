package org.acsapatkedd.youtubetest.hooks;

import io.cucumber.java.After;
import org.acsapatkedd.youtubetest.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    private WebDriverFactory webDriverFactory;

    @After
    public void afterScenario() {
        final WebDriver webDriver = webDriverFactory.getWebDriver();
        // for safari => webDriver.manage().getCookies().forEach(cookie -> webDriver.manage().deleteCookie(cookie));
        webDriver.manage().deleteAllCookies();
    }
}
