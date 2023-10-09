package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChangePasswordObject  extends DriverBase {

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

    @FindBy(xpath = "//*[text()='Save']")
    private WebElement saveBtn;

    @FindBy(xpath = "//*[text() = ' * Old Password is required. ']")
    private WebElement oldPasswordMsg;

    @FindBy(xpath = "//*[text() = ' * New Password is required. ']")
    private WebElement npswrdMsg;

    @FindBy(xpath = "//*[text() = ' * Confirm New Password is required. ']")
    private WebElement confirmNewPasswrdValidatnMsg;

    @FindBy(xpath = "//*[text()='New Password Should be same as Password Confirmation']")
    private WebElement alertMsg;

    @FindBy(xpath = "//input[@formcontrolname=\"old_password\"]")
    private WebElement oldPassword;

    @FindBy(xpath = "//input[@formcontrolname=\"password\"]")
    private WebElement pswrd;

    @FindBy(xpath = "//input[@formcontrolname=\"password_confirmation\"]")
    private WebElement confirmpassword;

    @FindBy(xpath = "//*[text()='New Password can not be same as Old password']")
    private WebElement validatnMsg1;
    public ChangePasswordObject() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }
    public void SelectsYourProfileOptionFromUserMenu() {
        wait.until(ExpectedConditions.visibilityOf(userMenu));

        Actions builder = new Actions(getDriver());
        builder.moveToElement(userMenu).perform();
        builder.moveToElement(yourProfile).perform();
        builder.click().build().perform();
    }

    public void selectChangePasswordBtn() {

        wait.until(ExpectedConditions.visibilityOf(changePassword));
        changePassword.click();

    }

    public void selectSaveBtnWithoutEnteringDataInAnyField() {
        saveBtn.click();
    }

    public void validationMessageWillBeShownForOldNewAndReenterPassword() {
        wait.until(ExpectedConditions.visibilityOf(oldPasswordMsg));

        Assert.assertTrue(oldPasswordMsg.isDisplayed() && npswrdMsg.isDisplayed() && confirmNewPasswrdValidatnMsg.isDisplayed());
    }

    public void EnterCorrectOldPassword() {
        oldPassword.sendKeys("#Yome123");
    }

    public void EnterDifferentPasswordInNewAndConfirmPassword() {
        pswrd.sendKeys("12");
        confirmpassword.sendKeys("45");
        saveBtn.click();
    }

    public void alertWillBeShown() {
        wait.until(ExpectedConditions.visibilityOf(alertMsg));

        Assert.assertTrue(alertMsg.isDisplayed());
    }

    public void EnterInvalidOldPassword() {
        oldPassword.sendKeys("123");
    }

    public void EnterMatchingPasswordInNewAndConfirmPassword() {
        pswrd.sendKeys("12");
        confirmpassword.sendKeys("12");
        saveBtn.click();
    }

    public void allFieldsWillBecomeBlank() {
        Assert.assertEquals(oldPassword.getText(),"");
        Assert.assertEquals(pswrd.getText(),"");
        Assert.assertEquals(confirmpassword.getText(),"");
    }

    public void EnterValidOldPasswordAndEnterMatchingPasswordInNewAndConfirmPasswordAndHitSaveButton(String password) {
        oldPassword.clear();
        oldPassword.sendKeys(password);
        pswrd.sendKeys("#Yome123");
        confirmpassword.sendKeys("#Yome123");
        saveBtn.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void passwordSavedSuccessfullyMessageWillShow() {
    }

    public void inAllFieldEnterCharactersLessThanSix() {
        oldPassword.sendKeys("123");
        pswrd.sendKeys("12");
        confirmpassword.sendKeys("12");
        saveBtn.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void EnterConfirmAndNewPasswordSameAsOldPassword(String password) {
        oldPassword.clear();
        oldPassword.sendKeys(password);
        pswrd.sendKeys(password);
        confirmpassword.sendKeys(password);
        saveBtn.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void validationMessageWillBeShownForEnteringConfirmAndNewPasswordSameAsOldPassword(){

        wait.until(ExpectedConditions.visibilityOf(validatnMsg1));
        validatnMsg1.isDisplayed();
    }
}
