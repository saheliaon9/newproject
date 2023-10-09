package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPathologyModule2Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPathologyModule2Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPathologyModule2Objects CountUnitsInPathologyModule2Objects = new CountUnitsInPathologyModule2Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select the pathology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectThePathologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPathologyModule2Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPathologyModule2Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPathologyModule2Objects.selectPathologyTile();
    }

    @When("user check the total count of units in haematology module")
    public void userCheckTheTotalCountOfUnitsInHaematologyModule() {
        CountUnitsInPathologyModule2Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInHaematologyModule();
    }

    @Then("total count of units in haematology module should be same as the total count of units showing in haematology tile")
    public void totalCountOfUnitsInhaematologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInHaematologyTile() {
        CountUnitsInPathologyModule2Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in haematology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInHaematologyTile() {
        CountUnitsInPathologyModule2Objects.CheckTotalCountOfUnitsCompletedInHaematologyModule();
    }

    @Then("total count of completed units in haematology is same as the total count of completed units showing in haematology tile")
    public void totalCountOfCompletedUnitsInHaematologyIsSameAsTheTotalCountOfCompletedUnitsShowingInHaematologyTile() {
        CountUnitsInPathologyModule2Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in haematology unit")
    public void userSelectMarkAsCompletedButtonInHaematologyUnit() {
        CountUnitsInPathologyModule2Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in haematology will mark as read")
    public void thatUnitInHaematologyWillMarkAsRead() {
        CountUnitsInPathologyModule2Objects.checkUnitIsMarkAsRead();
    }
}
