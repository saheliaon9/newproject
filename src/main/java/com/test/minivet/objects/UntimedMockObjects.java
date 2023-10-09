package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UntimedMockObjects extends DriverBase {

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

    @FindBy(xpath = "//*[@href='/quiz/untimedmock']//*[text()='Untimed Mock']")
    private WebElement untimeMock;

    @FindBy(xpath = "//*[text()='Start Exam ']")
    private WebElement startExam;

    @FindBy(xpath = "//button[text()=' Next ']")
    private WebElement nextBtn;

    @FindBy(xpath = "/html/body/app-root/app-test/app-exam/div/div/main/div/div[3]/app-question-index/div/div/div/div[4]/button")
    private WebElement submitBtn;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[4]/a")
    private WebElement goToDashboardBtn;

    @FindBy(xpath = "//*[@href=\"/quiz/completed-exam\"][text()='Continue']")
    private WebElement continueBtnOnCompletedExamTile;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[2]/div[1]/a[2]")
    private WebElement mockExamButton;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[2]/div[2]/table-data/div/table/tbody/tr[2]/td[2]")
    private WebElement score;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[2]/div[2]/table-data/div/table/tbody/tr[2]/td[3]")
    private WebElement correctQuestion;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[2]/div[2]/table-data/div/table/tbody/tr[2]/td[4]")
    private WebElement incorrectQuestion;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[2]/div[2]/table-data/div/table/tbody/tr[2]/td[5]//*[local-name()='svg']")
    private WebElement eyeBtn;
    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[2]/div/div[1]/div/div[2]")
    private WebElement totalscore;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[2]/div/div[2]/div/div[2]")
    private WebElement attempts;
    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[2]/div/div[4]/div/div[2]")
    private WebElement accuracy;

    public UntimedMockObjects() {
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

    public void SelectUntimeMocK() {
        wait.until(ExpectedConditions.elementToBeClickable(mockExam));
        untimeMock.click();
    }

    public void selectStartExam() {
        wait.until(ExpectedConditions.elementToBeClickable(mockExam));
        startExam.click();

    }

    public void completeMockExam() {
        List<WebElement> AllQuestions = getDriver().findElements(By.xpath("/html/body/app-root/app-test/app-exam/div/div/main/div/div[3]/app-question-index/div/div/div/div[3]/div['i']/div"));
        int totalQuestions = AllQuestions.size();
        System.out.println("Total no of questions -------------- " + totalQuestions);

        for (int i = 1; i<=totalQuestions - 1; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (nextBtn.isDisplayed()) {
                List<WebElement> options = getDriver().findElements(By.xpath("//*[@id='question-opt']/div[2]/multichoice-option['i']/div/div/div/div[2]"));

                int size = options.size();

                int randomNumber = ThreadLocalRandom.current().nextInt(1, size);

                options.get(randomNumber).click();
                wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
                nextBtn.click();
            }
        }

    }

    public void hitSubmitButton() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> options = getDriver().findElements(By.xpath("//*[@id='question-opt']/div[2]/multichoice-option['i']/div/div/div/div[2]"));
        int size = options.size();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, size);
        options.get(randomNumber).click();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("arguments[0].click();",submitBtn);


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        goToDashboardBtn.click();
    }

    public void completeMockExamRecordWillBeShownInCompleteExamScreen() {
        wait.until(ExpectedConditions.elementToBeClickable(mockExam));
        continueBtnOnCompletedExamTile.click();
        wait.until(ExpectedConditions.elementToBeClickable(mockExamButton));
        mockExamButton.click();

        int c = Integer.parseInt(correctQuestion.getText());
        System.out.println("Total no of correct questions -------------- " + c);

        int i = Integer.parseInt(incorrectQuestion.getText());
        System.out.println("Total no of incorrect questions -------------- " + i);

        int total = c + i;
        System.out.println("Total questions -------------- " + total);

        Assert.assertEquals(total,180);


    }

    public void onselectingEyeButtonQuizCompletedScreenWillBeShown() {
        int c = Integer.parseInt(correctQuestion.getText());
        int i = Integer.parseInt(incorrectQuestion.getText());
        int total = c + i;
        wait.until(ExpectedConditions.elementToBeClickable(eyeBtn));
        eyeBtn.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(1));
        System.out.println("Page title of new tab: " + getDriver().getTitle());

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


        int ts = Integer.parseInt(totalscore.getText());
        System.out.println("Total score -------------- " + ts);

        int a = Integer.parseInt(attempts.getText());
        System.out.println("Total questions attempts -------------- " + a);

        Assert.assertEquals(total,a);
        Assert.assertEquals(ts,c);




}
}
