package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class QuestionReviewObjects extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@href='/quiz/question-review'][text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//*[@id='subject']")
    private WebElement subject;

    @FindBy(xpath = "//button[text()='Apply Filters']")
    private WebElement applyFiltersBtn;

    @FindBy(xpath = "//*[@id='subject']/parent::div")
    private WebElement subjectOption;

    @FindBy(xpath = "//*[@id= 'questiontype']")
    private WebElement questionType;

    @FindBy(xpath = "//*[@id= 'type']")
    private WebElement type;


    public QuestionReviewObjects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }

    public void SelectContinueButtonOnQuestionReviewTile() {

        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }

    public void searchWithSubject() {
        wait.until(ExpectedConditions.elementToBeClickable(subject));
        subject.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> options = getDriver().findElements(By.xpath("//*[@id='subject']/parent::div/select/optgroup/option['i']"));
        int size = options.size();
        System.out.println("size of options -----------  " + size);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, size);
        options.get(randomNumber).click();
        applyFiltersBtn.click();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       String actualSubject= options.get(randomNumber).getText();

        String name[] = actualSubject.split("--");

        String actualSubjectName = name[1].toUpperCase();
        System.out.println("actual subject name -----------  " + actualSubjectName);

        List<WebElement> s = getDriver().findElements(By.xpath("/html/body/app-root/app-question-review/div/div/main/div[2]/div[2]/div/table/tbody/tr['i']/td[2]"));


        for (WebElement element : s)
        {

            String  ExpectedSubject= element.getText();
            System.out.println("subject name -----------  " + ExpectedSubject);

            Assert.assertEquals(actualSubjectName, ExpectedSubject);
        }
}

    public void SearchedSubjectWillBeDisplayedInTheTable() {


    }

    public void questionTypeSubjectAndTypeSearchFieldsWillBeDisplayed() {
        Assert.assertTrue(subject.isDisplayed() && type.isDisplayed() && questionType.isDisplayed());
        Assert.assertTrue(applyFiltersBtn.isDisplayed());
    }

    public void afterSearchQuestionReviewTableWillBeDisplayed() {
        applyFiltersBtn.click();

    }
}
