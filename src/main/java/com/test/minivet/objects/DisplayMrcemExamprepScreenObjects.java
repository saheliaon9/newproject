package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class DisplayMrcemExamprepScreenObjects extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@href=\"/mrcemprimary\"]")
    private WebElement mrcemPrimary;

    @FindBy(xpath = "//*[@href=\"/mrcemintermediate\"]")
    private WebElement mrcemIntermediate;

    @FindBy(xpath = "/html/body/app-root/app-home/navigation-bar/div/div[1]/div/div[2]/div[2]/a")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[text()='ABOUT THE EXAM']")
    private WebElement aboutTheExamBtn;

    @FindBy(xpath = "//*[text()='EXAM TIPS']")
    private WebElement examTips;

    @FindBy(xpath = "//*[text()='BUY FULL ACCESS']")
    private WebElement buyFullAccess;
    @FindBy(xpath = "//*[text()=' BOOKS ']")
    private WebElement BOOKS;

    @FindBy(xpath = "//*[text()=' TESTIMONIALS ']")
    private WebElement TESTIMONIALS;

    @FindBy(xpath = "//*[text()='SAMPLE QUESTIONS']")
    private WebElement sampleQuestions;

    @FindBy(xpath = "//*[text()='FREE RESOURCES']")
    private WebElement FREERESOURCES;

    @FindBy(xpath = "//*[text()=' CONTACT US ']")
    private WebElement contactUs;

    @FindBy(xpath = "//*[text()=' MRCEM PRIMARY FROM £30 ']")
    private WebElement MRCEMPRIMARYSUBSCRPTNBTN;

    @FindBy(xpath = "//*[text()=' MRCEM INTERMEDIATE SBA FROM £35 ']")
    private WebElement MRCEMINTERMEDIATESBABTN;

    public DisplayMrcemExamprepScreenObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void verifyMRCEMscreen() throws IOException{

        Assert.assertEquals("https://mrcemexamprep.net/", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);

        String actualTitle= getDriver().getTitle();
        System.out.println("Title: ------------------  " + actualTitle);
        Assert.assertEquals("MRCEM Exam Prep",actualTitle);

    }

    public void mrcemPrimaryAndIntermediateButtonLoginButtonWillBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(mrcemPrimary));
        Assert.assertTrue(mrcemPrimary.isDisplayed() && mrcemIntermediate.isDisplayed() && loginBtn.isDisplayed());
    }

    public void buttonsListWillBeDisplayed() {

            Assert.assertTrue(aboutTheExamBtn.isDisplayed() && examTips.isDisplayed() && buyFullAccess.isDisplayed() && BOOKS.isDisplayed() &&
                    TESTIMONIALS.isDisplayed() && FREERESOURCES.isDisplayed() && contactUs.isDisplayed() && sampleQuestions.isDisplayed());

    }
    public void subscriptionBlockIsAlsoDisplayed() {
        Assert.assertTrue(MRCEMPRIMARYSUBSCRPTNBTN.isDisplayed() && MRCEMINTERMEDIATESBABTN.isDisplayed());
    }
}
