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

import java.net.*;

public class AboutTheExamObjects extends DriverBase {

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

    @FindBy(xpath = "//*[text()='ABOUT THE EXAM']")
    private WebElement aboutTheExamBtn;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[1]/div/div/div/div/a[1]/div/p")
    private WebElement mrcemOverview;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[1]/div/div/div/div/a[2]/div/p")
    private WebElement MRCEMprimary;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[1]/div/div/div/div/a[3]/div/p")
    private WebElement MRCEMoverviewSBA;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[1]/div/div/div/div/a[4]/div/p")
    private WebElement MRCEMosce;

    public AboutTheExamObjects() {
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

    public void selectsAboutTheExamDropdown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(aboutTheExamBtn).perform();
    }

    public void dropdownListWillBeShown() {

        Assert.assertTrue(mrcemOverview.isDisplayed() && MRCEMprimary.isDisplayed() && MRCEMoverviewSBA.isDisplayed() && MRCEMosce.isDisplayed());
    }

    public void selectsAboutTheExamDropdownAndSelectMRCEMoverviewOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(aboutTheExamBtn).perform();
        builder.moveToElement(mrcemOverview).perform();
        builder.click().build().perform();
    }

    public void mrcemOverviewScreenWillBeDisplayed()  throws IOException  {

        Assert.assertEquals("https://mrcemexamprep.net/mrcem-overview", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-overview").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }

    public void selectsAboutTheExamDropdownAndSelectsMRCEMPRIMARYOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(aboutTheExamBtn).perform();
        builder.moveToElement(MRCEMprimary).perform();
        builder.click().build().perform();
    }

    public void mrcemPRIMARYScreenWillBeDisplayed()    throws IOException  {
        Assert.assertEquals("https://mrcemexamprep.net/mrcem-primary", getDriver().getCurrentUrl());


            HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-primary").openConnection();
            c.setRequestMethod("HEAD");
            c.connect();
            int r = c.getResponseCode();
            System.out.println("Http response code: ------------------  " + r);
            Assert.assertEquals(r,200);
    }

    public void selectsAboutTheExamDropdownAndSelectsMRCEMINTERMEDIATESBAOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(aboutTheExamBtn).perform();
        builder.moveToElement(MRCEMoverviewSBA).perform();
        builder.click().build().perform();
    }

    public void mrcemINTERMEDIATESBAScreenWillBeDispalyed()  throws IOException  {
        Assert.assertEquals("https://mrcemexamprep.net/mrcem-intermediate-sba", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-intermediate-sba").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);

    }

    public void SelectsAboutTheExamDropdownAndSelectsMRCEMOSCEOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(aboutTheExamBtn).perform();
        builder.moveToElement(MRCEMosce).perform();
        builder.click().build().perform();
    }

    public void mrcemOSCEScreenWillBeDisplayed()  throws IOException  {
        Assert.assertEquals("https://mrcemexamprep.net/mrcem-osce", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-osce").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }
}
