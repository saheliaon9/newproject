package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class TestimonialObjects extends DriverBase {

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

    @FindBy(xpath = "//*[text()=' TESTIMONIALS ']")
    private WebElement TESTIMONIALS;

    public TestimonialObjects() {
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

    public void UserSelectsTestimonial() {

        TESTIMONIALS.click();
    }
    public void testimonialScreenWillBeDisplayed()throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("url -----------  " + getDriver().getCurrentUrl());
        Assert.assertEquals("https://mrcemexamprep.net/testimonial", getDriver().getCurrentUrl());

        HttpURLConnection c=(HttpURLConnection)new URL("https://mrcemexamprep.net/testimonial").openConnection();
        c.setRequestMethod("HEAD");
        c.connect();
        int r = c.getResponseCode();
        System.out.println("Http response code: ------------------  " + r);
        Assert.assertEquals(r,200);
    }


}
