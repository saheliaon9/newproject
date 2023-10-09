package com.test.minivet.stepdefinition;

import com.test.minivet.objects.AboutTheExamObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class AboutTheExamSteps extends DriverBase {

    com.test.minivet.objects.AboutTheExamObjects  AboutTheExamObjects = new AboutTheExamObjects();

    @Given("the user has login mrcem and selects home icon")
    public void theUserHasLoginMrcemAndSelectsHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        AboutTheExamObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));

    }

    @When("the user selects about the exam dropdown")
    public void theUserSelectsAboutTheExamDropdown() {
        AboutTheExamObjects.selectsAboutTheExamDropdown();
    }

    @Then("dropdown list will be shown with following options MRCEm primary,MRCEM overview, MRCEM intermediate SBA, MRCEM OSCE")
    public void dropdownListWillBeShownWithFollowingOptionsMRCEmPrimaryMRCEMOverviewMRCEMIntermediateSBAMRCEMOSCE() {
        AboutTheExamObjects.dropdownListWillBeShown();
    }


    @When("the user selects about the exam dropdown and selects MRCEM overview option")
    public void theUserSelectsAboutTheExamDropdownAndSelectsMRCEMOverviewOption() {
        AboutTheExamObjects.selectsAboutTheExamDropdownAndSelectMRCEMoverviewOption();
    }

    @Then("MRCEM overview screen will be displayed")
    public void mrcemOverviewScreenWillBeDisplayed() throws IOException {
        AboutTheExamObjects.mrcemOverviewScreenWillBeDisplayed();
    }

    @When("the user selects about the exam dropdown and selects MRCEM PRIMARY option")
    public void theUserSelectsAboutTheExamDropdownAndSelectsMRCEMPRIMARYOption() {
        AboutTheExamObjects.selectsAboutTheExamDropdownAndSelectsMRCEMPRIMARYOption();
    }

    @Then("MRCEM PRIMARY screen will be displayed")
    public void mrcemPRIMARYScreenWillBeDisplayed() throws IOException{
        AboutTheExamObjects.mrcemPRIMARYScreenWillBeDisplayed();
    }

    @When("the user selects about the exam dropdown and selects MRCEM INTERMEDIATE SBA option")
    public void theUserSelectsAboutTheExamDropdownAndSelectsMRCEMINTERMEDIATESBAOption() {
        AboutTheExamObjects.selectsAboutTheExamDropdownAndSelectsMRCEMINTERMEDIATESBAOption();
    }

    @Then("MRCEM INTERMEDIATE SBA screen will be displayed")
    public void mrcemINTERMEDIATESBAScreenWillBeDisplayed() throws IOException{
        AboutTheExamObjects.mrcemINTERMEDIATESBAScreenWillBeDispalyed();
    }

    @When("the user selects about the exam dropdown and selects MRCEM OSCE option")
    public void theUserSelectsAboutTheExamDropdownAndSelectsMRCEMOSCEOption() {
        AboutTheExamObjects.SelectsAboutTheExamDropdownAndSelectsMRCEMOSCEOption(); }

    @Then("MRCEM OSCE screen will be displayed")
    public void mrcemOSCEScreenWillBeDisplayed()  throws IOException{
        AboutTheExamObjects.mrcemOSCEScreenWillBeDisplayed();
    }
}
