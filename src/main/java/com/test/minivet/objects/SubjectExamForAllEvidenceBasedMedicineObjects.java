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

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SubjectExamForAllEvidenceBasedMedicineObjects extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[text()=' Test By Subject ']")
    private WebElement testBySubject;

    @FindBy(xpath = "//*[@href=\"/quiz/subject-exam\"]//*[text()='Start Subject-Specific Test']")
    private WebElement startSubjectSpecificTest;

    @FindBy(xpath = "//*[@href= '/quiz/subject-exam/mrcem-primary/1']//*[local-name()='svg']")
    private WebElement PlayBTn;

    @FindBy(xpath = "//*[text()='All Evidence Based Medicine']//parent::a")
    private WebElement allEvidenceBasedMedicineBtn;

    @FindBy(xpath = "//button[text()=' Next ']")
    private WebElement nextBtn;

    @FindBy(xpath = "//*[text()=' Submit Exam ']/parent::div/parent::mobile-question-index/div[3]/button")
    private WebElement submitBtn;
    @FindBy(xpath = "//html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[4]/a")
    private WebElement goTodashboardBtn;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[2]/div/div[1]/div/div[2]")
    private WebElement score;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[2]/div/div[2]/div/div[2]")
    private WebElement attempts;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[2]/div/div[3]/div/div[2]")
    private WebElement speed;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[2]/div/div[4]/div/div[2]")
    private WebElement accuracy;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[3]/doughnutchart/div/canvas")
    private WebElement chart;

    @FindBy(xpath = "//*[@id=\"logged-menu\"]/ul/li[2]/a//*[local-name()='svg']")
    private WebElement dashboardIcon;

    public SubjectExamForAllEvidenceBasedMedicineObjects()

    {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }

    public void selectTestBySubject() {
        wait.until(ExpectedConditions.elementToBeClickable(testBySubject));
        testBySubject.click();
    }

    public void SelectStartSubjectSpecificTest() {
        wait.until(ExpectedConditions.elementToBeClickable(startSubjectSpecificTest));
        startSubjectSpecificTest.click();
    }

    public void selectMRCEMPrimary() {
        wait.until(ExpectedConditions.elementToBeClickable(PlayBTn));
        PlayBTn.click();
    }

    public void selectAllEvidenceBasedMedicineButton() {
        wait.until(ExpectedConditions.elementToBeClickable(allEvidenceBasedMedicineBtn));
        allEvidenceBasedMedicineBtn.click();
    }

    public void AttemptAllQuestions() {
        List<WebElement> n = getDriver().findElements(By.xpath("/html/body/app-root/app-exampage/div/div/main/div/div[1]/mobile-question-index/div[2]/div['i']"));
        int totalQuestions = n.size();

        System.out.println("Total no of questions -------------- " + totalQuestions);

        for (int i = 1; i <= totalQuestions-1 ; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (nextBtn.isDisplayed()) {

                List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/multichoice-option['i']"));

                int size = options.size();

                int randomNumber = ThreadLocalRandom.current().nextInt(1, size);

                options.get(randomNumber).click();
                wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
                nextBtn.click();
            }

        }
    }

    public void clickSubmitBtn() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/multichoice-option['i']"));

        int size = options.size();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, size);
        options.get(randomNumber).click();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("arguments[0].click();",submitBtn );


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public void continueExamAndDashboardBtnIsDisplayed () {


        Assert.assertTrue(goTodashboardBtn.isDisplayed());

        Assert.assertTrue(score.isDisplayed() && attempts.isDisplayed() && speed.isDisplayed() && accuracy.isDisplayed() && chart.isDisplayed());

    }
}
