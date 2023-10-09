package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExamTipsObjects extends DriverBase {

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

    @FindBy(xpath = "//*[text()='EXAM TIPS']")
    private WebElement examTips;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[2]/div/div/div/div/a[1]/div/p")
    private WebElement  MRCEMPRIMARYTIPS;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[2]/div/div/div/div/a[2]/div/p")
    private WebElement  MRCEMINTERMEDIATESBATIPS;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[2]/div/div/div/div/a[3]/div/p")
    private WebElement  MRCEMO0SCETIPS;


    public ExamTipsObjects() {
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

    public void SelectsExamTipsDropdown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(examTips).perform();
    }

    public void dropdownListWillBeShown() {

        Assert.assertTrue(MRCEMPRIMARYTIPS.isDisplayed() && MRCEMINTERMEDIATESBATIPS.isDisplayed() && MRCEMO0SCETIPS.isDisplayed());
    }

    public void SelectsAboutTheExamDropdownAndSelectsMRCEMPRIMARYTIPSOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(examTips).perform();
        builder.moveToElement(MRCEMPRIMARYTIPS).perform();
        builder.click().build().perform();
    }

    public void mrcemPRIMARYTIPSScreenWillBeDisplayed() throws IOException {
        Assert.assertEquals("https://mrcemexamprep.net/mrcem-primary-tips", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-primary-tips").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }

    public void SelectsAboutTheExamDropdownAndSelectsMRCEMINTERMEDIATESBATIPSOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(examTips).perform();
        builder.moveToElement(MRCEMINTERMEDIATESBATIPS).perform();
        builder.click().build().perform();
    }

    public void mrcemINTERMEDIATESBATIPSScreenWillBeDisplayed()throws IOException {
        Assert.assertEquals("https://mrcemexamprep.net/mrcem-intermediate-sba-tips", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-intermediate-sba-tips").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }

    public void SelectsAboutTheExamDropdownAndSelectsMRCEMOSCETIPSOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(examTips).perform();
        builder.moveToElement(MRCEMO0SCETIPS).perform();
        builder.click().build().perform();
    }

    public void mrcemOSCETIPSScreenWillBeDisplayed() throws IOException{
        Assert.assertEquals("https://mrcemexamprep.net/mrcem-osce-tips", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-osce-tips").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);

    }
}
