package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPharmacologyModule1Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule1Steps extends DriverBase {
  com.test.minivet.objects.CountUnitsInPharmacologyModule1Objects CountUnitsInPharmacologyModule1Objects = new CountUnitsInPharmacologyModule1Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and then hit Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndThenHitPharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule1Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule1Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule1Objects.selectPharmacologyTile();

    }

    @When("user check the total count of units in anaesthesia module")
    public void userCheckTheTotalCountOfUnitsInAnaesthesiaModule() {
        CountUnitsInPharmacologyModule1Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInAnaesthesiaModule();
    }

    @Then("total count of units in anaesthesia module should be same as the total count of units showing in anaesthesia tile")
    public void totalCountOfUnitsInAnaesthesiaModuleShouldBeSameAsTheTotalCountOfUnitsShowingInAnaesthesiaTile() {
        CountUnitsInPharmacologyModule1Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in anaesthesia tile")
    public void userCheckTheTotalCountOfUnitsCompletedInAnaesthesiaTile() {
        CountUnitsInPharmacologyModule1Objects.CheckTotalCountOfUnitsCompletedInAnaesthesiaModule();
    }

    @Then("total count of completed units in anaesthesia module is same as the total count of completed units showing in anaesthesia tile")
    public void totalCountOfCompletedUnitsInAnaesthesiaModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInAnaesthesiaTile() {
        CountUnitsInPharmacologyModule1Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in anaesthesia unit")
    public void userSelectMarkAsCompletedButtonInAnaesthesiaUnit() {
        CountUnitsInPharmacologyModule1Objects.selectMarkAsCompletedBtn();
    }
    @Then("that unit in anaesthesia unjit will mark as read")
    public void thatUnitInAnaesthesiaUnjitWillMarkAsRead() {
            CountUnitsInPharmacologyModule1Objects.checkUnitIsMarkAsRead();
    }
}
