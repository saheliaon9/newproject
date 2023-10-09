package com.test.minivet.objects;

import com.test.minivet.utils.WebDriverUtils;
import io.cucumber.java8.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.test.minivet.utils.DriverBase;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChangeAnswerAndPauseExamInTimeMockObjects extends DriverBase{
    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[text()='Mock Exam ']")
    private WebElement mockExam;

    @FindBy(xpath = "//*[@href=\"/quiz/timedmock\"]//*[text()='Timed Mock']")
    private WebElement timeMock;

    @FindBy(xpath = "//*[text()='Start Exam ']")
    private WebElement startExam;

    @FindBy(xpath = "//*[text()='Change Your Answer']")
    private WebElement chgeAnswerBtn;

    @FindBy(xpath = "//button[text()=' Next ']")
    private WebElement nextBtn;

    @FindBy(xpath = "//*[text()='Pause Exam']")
    private WebElement pauseExamBtn;

    @FindBy(xpath = "//*[text()=' Dashboard ']")
    private WebElement dashboardScreen;




    public ChangeAnswerAndPauseExamInTimeMockObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }

    public void selectMockExam() {
        wait.until(ExpectedConditions.elementToBeClickable(mockExam));
        mockExam.click();
    }

    public void SelectTimeMocK() {
        wait.until(ExpectedConditions.elementToBeClickable(mockExam));
        timeMock.click();
    }

    public void selectStartExam() {
        wait.until(ExpectedConditions.elementToBeClickable(mockExam));
        startExam.click();

    }

    public void selectChangeAnswerBtn() {

        List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/mockmultichoice-option['i']/div/div/div/div[2]"));

        int size = options.size();

        int randomNumber = ThreadLocalRandom.current().nextInt(1, size);

        options.get(randomNumber).click();

        wait.until(ExpectedConditions.elementToBeClickable(chgeAnswerBtn));

        chgeAnswerBtn.click();

    }

    public void userIsAllowedToSelectOption() {

        List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/mockmultichoice-option['i']/div/div/div/div[2]"));

        int size = options.size();

        int randomNumber = ThreadLocalRandom.current().nextInt(1, size);

        options.get(randomNumber).click();
    }

    public void SelectPauseExamButton() {

        for (int i = 1; i<=10; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (nextBtn.isDisplayed()) {
                List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/mockmultichoice-option['i']/div/div/div/div[2]"));

                int size = options.size();

                int randomNumber = ThreadLocalRandom.current().nextInt(1, size);

                options.get(randomNumber).click();
                wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
                nextBtn.click();
            }
        }
    }

    public void dashboardScreenWillBeDisplayed() {
        wait.until(ExpectedConditions.elementToBeClickable(pauseExamBtn));
        pauseExamBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(mockExam));

        Assert.assertTrue(dashboardScreen.isDisplayed());
    }
}
