package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPharmacologyModule6Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule6Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule6Objects CountUnitsInPharmacologyModule6Objects = new CountUnitsInPharmacologyModule6Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and selects  Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectsPharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule6Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule6Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule6Objects.selectPharmacologyTile();
    }

    @When("user check the total count of units in gastrointestinal pharmacology module")
    public void userCheckTheTotalCountOfUnitsInGastrointestinalPharmacologyModule() {
        CountUnitsInPharmacologyModule6Objects.checkTheTotalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingIngGastrointestinalPharmacologyModule();
    }

    @Then("total count of units in gastrointestinal pharmacology module should be same as the total count of units showing in gastrointestinal pharmacology tile")
    public void totalCountOfUnitsInGastrointestinalPharmacologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInGastrointestinalPharmacologyTile() {
        CountUnitsInPharmacologyModule6Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in gastrointestinal pharmacology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInGastrointestinalPharmacologyTile() {
        CountUnitsInPharmacologyModule6Objects.CheckTotalCountOfUnitsCompletedInGastrointestinalPharmacologyModule();

    }

    @Then("total count of completed units in gastrointestinal pharmacology module is same as the total count of completed units showing in gastrointestinal pharmacology tile")
    public void totalCountOfCompletedUnitsInGastrointestinalPharmacologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInGastrointestinalPharmacologyTile() {
        CountUnitsInPharmacologyModule6Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }


    @When("user select  mark as completed button in gastrointestinal pharmacology unit")
    public void userSelectMarkAsCompletedButtonInGastrointestinalPharmacologyUnit() {
        CountUnitsInPharmacologyModule6Objects.selectMarkAsCompletedBtn();

    }

    @Then("that unit in gastrointestinal pharmacology will mark as read")
    public void thatUnitInGastrointestinalPharmacologyWillMarkAsRead() {
        CountUnitsInPharmacologyModule6Objects.checkUnitIsMarkAsRead();

    }
}
