package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPharmacologyModule10Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule10Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule10Objects CountUnitsInPharmacologyModule10Objects = new CountUnitsInPharmacologyModule10Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and selects the  Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectsThePharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule10Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule10Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule10Objects.selectPharmacologyTile();


    }

    @When("user check the total count of units in respiratory Pharmacology module")
    public void userCheckTheTotalCountOfUnitsInRespiratoryPharmacologyModule() {
        CountUnitsInPharmacologyModule10Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInRespiratoryPharmacologyModule();

    }

    @Then("total count of units in respiratory Pharmacology module should be same as the total count of units showing in respiratory Pharmacology tile")
    public void totalCountOfUnitsInRespiratoryPharmacologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInRespiratoryPharmacologyTile() {
        CountUnitsInPharmacologyModule10Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in respiratory Pharmacology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInRespiratoryPharmacologyTile() {
        CountUnitsInPharmacologyModule10Objects.CheckTotalCountOfUnitsCompletedInRespiratoryPharmacologyodule();

    }

    @Then("total count of completed units in respiratory Pharmacology module is same as the total count of completed units showing in respiratory Pharmacology tile")
    public void totalCountOfCompletedUnitsInRespiratoryPharmacologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInRespiratoryPharmacologyTile() {
        CountUnitsInPharmacologyModule10Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in respiratory Pharmacology unit")
    public void userSelectMarkAsCompletedButtonInRespiratoryPharmacologyUnit() {
        CountUnitsInPharmacologyModule10Objects.selectMarkAsCompletedBtn();

    }

    @Then("that unit in respiratory Pharmacology will mark as read")
    public void thatUnitInRespiratoryPharmacologyWillMarkAsRead() {
        CountUnitsInPharmacologyModule10Objects.checkUnitIsMarkAsRead();

    }
}
