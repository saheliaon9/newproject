package com.test.minivet.objects;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RevisionModulesTilesObject extends DriverBase{

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

    @FindBy(xpath = "//*[text()= ' Anatomy ']/parent::div/parent::div/parent::div")
    private WebElement anatomy;

    @FindBy(xpath = "//*[text()= ' Physiology ']/parent::div/parent::div/parent::div")
    private WebElement physiology;

    @FindBy(xpath = "//*[text()= ' Pharmacology ']/parent::div/parent::div/parent::div")
    private WebElement Pharmacology;

    @FindBy(xpath = "//*[text()= ' Microbiology ']/parent::div/parent::div/parent::div")
    private WebElement microbiology;

    @FindBy(xpath = "//*[text()= ' Pathology ']/parent::div/parent::div/parent::div")
    private WebElement pathology;

    @FindBy(xpath = "//*[text()= ' Evidence Based Medicine ']/parent::div/parent::div/parent::div")
    private WebElement Evidence_Based_Medicine;
    
    @FindBy(xpath = "//*[text()= ' Anatomy ']/parent::div/parent::div")
    private WebElement anatomySubTile;

    @FindBy(xpath = "//*[text()= ' Abdomen and Pelvis ']/parent::div/parent::div")
    private WebElement anatomySubTile1;

    @FindBy(xpath = "//*[text()= ' Central Nervous System ']/parent::div/parent::div")
    private WebElement anatomySubTile2;

    @FindBy(xpath = "//*[text()= ' Head and Neck ']/parent::div/parent::div")
    private WebElement anatomySubTile3;

    @FindBy(xpath = "//*[text()= ' Lower Limb ']/parent::div/parent::div")
    private WebElement anatomySubTile4;

    @FindBy(xpath = "//*[text()= ' Thorax ']/parent::div/parent::div")
    private WebElement anatomySubTile5;

    @FindBy(xpath = "//*[text()= ' Upper Limb ']/parent::div/parent::div")
    private WebElement anatomySubTile6;
    @FindBy(xpath = "//*[text()= ' Physiology ']/parent::div/parent::div")
    private WebElement physiologySubTile;

    @FindBy(xpath = "//*[text()= ' Basic Cellular Physiology ']/parent::div/parent::div")
    private WebElement physiologySubTile1;

    @FindBy(xpath = "//*[text()= ' Cardiovascular Physiology ']/parent::div/parent::div")
    private WebElement physiologySubTile2;

    @FindBy(xpath = "//*[text()= ' Endocrine Physiology ']/parent::div/parent::div")
    private WebElement physiologySubTile3;

    @FindBy(xpath = "//*[text()= ' Gastrointestinal Physiology ']/parent::div/parent::div")
    private WebElement physiologySubTile4;

    @FindBy(xpath = "//*[text()= ' Renal Physiology ']/parent::div/parent::div")
    private WebElement physiologySubTile5;

    @FindBy(xpath = "//*[text()= ' Respiratory Physiology ']/parent::div/parent::div")
    private WebElement physiologySubTile6;

    @FindBy(xpath = "//*[text()= ' Microbiology ']/parent::div/parent::div")
    private WebElement microbiologySubTile;

    @FindBy(xpath = "//*[text()= ' Principles of Microbiology ']/parent::div/parent::div")
    private WebElement microbiologySubTile1;

    @FindBy(xpath = "//*[text()= ' Specific Pathogen Groups ']/parent::div/parent::div")
    private WebElement microbiologySubTile2;

    @FindBy(xpath = "//*[text()= ' Pharmacology ']/parent::div/parent::div")
    private WebElement pharmocologySubTile;

    @FindBy(xpath = "//*[text()= ' Anaesthesia ']/parent::div/parent::div")
    private WebElement pharmocologySubTile1;

    @FindBy(xpath = "//*[text()= ' Cardiovascular Pharmacology ']/parent::div/parent::div")
    private WebElement pharmocologySubTile2;

    @FindBy(xpath = "//*[text()= ' CNS Pharmacology ']/parent::div/parent::div")
    private WebElement pharmocologySubTile3;

    @FindBy(xpath = "//*[text()= ' Endocrine Pharmacology ']/parent::div/parent::div")
    private WebElement pharmocologySubTile4;

    @FindBy(xpath = "//*[text()= ' Fluids & Electrolytes ']/parent::div/parent::div")
    private WebElement pharmocologySubTile5;

    @FindBy(xpath = "//*[text()= ' Gastrointestinal Pharmacology ']/parent::div/parent::div")
    private WebElement pharmocologySubTile6;

    @FindBy(xpath = "//*[text()= ' Immunological Products & Vaccines ']/parent::div/parent::div")
    private WebElement pharmocologySubTile7;

    @FindBy(xpath = "//*[text()= ' Infections ']/parent::div/parent::div")
    private WebElement pharmocologySubTile8;

    @FindBy(xpath = "//*[text()= ' Musculoskeletal Pharmacology ']/parent::div/parent::div")
    private WebElement pharmocologySubTile9;

    @FindBy(xpath = "//*[text()= ' Respiratory Pharmacology ']/parent::div/parent::div")
    private WebElement pharmocologySubTile10;

    @FindBy(xpath = "//*[text()= ' Pathology ']/parent::div/parent::div")
    private WebElement pathologySubTile;

    @FindBy(xpath = "//*[text()=  ' General Pathology ']/parent::div/parent::div")
    private WebElement pathologySubTile1;

    @FindBy(xpath = "//*[text()=  ' Haematology ']/parent::div/parent::div")
    private WebElement pathologySubTile2;

    @FindBy(xpath = "//*[text()=  ' Pathology of Infections ']/parent::div/parent::div")
    private WebElement pathologySubTile3;



    public RevisionModulesTilesObject() {
        PageFactory.initElements(getDriver(), this);
    }
    public void loginToMrcemExamPrepWebsite(String username, String password) {
        loginBtn.click();
        userName.sendKeys(username);
        passWord.sendKeys(password);
        signinButton.click();
    }


    public void selectContinueInRevisionModuleTile() {

       wait.until(ExpectedConditions.visibilityOf(rev_continue_Btn));
        rev_continue_Btn.click();
    }

    public void tilesUnderPhysiologywillBeshown() {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(anatomy.isDisplayed() && physiology.isDisplayed() && Pharmacology.isDisplayed() &&
                microbiology.isDisplayed() && pathology.isDisplayed() && Evidence_Based_Medicine.isDisplayed());
    }


    public void selectAnatomytile() {
        anatomySubTile.click();
    }

    public void checkAnatomySubtiles() {

                try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(anatomySubTile1.isDisplayed() && anatomySubTile2.isDisplayed() && anatomySubTile3.isDisplayed() &&
                anatomySubTile4.isDisplayed() && anatomySubTile5.isDisplayed() && anatomySubTile6.isDisplayed());

        getDriver().navigate().back();
    }


    public void SelectPhysiologyTile() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        physiologySubTile.click();
    }

    public void checkPhysiologySubtiles() {


                try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(physiologySubTile1.isDisplayed() && physiologySubTile2.isDisplayed() && physiologySubTile3.isDisplayed() &&
                physiologySubTile4.isDisplayed() && physiologySubTile5.isDisplayed() && physiologySubTile6.isDisplayed());
        getDriver().navigate().back();
    }

    public void selectMicrobiologyTile() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        microbiologySubTile.click();
    }
    public void checkMicrobiologySubtiles() {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(microbiologySubTile1.isDisplayed() && microbiologySubTile2.isDisplayed());
        getDriver().navigate().back();

    }
    public void selectPathologyTile() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       pathologySubTile.click();
    }

    public void selectPathologySubtiles() {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(pathologySubTile1.isDisplayed() && pathologySubTile2.isDisplayed() && pathologySubTile3.isDisplayed());

    }


    public void SelectPharmacologyTile() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pharmocologySubTile.click();
    }

    public void checkPharmacologySubtiles() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(pharmocologySubTile1.isDisplayed() && pharmocologySubTile2.isDisplayed() && pharmocologySubTile3.isDisplayed() &&
                pharmocologySubTile4.isDisplayed() && pharmocologySubTile5.isDisplayed() && pharmocologySubTile6.isDisplayed() &&
                pharmocologySubTile7.isDisplayed() && pharmocologySubTile8.isDisplayed() && pharmocologySubTile9.isDisplayed() &&
                pharmocologySubTile10.isDisplayed());

        getDriver().navigate().back();

    }
}
