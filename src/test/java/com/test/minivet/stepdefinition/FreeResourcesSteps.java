package com.test.minivet.stepdefinition;

import com.test.minivet.objects.FreeResourcesObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class FreeResourcesSteps extends DriverBase {
    com.test.minivet.objects.FreeResourcesObjects  FreeResourcesObjects = new FreeResourcesObjects();


    @Given("the user has login to mrcem and hit home icon")
    public void theUserHasLoginToMrcemAndHitHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        FreeResourcesObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user selects free resources dropdown")
    public void theUserSelectsFreeResourcesDropdown() {
        FreeResourcesObjects.SelectsFreeResourcesDropdown();
    }

    @Then("free resources dropdown list will be shown with following options free ECG guide, artist, case of the month,exam tips")
    public void freeResourcesDropdownListWillBeShownWithFollowingOptionsFreeECGGuideArtiseCaseOfThreMonthExamTips() {
        FreeResourcesObjects.DropdownListWillBeShown();
    }

    @When("the user selects free resources dropdown and selects free ECG guide option")
    public void theUserSelectsFreeResourcesDropdownAndSelectsFreeECGGuideOption() {
        FreeResourcesObjects.SelectsFreeResourcesDropdownAndSelectsFreeECGGuideOption();
    }

    @Then("free ECG guide  screen will be displayed")
    public void freeECGGuideScreenWillBeDisplayed()throws IOException {
        FreeResourcesObjects.freeECGGuideScreenWillBeDisplayed();
    }

    @When("the user selects free resources dropdown and selects articles option")
    public void theUserSelectsFreeResourcesDropdownAndSelectsArticlesOption() {
        FreeResourcesObjects.SelectsFreeResourcesDropdownAndSelectsArticlesOption(); }

    @Then("articles  screen will be displayed")
    public void articlesScreenWillBeDisplayed() throws IOException {
        FreeResourcesObjects.articlesScreenWillBeDisplayed(); }

    @When("the user selects free resources dropdown and selects case of the month option")
    public void theUserSelectsFreeResourcesDropdownAndSelectsCaseOfTheMonthOption() {
        FreeResourcesObjects.SelectsFreeResourcesDropdownAndSelectsCaseOfTheMonthOption();  }

    @Then("case of the month  screen will be displayed")
    public void caseOfTheMonthScreenWillBeDisplayed()throws IOException  {
        FreeResourcesObjects.caseOfTheMonthScreenWillBeDisplayed();   }

    @When("the user selects free resources dropdown and selects exam tips option")
    public void theUserSelectsFreeResourcesDropdownAndSelectsExamTipsOption() {
        FreeResourcesObjects.SelectsFreeResourcesDropdownAndSelectsExamTipsOption(); }

    @Then("exam tips  screen will be displayed")
    public void examTipsScreenWillBeDisplayed()throws IOException  {
        FreeResourcesObjects.examTipsScreenWillBeDisplayed(); }
}
