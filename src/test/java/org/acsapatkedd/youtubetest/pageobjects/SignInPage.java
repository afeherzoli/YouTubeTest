package org.acsapatkedd.youtubetest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import org.acsapatkedd.youtubetest.factory.WebDriverFactory;

@Component
public class SignInPage extends CommonPageObject {

    @FindBy(id = "identifierId")
    private WebElement emailInput;

    public SignInPage(final WebDriverFactory factory) {
        super(factory);
    }

    /*public void KovetkezoButtonIsClicked(){
        waitForElementToBeClickable(loginButton);
        clickWithJsExecutor(loginButton);
    }

    public void emailInputFieldIsFilledWithParameter(String content) {
    }*/
}
