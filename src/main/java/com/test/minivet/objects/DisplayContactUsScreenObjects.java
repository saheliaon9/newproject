package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DisplayContactUsScreenObjects extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@href='/home']//*[local-name()='svg']")
    private WebElement home;

    @FindBy(xpath = "//*[text()=' CONTACT US ']")
    private WebElement contactUs;

    @FindBy(xpath = "//*[text()='Your Name']/parent::label/input")
    private WebElement name;

    @FindBy(xpath = "//*[text()='Your Email']/parent::label/input")
    private WebElement email;

    @FindBy(xpath = "//*[text()='Your Question']/parent::label/textarea")
    private WebElement question;

    @FindBy(xpath = "//*[text()='SUBMIT']")
    private WebElement submitBtn;

    @FindBy(xpath = "//*[text()=' * Question is required. ']")
    private WebElement questionValidationMsg;

    @FindBy(xpath = "//*[text()=' * This field is required. ']")
    private WebElement captchaValidationMsg;

    public DisplayContactUsScreenObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsiteAndSelectHomeIcon(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
        wait.until(ExpectedConditions.visibilityOf(home));
        home.click();
    }

    public void SelectsContactUsTab() {
        wait.until(ExpectedConditions.visibilityOf(contactUs));

        contactUs.click();
    }

    public void contactUsScreenWillBeDisplayed() {
        Assert.assertTrue(name.isDisplayed() && email.isDisplayed());
        Assert.assertTrue(question.isEnabled() && submitBtn.isEnabled());

    }

    public void selectsSubmitButtonWithoutEnteringAnyDataInAnyField() {
        wait.until(ExpectedConditions.visibilityOf(submitBtn));

        submitBtn.click();
    }

    public void validationMessageWillBeShownForQuestionField() {
        Assert.assertTrue(questionValidationMsg.isDisplayed() && captchaValidationMsg.isDisplayed());
    }
}
