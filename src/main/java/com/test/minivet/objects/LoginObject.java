package com.test.minivet.objects;

import com.test.minivet.utils.Constants;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginObject extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[text()= ' Dashboard ']")
    private WebElement dasboard;

    @FindBy(xpath = "//*[text()= ' Username/Email is not registered with us ']")
    private WebElement invalidUsernameErrormsg;

    @FindBy(xpath = "//*[text()= ' Username/Email is not registered with us ']")
    private WebElement invalidpasswordErrormsg;

    @FindBy(xpath = "//*[text()= '* Username/Email is required']")
    private WebElement usernameValidationMsg;

    @FindBy(xpath = "//*[text()= ' * Password is required']")
    private WebElement passwordValidationMsg;
    public LoginObject() {
        PageFactory.initElements(getDriver(), this);
    }



    public void selectLoginButon() {
        loginBtn.click();
    }


    public void enterlogincredentialsAndSelectSignInBtn(String username, String password) {
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void mrcemexamprepDashboardScreenWillOpen() {

        wait.until(ExpectedConditions.visibilityOf(dasboard));
        Assert.assertTrue(dasboard.isDisplayed());
    }

    public void enterInvalidUsernameandpassword() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        userName.sendKeys("prosen13@gmail.com");
        passWord.sendKeys("#Yome123");
    }

    public void selectSignButon() {
        signinButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void errorMessageWillShowForEnteringInvalidUsername() {

        wait.until(ExpectedConditions.visibilityOf(invalidUsernameErrormsg));
        Assert.assertTrue(invalidUsernameErrormsg.isDisplayed());
    }


    public void enterValidUsernameAndInvalidPassword() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        userName.sendKeys("prosen13@gmail.com");
        passWord.sendKeys("#Yome12");
    }

    public void errorMessageWillShowSayingPasswordIsNotValid() {

        wait.until(ExpectedConditions.visibilityOf(invalidpasswordErrormsg));
        Assert.assertTrue(invalidUsernameErrormsg.isDisplayed());
    }

    public void checkValidationMesssageForUserNameAndPassword() {
        Assert.assertTrue(usernameValidationMsg.isDisplayed() && passwordValidationMsg.isDisplayed());
    }
}
