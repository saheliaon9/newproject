package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SampleQuestionsObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SampleQuestionsSteps extends DriverBase{
    com.test.minivet.objects.SampleQuestionsObjects  SampleQuestionsObjects = new SampleQuestionsObjects();

    @Given("the user has login to mrcem and selects home icon")
    public void theUserHasLoginToMrcemAndSelectsHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        SampleQuestionsObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user selects sample questions dropdown")
    public void theUserSelectsSampleQuestionsDropdown() {
        SampleQuestionsObjects.SelectsSampleQuestionsDropdown();
    }

    @Then("sample questions dropdown list will be shown with following options MRCEm primary,MRCEM intermediate SBA")
    public void sampleQuestionsDropdownListWillBeShownWithFollowingOptionsMRCEmPrimaryMRCEMIntermediateSBA() {
        SampleQuestionsObjects.DropdownListWillBeShown();
    }

    @When("the user selects sample questions dropdown and selects MRCEM PRIMARY option")
    public void theUserSelectsSampleQuestionsDropdownAndSelectsMRCEMPRIMARYOption() {
        SampleQuestionsObjects.SelectsSampleQuestionsDropdownAndSelectsMRCEMPRIMARYOption();
    }

    @Then("MRCEM PRIMARY  screen will be displayed")
    public void mrcemPRIMARYScreenWillBeDisplayed()throws IOException {
        SampleQuestionsObjects.mrcemPRIMARYScreenWillBeDisplayed();
    }

    @When("the user selects sample questions dropdown and selects MRCEM overview option")
    public void theUserSelectsSampleQuestionsDropdownAndSelectsMRCEMOverviewOption() {
        SampleQuestionsObjects.SelectsSampleQuestionsDropdownAndSelectsMRCEMOverviewOption();
    }

    @Then("MRCEM INTERMEDIATE SBA  screen will be displayed")
    public void mrcemINTERMEDIATESBAScreenWillBeDisplayed() throws IOException {
        SampleQuestionsObjects.mrcemINTERMEDIATESBAScreenWillBeDisplayed();
    }
}
