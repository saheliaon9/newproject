package com.test.minivet.objects;

import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.test.minivet.utils.DriverBase;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SavedExamsObjects extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@href='/quiz/saved-exam']")
    private WebElement continueBtn;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[1]/a[1]")
    private WebElement subjectExamBtn;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[1]/a[2]")
    private WebElement mockExamBtn;

    public SavedExamsObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }

    public void selectContinueBtnOnSavedExamsTile() {

        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }

    public void checkListOfSubjectExams() {
        wait.until(ExpectedConditions.elementToBeClickable(subjectExamBtn));
        subjectExamBtn.click();

        List <WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr"));
        int totalRow = row.size();
        System.out.println("Total number of rows ------------ " + totalRow);

        List<WebElement> date = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[1]"));
        List<WebElement> subject = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[2]"));
        List<WebElement> questions = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[3]"));
        List<WebElement> correct = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[4]"));
        List<WebElement> incorrect = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[5]"));
        List<WebElement> remaining = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[6]"));
        List<WebElement> actionBtn = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[7]//*[local-name()='svg']"));

        for(WebElement webelement: date){
            String d = webelement.getText();
            Assert.assertNotNull(d);
        }

        for(WebElement webelement: subject){
            String s = webelement.getText();
            Assert.assertNotNull(s);
        }

        for(WebElement webelement: questions){
            String s = webelement.getText();
            Assert.assertNotNull(s);
        }

        for(WebElement webelement: correct){
            String c = webelement.getText();
            Assert.assertNotNull(c);
        }

        for(WebElement webelement: incorrect){
            String i = webelement.getText();
            Assert.assertNotNull(i);
        }

        for(WebElement webelement: remaining){
            String i = webelement.getText();
            Assert.assertNotNull(i);
        }

        for(WebElement a: actionBtn){
            Assert.assertTrue(a.isDisplayed());
        }

    }

    public void checkListOfMockExams() {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        wait.until(ExpectedConditions.elementToBeClickable(mockExamBtn));
        mockExamBtn.click();

        List <WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr"));
        int totalRow = row.size();
        System.out.println("Total number of rows ------------ " + totalRow);

        List<WebElement> date = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[1]"));
        List<WebElement> questions = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[2]"));
        List<WebElement> correct = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[3]"));
        List<WebElement> incorrect = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[4]"));
        List<WebElement> remaining = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[5]"));
        List<WebElement> actionBtn = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[6]//*[local-name()='svg']"));


        for(WebElement webelement: date){
            String d = webelement.getText();
            Assert.assertNotNull(d);
        }


        for(WebElement webelement: questions){
            String s = webelement.getText();
            Assert.assertNotNull(s);
        }

        for(WebElement webelement: correct){
            String c = webelement.getText();
            Assert.assertNotNull(c);
        }

        for(WebElement webelement: incorrect){
            String i = webelement.getText();
            Assert.assertNotNull(i);
        }

        for(WebElement webelement: remaining){
            String i = webelement.getText();
            Assert.assertNotNull(i);
        }

        for(WebElement a: actionBtn){
            Assert.assertTrue(a.isDisplayed());
        }

    }
}