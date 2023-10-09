package com.test.minivet.objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class CountUnitsInPharmacologyModule5Objects extends DriverBase {

    WebDriverUtils wait = new WebDriverUtils();

    @FindBy(xpath = "//*[@id= 'email']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id= 'password']")
    private WebElement passWord;

    @FindBy(xpath = "//*[text()='Sign in']/parent::button[@type='submit']")
    private WebElement signinButton;

    @FindBy(xpath = "//*[text()=' LOGIN '][@href='/quiz/login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@href='/quiz/revision-module'][text()= 'Continue']")
    private WebElement rev_continue_Btn;

    @FindBy(xpath = "//*[text()= ' Pharmacology ']/parent::div/parent::div/parent::div/div")
    private WebElement Pharmacology;

    @FindBy(xpath = "//*[text()= ' Fluids & Electrolytes ']/parent::div/parent::div/parent::div")
    private WebElement fluidsAndElectrolytes;

    @FindBy(xpath = "//*[text()= ' Fluids & Electrolytes ']/parent::div/h6")
    private WebElement  fluidsAndElectrolytesText;

    @FindBy(xpath = "/html/body/app-root/app-subject-units/div/div/main/app-card-book-submenu/div/div[1]/div/div/div[2]")
    private WebElement firstUnit;

    @FindBy(xpath = " //*[text()=' Mark As Completed ']//parent::div/button")
    private WebElement markAsCompletedBtn;

    @FindBy(xpath = "//app-heading-common/h1")
    private WebElement titleName;

    @FindBy(xpath = "/html/body/app-root/app-bookpages/div/div/div[2]/app-textbook-sidebar[2]/div/div/div[1]/div/div/div[2]//*[local-name()='svg']")
    private WebElement TickMark;
    public CountUnitsInPharmacologyModule5Objects() {
        PageFactory.initElements(getDriver(), this);
    }

    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }


    public void selectContinueBtnInRevisionModule() {

        wait.until(ExpectedConditions.visibilityOf(rev_continue_Btn));
        rev_continue_Btn.click();
    }

    public void selectPharmacologyTile() {

        Pharmacology.click();

    }
    public void checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInFluidsAndElectrolytesModule() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String s = fluidsAndElectrolytesText.getText();

        String m[] = s.split(" ");

        String Actual_count = m[4];
        System.out.println("Total no of units showing in tile ----- " + Actual_count);


        fluidsAndElectrolytes.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-subject-units/div/div/main/app-card-book-submenu/div/div['i']"));
        String Expected_count = String.valueOf(row.size());
        System.out.println("total no of units showing in FluidsAndElectrolytes module  ----- " + Expected_count);

        Assert.assertEquals("total units in module is equal to the total count of unit showing in tile", Actual_count, Expected_count);
    }

    public void totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile() {

        System.out.println(" Total units in FluidsAndElectrolytes module is equal to the total count of unit showing in FluidsAndElectrolytes tile ");
    }


    public void CheckTotalCountOfUnitsCompletedInFluidsAndElectrolytesModule() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String s = fluidsAndElectrolytesText.getText();

        String m[] = s.split(" ");

        String Actual_count = m[1];
        System.out.println("Total no of completed units showing in tile ----- " + Actual_count);


        fluidsAndElectrolytes.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-subject-units/div/div/main/app-card-book-submenu/div/div['i']/div/div/div[2]//*[local-name()='svg']"));
        String Expected_count = String.valueOf(row.size());
        System.out.println("total no of completed units showing in FluidsAndElectrolytes module ----- " + Expected_count);

        Assert.assertEquals("total completed units in module is equal to the total count of completed unit showing in tile", Actual_count, Expected_count);

    }

    public void totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile() {
        System.out.println(" Total completed units in FluidsAndElectrolytes module is equal to the total count of completed unit showing in FluidsAndElectrolytes tile ");

    }

    public void SelectFluidsAndElectrolytesTileAndEnterIntoFirstUnitOfFluidsAndElectrolytes() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        fluidsAndElectrolytes.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-subject-units/div/div/main/app-card-book-submenu/div/div['i']/div/div/div[2]/div"));
       int r = row.size();

        System.out.println("unread unit count ------- "+ r);

       

            WebElement unit = getDriver().findElement(By.xpath("/html/body/app-root/app-subject-units/div/div/main/app-card-book-submenu/div/div['i']/div/div/div[2]/div"));
            unit.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            markAsCompletedBtn.click();
        }
//        else {
//            List<WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-bookpages/div/div/div[2]/app-textbook-sidebar[2]/div/div/div['i']/div/div"));
//            int n = row.size();
//
//            for(int i=1; i<=n; i++)
//            {
////                nextBtn.click();
//                if (markAsCompletedBtn.isDisplayed())
//                {
//                    markAsCompletedBtn.click();
//
//                }
//                else {
//                    nextBtn.click();
//                }
//            }
//        }


    public void tickMarkIsDisplayed() {
        List<WebElement> row = getDriver().findElements(By.xpath("/html/body/app-root/app-bookpages/div/div/div[2]/app-textbook-sidebar[2]/div/div/div['i']/div/div"));
        int r = row.size();
        String title = titleName.getText();
       for(int i=r; i<=r ; i++)
       {
           List<WebElement> e = getDriver().findElements(By.xpath("/html/body/app-root/app-bookpages/div/div/div[2]/app-textbook-sidebar[2]/div/div/div['i']/div/div/div[1]/div[2]/h6"));
           String s = e.get(i).getText();

           if(title.equals(s)){
               Assert.assertTrue(e.contains(TickMark));

           }
       }
    }
}
