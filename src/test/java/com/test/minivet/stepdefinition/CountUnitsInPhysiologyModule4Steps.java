package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPhysiologyModule4Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPhysiologyModule4Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPhysiologyModule4Objects CountUnitsInPhysiologyModule4Objects = new CountUnitsInPhysiologyModule4Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and hit the physiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndHitThePhysiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPhysiologyModule4Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPhysiologyModule4Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPhysiologyModule4Objects.selectPhysiologyTile();
    }

    @When("user check the total count of units in gastrointestinal physiology module")
    public void userCheckTheTotalCountOfUnitsInGastrointestinalPhysiologyModule() {
        CountUnitsInPhysiologyModule4Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInGastrointestinalPhysiologyModule();

    }

    @Then("total count of units in gastrointestinal physiology module should be same as the total count of units showing in gastrointestinal physiology tile")
    public void totalCountOfUnitsInGastrointestinalPhysiologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInGastrointestinalPhysiologyTile() {
        CountUnitsInPhysiologyModule4Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in gastrointestinal physiology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInGastrointestinalPhysiologyTile() {
        CountUnitsInPhysiologyModule4Objects.CheckTotalCountOfUnitsCompletedInGastrointestinalPhysiologyModule();

    }

    @Then("total count of completed units in gastrointestinal physiology module is same as the total count of completed units showing in gastrointestinal physiology tile")
    public void totalCountOfCompletedUnitsInGastrointestinalPhysiologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInGastrointestinalPhysiologyTile() {
        CountUnitsInPhysiologyModule4Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in gastrointestinal physiology unit")
    public void userSelectMarkAsCompletedButtonInGastrointestinalPhysiologyUnit() {
        CountUnitsInPhysiologyModule4Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in gastrointestinal physiology will mark as read")
    public void thatUnitInGastrointestinalPhysiologyWillMarkAsRead() {

        CountUnitsInPhysiologyModule4Objects.checkUnitIsMarkAsRead();
    }
}
