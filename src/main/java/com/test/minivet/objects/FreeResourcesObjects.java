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
import java.util.ArrayList;

public class FreeResourcesObjects extends DriverBase {

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

    @FindBy(xpath = "//*[text()='FREE RESOURCES']")
    private WebElement FREERESOURCES;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[7]/div/div/div/div/a[1]/div/p")
    private WebElement freeEcgGuide;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[7]/div/div/div/div/a[2]/div/p")
    private WebElement articles;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[7]/div/div/div/div/a[3]/div/p")
    private WebElement CASEOFTHEMONTH;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/nav/navitems[7]/div/div/div/div/a[4]/div/p")
    private WebElement EXAMTIPS;

    public FreeResourcesObjects() {
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

    public void SelectsFreeResourcesDropdown() {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(FREERESOURCES).perform();
    }

    public void DropdownListWillBeShown() {

        Assert.assertTrue(freeEcgGuide.isDisplayed() && articles.isDisplayed() && CASEOFTHEMONTH.isDisplayed() && EXAMTIPS.isDisplayed());
    }

    public void SelectsFreeResourcesDropdownAndSelectsFreeECGGuideOption() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions builder = new Actions(getDriver());
        builder.moveToElement(FREERESOURCES).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        builder.moveToElement(freeEcgGuide).perform();
        builder.click().build().perform();
    }

    public void freeECGGuideScreenWillBeDisplayed() throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(1));
        System.out.println("url -----------  " + getDriver().getCurrentUrl());
        Assert.assertEquals("https://www.medicalexamprep.co.uk/ecg-guide/", getDriver().getCurrentUrl());


        HttpURLConnection c=(HttpURLConnection)new URL("https://www.medicalexamprep.co.uk/ecg-guide/").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }

    public void SelectsFreeResourcesDropdownAndSelectsArticlesOption() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions builder = new Actions(getDriver());
        builder.moveToElement(FREERESOURCES).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        builder.moveToElement(articles).perform();
        builder.click().build().perform();
    }

    public void articlesScreenWillBeDisplayed() throws IOException{
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(1));
        System.out.println("url -----------  " + getDriver().getCurrentUrl());
        Assert.assertEquals("https://www.medicalexamprep.co.uk/blog/", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://www.medicalexamprep.co.uk/blog/").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);

    }

    public void SelectsFreeResourcesDropdownAndSelectsCaseOfTheMonthOption() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions builder = new Actions(getDriver());
        builder.moveToElement(FREERESOURCES).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        builder.moveToElement(CASEOFTHEMONTH).perform();
        builder.click().build().perform();
    }

    public void caseOfTheMonthScreenWillBeDisplayed()throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(1));
        System.out.println("url -----------  " + getDriver().getCurrentUrl());
        Assert.assertEquals("https://www.medicalexamprep.co.uk/case-of-the-month/", getDriver().getCurrentUrl());


        HttpURLConnection c=(HttpURLConnection)new URL("https://www.medicalexamprep.co.uk/case-of-the-month/").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }

    public void SelectsFreeResourcesDropdownAndSelectsExamTipsOption() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions builder = new Actions(getDriver());
        builder.moveToElement(FREERESOURCES).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        builder.moveToElement(EXAMTIPS).perform();
        builder.click().build().perform();
    }

    public void examTipsScreenWillBeDisplayed() throws IOException{
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(1));
        System.out.println("url -----------  " + getDriver().getCurrentUrl());
        Assert.assertEquals("https://www.medicalexamprep.co.uk/exam-tips/", getDriver().getCurrentUrl());


        HttpURLConnection c=(HttpURLConnection)new URL("https://www.medicalexamprep.co.uk/exam-tips/").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }


}
