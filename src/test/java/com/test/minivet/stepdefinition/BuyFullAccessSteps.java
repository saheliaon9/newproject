package com.test.minivet.stepdefinition;

import com.test.minivet.objects.BuyFullAccessObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class BuyFullAccessSteps extends DriverBase {

    com.test.minivet.objects.BuyFullAccessObjects  BuyFullAccessObjects = new BuyFullAccessObjects();

    @Given("the user has login mrcem and select the home icon")
    public void theUserHasLoginMrcemAndSelectTheHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        BuyFullAccessObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));
    }


    @When("the user selects Buy Full Access dropdown")
    public void theUserSelectsBuyFullAccessDropdown() {
        BuyFullAccessObjects.SelectsBuyFullAccessDropdown();
    }

    @Then("dropdown list will be shown with following options MRCEM PRIMARY access, MRCEM INTERMEDIATE SBA")
    public void dropdownListWillBeShownWithFollowingOptionsMRCEMPRIMARYAccessMRCEMINTERMEDIATESBA() {
        BuyFullAccessObjects.dropdownListWillBeShown();  }

    @When("the user selects  Buy Full Access dropdown and selects MRCEM PRIMARY access option")
    public void theUserSelectsBuyFullAccessDropdownAndSelectsMRCEMPRIMARYAccessOption() {
        BuyFullAccessObjects.SelectsBuyFullAccessDropdownAndSelectsMRCEMPRIMARYAccessOption();
    }

    @Then("MRCEM PRIMARY access screen will be displayed")
    public void mrcemPRIMARYAccessScreenWillBeDisplayed()throws IOException {
        BuyFullAccessObjects.mrcemPRIMARYAccessScreenWillBeDisplayed();
    }

    @When("the user selects  Buy Full Access dropdown and selects MRCEM INTERMEDIATE SBA access option")
    public void theUserSelectsBuyFullAccessDropdownAndSelectsMRCEMINTERMEDIATESBAAccessOption() {
        BuyFullAccessObjects.SelectsBuyFullAccessDropdownAndSelectsMRCEMINTERMEDIATESBAAccessOption();
    }

    @Then("MRCEM INTERMEDIATE SBA access screen will be displayed")
    public void mrcemINTERMEDIATESBAAccessScreenWillBeDisplayed()throws IOException {
        BuyFullAccessObjects.mrcemINTERMEDIATESBAAccessScreenWillBeDisplayed();}
}
