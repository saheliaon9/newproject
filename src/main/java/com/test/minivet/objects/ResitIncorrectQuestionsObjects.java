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

public class ResitIncorrectQuestionsObjects  extends DriverBase {
    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//* [@href='/quiz/wrongquestionbysubject']//*[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//*[@href='/quiz/wrong-question-quiz/sbaq']/parent::div/a[2]//*[local-name()='svg']")
    private WebElement playBtn;

    @FindBy(xpath = "//button[text()=' Next ']")
    private WebElement nextBtn;
    @FindBy(xpath = "/html/body/app-root/app-wrongquestionexam/div/div/main/div/div[3]/app-question-index/div/div/div/div[4]/button")
    private WebElement submitBtn;

    @FindBy(xpath = "/html/body/app-root/app-examcompleted/div/div/main/div/div[3]/div/div/div[4]/a")
    private WebElement goToDashboardBtn;

    public ResitIncorrectQuestionsObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }

    public void selectContinueButtonOnResitIncorrectQuestionsTile() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }

    public void selectplaybutton() {
        wait.until(ExpectedConditions.elementToBeClickable(playBtn));
        playBtn.click();
    }




    public void displayTilesUnderResitIncorrectQuestions() {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> tiles = getDriver().findElements(By.xpath("/html/body/app-root/app-test/app-examsubjects/div/div/main/div/div/div['i']/examtype/div/a[2]/h5"));
        int noOfTiles = tiles.size();
        System.out.println("Total number of tiles --- " + noOfTiles);

        for(int i=0; i<=noOfTiles - 1 ; i++)
        {
            System.out.println( "value of i ------------- " + i + "  AND  TILE NAME ------------ " + tiles.get(i).getText());
        }
    }

    public void selectStartExamOnAnyOneTile() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> tiles = getDriver().findElements(By.xpath("/html/body/app-root/app-test/app-examsubjects/div/div/main/div/div/div['i']/examtype/div/div/a[1]"));
        int noOfTiles = tiles.size();
        List<WebElement> tilesName = getDriver().findElements(By.xpath("/html/body/app-root/app-test/app-examsubjects/div/div/main/div/div/div['i']/examtype/div/a[2]/h5"));

        int randomNumber = ThreadLocalRandom.current().nextInt(1, noOfTiles);
        System.out.println("Tile name is --------- " + tilesName.get(randomNumber).getText());
        tiles.get(randomNumber).click();
        
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void attemptAllQuestions() {
        List<WebElement> AllQuestions = getDriver().findElements(By.xpath("/html/body/app-root/app-wrongquestionexam/div/div/main/div/div[3]/app-question-index/div/div/div/div[3]/div['i']/div[1]"));
        int totalQuestions = AllQuestions.size();
        System.out.println("Total no of questions -------------- " + totalQuestions);

        for (int i = 1; i<= totalQuestions -1 ; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (nextBtn.isDisplayed()) {
                List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/multichoice-option['i']/div/div/div/div[2]"));

                int size = options.size();

                int randomNumber = ThreadLocalRandom.current().nextInt(1, size);

                options.get(randomNumber).click();
                wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
                nextBtn.click();
            }
        }

    }

    public void hitSaveButton() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> options = getDriver().findElements(By.xpath("//*[@id=\"question-opt\"]/div[2]/multichoice-option['i']/div/div/div/div[2]"));
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
    public void resultsSectionAndGoToDashboardButtonWillBeDisplayed() {
        Assert.assertTrue(goToDashboardBtn.isDisplayed());
    }
}
