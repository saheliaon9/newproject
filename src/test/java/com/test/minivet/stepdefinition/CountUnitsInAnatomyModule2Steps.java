package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CountUnitsInAnatomyModule2Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInAnatomyModule2Steps extends DriverBase {

    com.test.minivet.objects.CountUnitsInAnatomyModule2Objects  CountUnitsInAnatomyModule2Objects = new CountUnitsInAnatomyModule2Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select cns tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectCnsTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInAnatomyModule2Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInAnatomyModule2Objects.selectContinueBtnInRevisionModule();
        CountUnitsInAnatomyModule2Objects.selectAnatomyTile();
    }

    @When("user check the total count of units in central nervous system module")
    public void userCheckTheTotalCountOfUnitsInCentralNervousSystemModule() {
        CountUnitsInAnatomyModule2Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInCentralNervousSystemModule();
    }

    @Then("total count of units in central nervous system module should be same as the total count of units showing in central nervous system tile")
    public void totalCountOfUnitsInCentralNervousSystemModuleShouldBeSameAsTheTotalCountOfUnitsShowingInCentralNervousSystemTile() {
        CountUnitsInAnatomyModule2Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units in cns module")
    public void userCheckTheTotalCountOfUnitsInCnsModule() {
        CountUnitsInAnatomyModule2Objects.CheckTotalCountOfUnitsCompletedInCnsModule();
    }

    @Then("total count of units in cns module should be same as the total count of units showing in cns tile")
    public void totalCountOfUnitsInCnsModuleShouldBeSameAsTheTotalCountOfUnitsShowingInCnsTile() {
        CountUnitsInAnatomyModule2Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in cns unit")
    public void userSelectMarkAsCompletedButtonInCnsUnit() { CountUnitsInAnatomyModule2Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in cns will mark as read")
    public void thatUnitInCnsWillMarkAsRead() {        CountUnitsInAnatomyModule2Objects.checkUnitIsMarkAsRead();

    }
}
