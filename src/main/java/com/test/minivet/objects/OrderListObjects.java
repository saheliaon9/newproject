package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class OrderListObjects extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[text()= ' Order ']")
    private WebElement order;

    @FindBy(xpath = "//*[@id= 'user-menu-button']")
    private WebElement userMenu;

    @FindBy(xpath = "//*[text()= ' Your Profile']//*[local-name()= 'path']")
    private WebElement yourProfile;
    public OrderListObjects() {
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
    public void theUserSelectsOrderButton() {
        wait.until(ExpectedConditions.visibilityOf(order));
         order.click();
    }

    public void orderTableIsDisplayed() {

        List<WebElement> orderNumber = getDriver().findElements(By.xpath("/html/body/app-root/app-user-profile/div/div/div/main/div[2]/div[2]/div/div/table/tbody/tr['i']/td[1]"));
        for(WebElement element: orderNumber){
            String orderNo = element.getText();
            Assert.assertNotNull(orderNo);
        }

        List<WebElement> updated = getDriver().findElements(By.xpath("/html/body/app-root/app-user-profile/div/div/div/main/div[2]/div[2]/div/div/table/tbody/tr['i']/td[2]"));
        for(WebElement element: updated){
            String u = element.getText();
            Assert.assertNotNull(u);
        }

        List<WebElement> total = getDriver().findElements(By.xpath("/html/body/app-root/app-user-profile/div/div/div/main/div[2]/div[2]/div/div/table/tbody/tr['i']/td[3]"));
        for(WebElement element: total){
            String t = element.getText();
            Assert.assertNotNull(t);
        }

        List<WebElement> orderStatus = getDriver().findElements(By.xpath("/html/body/app-root/app-user-profile/div/div/div/main/div[2]/div[2]/div/div/table/tbody/tr['i']/td[4]"));
        for(WebElement element: orderStatus){
            String oStatus = element.getText();
            Assert.assertNotNull(oStatus);
        }
    }
}
