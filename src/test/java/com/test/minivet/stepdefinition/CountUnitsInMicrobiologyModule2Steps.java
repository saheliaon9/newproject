package com.test.minivet.stepdefinition;

import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.objects.CountUnitsInMicrobiologyModule2Objects;

public class CountUnitsInMicrobiologyModule2Steps extends DriverBase{
    com.test.minivet.objects.CountUnitsInMicrobiologyModule2Objects CountUnitsInMicrobiologyModule2Objects = new CountUnitsInMicrobiologyModule2Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select microbiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectMicrobiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInMicrobiologyModule2Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInMicrobiologyModule2Objects.selectContinueBtnInRevisionModule();
        CountUnitsInMicrobiologyModule2Objects.selectMicrobiologyTile();

    }

    @When("user check the total count of units in specific pathogen groups module")
    public void userCheckTheTotalCountOfUnitsInSpecificPathogenGroupsModule() {
        CountUnitsInMicrobiologyModule2Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInSpecificPathogenGroupsModule();
    }

    @Then("total count of units in specific pathogen groups module should be same as the total count of units showing in specific pathogen groups tile")
    public void totalCountOfUnitsInSpecificPathogenGroupsModuleShouldBeSameAsTheTotalCountOfUnitsShowingInSpecificPathogenGroupsTile() {
        CountUnitsInMicrobiologyModule2Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in specific pathogen groups tile")
    public void userCheckTheTotalCountOfUnitsCompletedInSpecificPathogenGroupsTile() {
        CountUnitsInMicrobiologyModule2Objects.CheckTotalCountOfUnitsCompletedInSpecificPathogenGroupsModule();
    }

    @Then("total count of completed units in specific pathogen groups is same as the total count of completed units showing in specific pathogen groups tile")
    public void totalCountOfCompletedUnitsInSpecificPathogenGroupsIsSameAsTheTotalCountOfCompletedUnitsShowingInSpecificPathogenGroupsTile() {
        CountUnitsInMicrobiologyModule2Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in specific pathogen groups unit")
    public void userSelectMarkAsCompletedButtonInSpecificPathogenGroupsUnit() {
        CountUnitsInMicrobiologyModule2Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in specific pathogen groups will mark as read")
    public void thatUnitInSpecificPathogenGroupsWillMarkAsRead() {
        CountUnitsInMicrobiologyModule2Objects.checkUnitIsMarkAsRead();
    }
}
