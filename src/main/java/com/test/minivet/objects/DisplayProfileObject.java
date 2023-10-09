package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.apache.commons.compress.compressors.lz4.XXHash32;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DisplayProfileObject extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@id= 'user-menu-button']")
    private WebElement userMenu;

    @FindBy(xpath = "//*[text()= ' Your Profile']//*[local-name()= 'path']")
    private WebElement yourProfile;

    @FindBy(xpath = "//*[text()= ' Change Password ']")
    private WebElement changePassword;

    @FindBy(xpath = "//*[text()= ' Order ']")
    private WebElement order;

    @FindBy(xpath = "//*[text()= 'Name:']/parent::div/span")
    private WebElement name;

    @FindBy(xpath = "//*[text()= 'Email:']/parent::div/span[2]")
    private WebElement email;

    @FindBy(xpath = "//*[text()= 'Role']/parent::div//div/span")
    private WebElement role;

    @FindBy(xpath = "//*[text()= 'Expires on']/parent::div/div[2]/span")
    private WebElement expiresOn;

    @FindBy(xpath = "//*[text()=' Extend Subscription ']")
    private WebElement extendSubscriptionBtn;

    @FindBy(xpath = "//*[text()=' Reset Account ']")
    private WebElement resetAccount;

    public DisplayProfileObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }


    public void selectProfileOption() {
        wait.until(ExpectedConditions.visibilityOf(userMenu));

        Actions builder = new Actions(getDriver());
        builder.moveToElement(userMenu).perform();
        builder.moveToElement(yourProfile).perform();
        builder.click().build().perform();

    }

    public void profileDetailsWillBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(changePassword));
        Assert.assertTrue(name.isDisplayed() && email.isDisplayed() && role.isDisplayed() && expiresOn.isDisplayed());
    }

    public void changePasswordAndOrderWillBeDisplayed() {
        Assert.assertTrue(changePassword.isDisplayed() && order.isDisplayed() && extendSubscriptionBtn.isEnabled() && resetAccount.isEnabled());

    }
}
