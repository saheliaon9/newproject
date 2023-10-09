package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.test.minivet.objects.CountUnitsInPharmacologyModule3Objects;

public class CountUnitsInPharmacologyModule3Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule3Objects CountUnitsInPharmacologyModule3Objects = new CountUnitsInPharmacologyModule3Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectPharmacologyTile() {

        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule3Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule3Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule3Objects.selectPharmacologyTile();

    }

    @When("user check the total count of units in cardiovascular pharmacology module")
    public void userCheckTheTotalCountOfUnitsInCardiovascularPharmacologyModule() {
        CountUnitsInPharmacologyModule3Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingIncardiovascularPharmacologyModule();

    }

    @Then("total count of units in cardiovascular pharmacology module should be same as the total count of units showing in cardiovascular pharmacology tile")
    public void totalCountOfUnitsInCardiovascularPharmacologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInCardiovascularPharmacologyTile() {
        CountUnitsInPharmacologyModule3Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in cardiovascular pharmacology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInCardiovascularPharmacologyTile() {
        CountUnitsInPharmacologyModule3Objects.CheckTotalCountOfUnitsCompletedIncardiovascularPharmacologyModule();

    }

    @Then("total count of completed units in cardiovascular pharmacology module is same as the total count of completed units showing in cardiovascular pharmacology tile")
    public void totalCountOfCompletedUnitsInCardiovascularPharmacologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInCardiovascularPharmacologyTile() {
        CountUnitsInPharmacologyModule3Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in cardiovascular pharmacology unit")
    public void userSelectMarkAsCompletedButtonInCardiovascularPharmacologyUnit() {
        CountUnitsInPharmacologyModule3Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in cardiovascular pharmacology unit will mark as read")
    public void thatUnitInCardiovascularPharmacologyUnitWillMarkAsRead() {
        CountUnitsInPharmacologyModule3Objects.checkUnitIsMarkAsRead(); }
}
