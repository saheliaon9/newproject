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

public class SampleQuestionsObjects extends DriverBase {

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

    @FindBy(xpath = "//*[text()='SAMPLE QUESTIONS']")
    private WebElement sampleQuestions;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[6]/div/div/div/div/a[1]/div/p")
    private WebElement MRCEMPRIMARY;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[6]/div/div/div/div/a[2]/div/p")
    private WebElement MRCEMINTERMEDIATESBA;


    public SampleQuestionsObjects() {
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

    public void SelectsSampleQuestionsDropdown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(sampleQuestions).perform();
    }

    public void DropdownListWillBeShown() {

        Assert.assertTrue(MRCEMPRIMARY.isDisplayed() && MRCEMINTERMEDIATESBA.isDisplayed());
    }

    public void SelectsSampleQuestionsDropdownAndSelectsMRCEMPRIMARYOption() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions builder = new Actions(getDriver());
        builder.moveToElement(sampleQuestions).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        builder.moveToElement(MRCEMPRIMARY).perform();
        builder.click().build().perform();
    }

    public void mrcemPRIMARYScreenWillBeDisplayed()throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("url -----------  " + getDriver().getCurrentUrl());
        Assert.assertEquals("https://mrcemexamprep.net/sample-mrcem-primary", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/sample-mrcem-primary").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }


    public void SelectsSampleQuestionsDropdownAndSelectsMRCEMOverviewOption() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(sampleQuestions).perform();
        builder.moveToElement(MRCEMINTERMEDIATESBA).perform();
        builder.click().build().perform();
    }

    public void mrcemINTERMEDIATESBAScreenWillBeDisplayed()throws IOException  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("url -----------  " + getDriver().getCurrentUrl());

        Assert.assertEquals("https://mrcemexamprep.net/sample-mrcem-intermediate", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/sample-mrcem-intermediate").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }
}
