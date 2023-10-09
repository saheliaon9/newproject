package com.test.minivet.stepdefinition;

import com.test.minivet.objects.ExamTipsObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ExamTipsSteps extends DriverBase {

    com.test.minivet.objects.ExamTipsObjects  ExamTipsObjects = new ExamTipsObjects();

    @Given("the user has login mrcem and selects the home icon")
    public void theUserHasLoginMrcemAndSelectsTheHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        ExamTipsObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user selects exam tips dropdown")
    public void theUserSelectsExamTipsDropdown() {
        ExamTipsObjects.SelectsExamTipsDropdown();
    }

    @Then("dropdown list will be shown with following options MRCEm primary tips, MRCEM intermediate SBA tips, MRCEM OSCE tips")
    public void dropdownListWillBeShownWithFollowingOptionsMRCEmPrimaryTipsMRCEMIntermediateSBATipsMRCEMOSCETips() {
        ExamTipsObjects. dropdownListWillBeShown();
    }

    @When("the user selects about the exam dropdown and selects MRCEM PRIMARY TIPS option")
    public void theUserSelectsAboutTheExamDropdownAndSelectsMRCEMPRIMARYTIPSOption() {
        ExamTipsObjects.SelectsAboutTheExamDropdownAndSelectsMRCEMPRIMARYTIPSOption();
    }

    @Then("MRCEM PRIMARY TIPS screen will be displayed")
    public void mrcemPRIMARYTIPSScreenWillBeDisplayed() throws IOException {
        ExamTipsObjects.mrcemPRIMARYTIPSScreenWillBeDisplayed();
    }

    @When("the user selects about the exam dropdown and selects MRCEM INTERMEDIATE SBA TIPS option")
    public void theUserSelectsAboutTheExamDropdownAndSelectsMRCEMINTERMEDIATESBATIPSOption() {
        ExamTipsObjects.SelectsAboutTheExamDropdownAndSelectsMRCEMINTERMEDIATESBATIPSOption();
    }

    @Then("MRCEM INTERMEDIATE SBA TIPS screen will be displayed")
    public void mrcemINTERMEDIATESBATIPSScreenWillBeDisplayed() throws IOException{
        ExamTipsObjects.mrcemINTERMEDIATESBATIPSScreenWillBeDisplayed();
    }

    @When("the user selects about the exam dropdown and selects MRCEM OSCE TIPS  option")
    public void theUserSelectsAboutTheExamDropdownAndSelectsMRCEMOSCETIPSOption() {
        ExamTipsObjects.SelectsAboutTheExamDropdownAndSelectsMRCEMOSCETIPSOption();
    }

    @Then("MRCEM OSCE TIPS  screen will be displayed")
    public void mrcemOSCETIPSScreenWillBeDisplayed()throws IOException {
        ExamTipsObjects.mrcemOSCETIPSScreenWillBeDisplayed();
    }
}
