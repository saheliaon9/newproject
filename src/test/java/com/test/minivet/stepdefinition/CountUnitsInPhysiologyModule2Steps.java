 package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.objects.CountUnitsInPhysiologyModule2Objects;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPhysiologyModule2Steps extends DriverBase{
    com.test.minivet.objects.CountUnitsInPhysiologyModule2Objects CountUnitsInPhysiologyModule2Objects = new CountUnitsInPhysiologyModule2Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select the physiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectThePhysiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPhysiologyModule2Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPhysiologyModule2Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPhysiologyModule2Objects.selectPhysiologyTile();
    }

    @When("user check the total count of units in cardiovascular module")
    public void userCheckTheTotalCountOfUnitsInCardiovascularModule() {
        CountUnitsInPhysiologyModule2Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInCardiovascularModule();

    }

    @Then("total count of units in cardiovascular module should be same as the total count of units showing in cardiovascular tile")
    public void totalCountOfUnitsInCardiovascularModuleShouldBeSameAsTheTotalCountOfUnitsShowingInCardiovascularTile() {
        CountUnitsInPhysiologyModule2Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in cardiovascular tile")
    public void userCheckTheTotalCountOfUnitsCompletedInCardiovascularTile() {
        CountUnitsInPhysiologyModule2Objects.CheckTotalCountOfUnitsCompletedInCardiovascularModule();

    }

    @Then("total count of completed units in cardiovascular module is same as the total count of completed units showing in cardiovascular tile")
    public void totalCountOfCompletedUnitsInCardiovascularModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInCardiovascularTile() {
        CountUnitsInPhysiologyModule2Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }


    @When("user select  mark as completed button in cardiovascular unit")
    public void userSelectMarkAsCompletedButtonInCardiovascularUnit() {
        CountUnitsInPhysiologyModule2Objects.selectMarkAsCompletedBtn();


    }

    @Then("that unit in cardiovascular will mark as read")
    public void thatUnitInCardiovascularWillMarkAsRead() {
        CountUnitsInPhysiologyModule2Objects.checkUnitIsMarkAsRead(); }
}
