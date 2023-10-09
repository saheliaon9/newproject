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
import java.net.ProtocolException;
import java.net.URL;

public class BuyFullAccessObjects  extends DriverBase {

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

    @FindBy(xpath = "//*[text()='BUY FULL ACCESS']")
    private WebElement buyFullAccess;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[3]/div/div/div/div/a[1]/div/p")
    private WebElement  MRCEMPRIMARY;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[3]/div/div/div/div/a[2]/div/p")
    private WebElement  MRCEMINTERMEDIATE;


    public BuyFullAccessObjects() {
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

    public void SelectsBuyFullAccessDropdown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(buyFullAccess).perform();
    }

    public void dropdownListWillBeShown() {

        Assert.assertTrue(MRCEMPRIMARY.isDisplayed() && MRCEMINTERMEDIATE.isDisplayed());
    }

    public void SelectsBuyFullAccessDropdownAndSelectsMRCEMPRIMARYAccessOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(buyFullAccess).perform();
        builder.moveToElement(MRCEMPRIMARY).perform();
        builder.click().build().perform();
    }

    public void mrcemPRIMARYAccessScreenWillBeDisplayed() throws IOException {
        Assert.assertEquals("https://mrcemexamprep.net/mrcemprimary", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-osce").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }

    public void SelectsBuyFullAccessDropdownAndSelectsMRCEMINTERMEDIATESBAAccessOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(buyFullAccess).perform();
        builder.moveToElement(MRCEMINTERMEDIATE).perform();
        builder.click().build().perform();
    }

    public void mrcemINTERMEDIATESBAAccessScreenWillBeDisplayed() throws IOException{
        Assert.assertEquals("https://mrcemexamprep.net/mrcemintermediate", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/mrcem-osce").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }
}
