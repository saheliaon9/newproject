package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  com.test.minivet.objects.CountUnitsInPharmacologyModule2Objects;
public class CountUnitsInPharmacologyModule2Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule2Objects CountUnitsInPharmacologyModule2Objects = new CountUnitsInPharmacologyModule2Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and hit Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndHitPharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule2Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule2Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule2Objects.selectPharmacologyTile();

    }

    @When("user check the total count of units in cns pharmacology module")
    public void userCheckTheTotalCountOfUnitsInCnsPharmacologyModule() {
        CountUnitsInPharmacologyModule2Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInCnsPharmacologyModule();

    }

    @Then("total count of units in cns pharmacology module should be same as the total count of units showing in cns pharmacology tile")
    public void totalCountOfUnitsInCnsPharmacologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInCnsPharmacologyTile() {
        CountUnitsInPharmacologyModule2Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in cns pharmacology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInCnsPharmacologyTile() {
        CountUnitsInPharmacologyModule2Objects.CheckTotalCountOfUnitsCompletedInCnsPharmacologyModule();

    }

    @Then("total count of completed units in cns pharmacology module is same as the total count of completed units showing in cns pharmacology tile")
    public void totalCountOfCompletedUnitsInCnsPharmacologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInCnsPharmacologyTile() {
        CountUnitsInPharmacologyModule2Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in cns pharmacology unit")
    public void userSelectMarkAsCompletedButtonInCnsPharmacologyUnit() {
        CountUnitsInPharmacologyModule2Objects.selectMarkAsCompletedBtn();

      }

    @Then("that unit in cns pharmacology unit will mark as read")
    public void thatUnitInCnsPharmacologyUnitWillMarkAsRead() {
        CountUnitsInPharmacologyModule2Objects.checkUnitIsMarkAsRead();  }
}
