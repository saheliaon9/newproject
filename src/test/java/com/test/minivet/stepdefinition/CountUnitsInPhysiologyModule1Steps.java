package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.objects.CountUnitsInPhysiologyModule1Objects;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPhysiologyModule1Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPhysiologyModule1Objects CountUnitsInPhysiologyModule1Objects = new CountUnitsInPhysiologyModule1Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select physiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectPhysiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPhysiologyModule1Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPhysiologyModule1Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPhysiologyModule1Objects.selectPhysiologyTile();
    }

    @When("user check the total count of units in basic cellular physiology module")
    public void userCheckTheTotalCountOfUnitsInBasicCellularPhysiologyModule() {
        CountUnitsInPhysiologyModule1Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInBasicCellularPhysiologyModule();

    }

    @Then("total count of units in basic cellular physiology module should be same as the total count of units showing in basic cellular physiology tile")
    public void totalCountOfUnitsInBasicCellularPhysiologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInBasicCellularPhysiologyTile() {
        CountUnitsInPhysiologyModule1Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in basic cellular physiology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInBasicCellularPhysiologyTile() {
        CountUnitsInPhysiologyModule1Objects.CheckTotalCountOfUnitsCompletedInBasicCellularPhysiologyModule();

    }

    @Then("total count of completed units in basic cellular physiology module is same as the total count of completed units showing in basic cellular physiology tile")
    public void totalCountOfCompletedUnitsInBasicCellularPhysiologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInBasicCellularPhysiologyTile() {
        CountUnitsInPhysiologyModule1Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in basic cellular physiology unit")
    public void userSelectMarkAsCompletedButtonInBasicCellularPhysiologyUnit() {
        CountUnitsInPhysiologyModule1Objects.selectMarkAsCompletedBtn(); }

    @Then("that unit in e will mark as read")
    public void thatUnitInEWillMarkAsRead() {
        CountUnitsInPhysiologyModule1Objects.checkUnitIsMarkAsRead(); }
}






