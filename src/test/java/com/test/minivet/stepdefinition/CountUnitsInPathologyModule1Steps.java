package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPathologyModule1Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPathologyModule1Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPathologyModule1Objects CountUnitsInPathologyModule1Objects = new CountUnitsInPathologyModule1Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select pathology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectPathologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPathologyModule1Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPathologyModule1Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPathologyModule1Objects.selectPathologyTile();
    }

    @When("user check the total count of units in general pathology module")
    public void userCheckTheTotalCountOfUnitsInGeneralPathologyModule() {
        CountUnitsInPathologyModule1Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInGeneralPathologyModule();
    }

    @Then("total count of units in general pathology module should be same as the total count of units showing in general pathology tile")
    public void totalCountOfUnitsInGeneralPathologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInGeneralPathologyTile() {
        CountUnitsInPathologyModule1Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in general pathology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInGeneralPathologyTile() {
        CountUnitsInPathologyModule1Objects.CheckTotalCountOfUnitsCompletedInGeneralPathologyModule();
    }

    @Then("total count of completed units in general pathology is same as the total count of completed units showing in general pathology tile")
    public void totalCountOfCompletedUnitsInGeneralPathologyIsSameAsTheTotalCountOfCompletedUnitsShowingInGeneralPathologyTile() {
        CountUnitsInPathologyModule1Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in general pathology unit")
    public void userSelectMarkAsCompletedButtonInGeneralPathologyUnit() {
        CountUnitsInPathologyModule1Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in general pathology will mark as read")
    public void thatUnitInGeneralPathologyWillMarkAsRead() {
        CountUnitsInPathologyModule1Objects.checkUnitIsMarkAsRead();
    }
}
