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

public class CompleteSaveSubjectExamObjects extends DriverBase {

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

   @FindBy(xpath = "/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr[2]/td[7]//*[local-name()='svg']")
   private WebElement actionBtn;

    @FindBy(xpath = "//button[text()=' Next ']")
    private WebElement nextBtn;

    @FindBy(xpath = "/html/body/app-root/app-exampage/div/div/main/div/div[3]/app-question-index/div/div/div/div[4]/button")
    private WebElement submitBtn;

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

    @FindBy(xpath = "//*[text()='Completed Exams ']")
    private WebElement completedExam;

    public CompleteSaveSubjectExamObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }

    public void selectContinueBtnOnSavedExamTile() {

        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }

    public void selectSubjectExamBTn() {
        wait.until(ExpectedConditions.elementToBeClickable(subjectExamBtn));
        subjectExamBtn.click();
    }

    public void selectActionBtnAndGoToNextTab() {
        wait.until(ExpectedConditions.elementToBeClickable(actionBtn));
        actionBtn.click();
        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(1));
    }

    public void attemptAllquestions() {
        getDriver().navigate().refresh();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> AllQuestions = getDriver().findElements(By.xpath("/html/body/app-root/app-exampage/div/div/main/div/div[3]/app-question-index/div/div/div/div[3]/div['i']/div[1]"));
        int totalQuestions = AllQuestions.size();
        System.out.println("Total no of questions -------------- " + totalQuestions);

        for (int i = 1; i<= totalQuestions- 1; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (nextBtn.isDisplayed()) {
                List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/multichoice-option['i']"));

                int size = options.size();
                System.out.println(" size -------------- " + size);

                int randomNumber = ThreadLocalRandom.current().nextInt(0, size);

                options.get(randomNumber).click();
                wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
                nextBtn.click();
            }
        }
    }

    public void hitSubmitBtn() {
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
        js.executeScript("arguments[0].click();",submitBtn);


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void resultSectionWillBedisplayed() {

        Assert.assertTrue(score.isDisplayed() && attempts.isDisplayed() && speed.isDisplayed() && accuracy.isDisplayed() && chart.isDisplayed());
    }

    public void inSavedExamScreenThatSubjectWillNotBeShownAsitIsCompleted() {

        ArrayList<String> newTb = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTb.get(0));

        wait.until(ExpectedConditions.elementToBeClickable(subjectExamBtn));
        subjectExamBtn.click();

        List <WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr"));
        int totalRow = row.size();


      String date = getDriver().findElement(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[1]")).getText();
      System.out.println("Date is----- "+ date);
        String  subject = getDriver().findElement(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr['i']/td[2]")).getText();
        System.out.println("subject is----- "+ subject);

        getDriver().navigate().refresh();
        List <WebElement> r = getDriver().findElements(By.xpath("/html/body/app-root/app-saved-exam-view/div/div/main/div[2]/div/div/div/div/div[1]/div[2]/table-data/div/table/tbody/tr"));
        int actualRow = r.size();
        Assert.assertEquals(totalRow,actualRow);

//        completedExam.click();
//
//        Assert.assertTrue(date.isDisplayed());
    }

}
