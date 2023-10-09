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
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SaveAndCompleteSubjectExamObjects  extends DriverBase {

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

    @FindBy(xpath = "//*[text()='All Microbiology']//parent::a")
    private WebElement allMicrobiologyBtn;

    @FindBy(xpath = "//button[text()=' Next ']")
    private WebElement nextBtn;

    @FindBy(xpath = "//*[@href=\"/quiz\"]/parent::li/a//*[local-name()='svg']")
    private WebElement dashboardIcon;

    @FindBy(xpath = "//*[@href=\"/quiz/saved-exam\"]/parent::div//*[text()='Continue']")
    private WebElement continueBtn1;

    @FindBy(xpath = "//*[@href='/quiz/completed-exam'][text()='Continue']")
    private WebElement continueBtn2;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[1]/a[1]")
    private WebElement subjectExamBtn1;

    @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[2]/div[1]/a[1]")
    private WebElement subjectExamBtn2;

    @FindBy(xpath = "//*[text()=' Submit Exam ']/parent::div/parent::mobile-question-index/div[3]/button")
    private WebElement submitBtn;
    public SaveAndCompleteSubjectExamObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsiteAndSelectStartBySpecificSubjectExam(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(testBySubject));
        testBySubject.click();


        wait.until(ExpectedConditions.elementToBeClickable(startSubjectSpecificTest));
        startSubjectSpecificTest.click();


        wait.until(ExpectedConditions.elementToBeClickable(PlayBTn));
        PlayBTn.click();

    }

    public void SelectsAnyTileInSubjectExamScreen() {
        wait.until(ExpectedConditions.elementToBeClickable(allMicrobiologyBtn));
        allMicrobiologyBtn.click();
    }

    public void attemptFewQuestions() {

        for (int i = 1; i <= 2; i++) {
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

    public void SelectDashboardButtonAndSelectsContinueButtonOnSaveExamTile() {

        dashboardIcon.click();
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn1));

        continueBtn1.click();
    }

    public void thatSubjectWillBeShownInSavedExamScreen() {
        wait.until(ExpectedConditions.elementToBeClickable(subjectExamBtn1));
        subjectExamBtn1.click();

        List<WebElement> subject = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[2]"));

        for (WebElement element : subject) {
            System.out.println("Subject is ----------- " + element.getText());

            if(element.getText().equals("Microbiology")){
                System.out.println("Subject Matched------------");
            }
        }
    }

    public void attemptQuestions() {
        for (int i = 1; i <= 2; i++) {
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

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("arguments[0].click();",submitBtn );



    }
    public void SelectDashboardButtonAndSelectsContinueButtonOnCompleteExamTile() {
        wait.until(ExpectedConditions.elementToBeClickable(dashboardIcon));
        dashboardIcon.click();

        wait.until(ExpectedConditions.elementToBeClickable(continueBtn2));
        continueBtn2.click();
    }

    public void thatSubjectWillBeShownInCompleteExamScreen() {
        wait.until(ExpectedConditions.elementToBeClickable(subjectExamBtn2));
        subjectExamBtn2.click();

        List<WebElement> subject = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[2]/div[2]/table-data/div/table/tbody/tr['i']/td[2]"));

        for (WebElement element : subject) {
            System.out.println("Subject is ----------- " + element.getText());

            if(element.getText().equals("Microbiology")){
                System.out.println("Subject Matched------------");
            }
        }
    }
}

