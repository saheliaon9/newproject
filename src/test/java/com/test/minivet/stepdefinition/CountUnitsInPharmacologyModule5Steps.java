package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPharmacologyModule5Objects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule5Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule5Objects CountUnitsInPharmacologyModule5Objects = new CountUnitsInPharmacologyModule5Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and selects the Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectsThePharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule5Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule5Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule5Objects.selectPharmacologyTile();
    }

    @When("user check the total count of units in Fluids and Electrolytes module")
    public void userCheckTheTotalCountOfUnitsInFluidsAndElectrolytesModule() {
        CountUnitsInPharmacologyModule5Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInFluidsAndElectrolytesModule();

    }

    @Then("total count of units in Fluids and Electrolytes module should be same as the total count of units showing in Fluids and Electrolytes tile")
    public void totalCountOfUnitsInFluidsAndElectrolytesModuleShouldBeSameAsTheTotalCountOfUnitsShowingInFluidsAndElectrolytesTile() {
             CountUnitsInPharmacologyModule5Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in Fluids and Electrolytes tile")
    public void userCheckTheTotalCountOfUnitsCompletedInFluidsAndElectrolytesTile() {
        CountUnitsInPharmacologyModule5Objects.CheckTotalCountOfUnitsCompletedInFluidsAndElectrolytesModule();
    }

    @Then("total count of completed units in Fluids and Electrolytes module is same as the total count of completed units showing in Fluids and Electrolytes tile")
    public void totalCountOfCompletedUnitsInFluidsAndElectrolytesModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInFluidsAndElectrolytesTile() {
        CountUnitsInPharmacologyModule5Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select Fluids and Electrolytes  tile and enter into first unit of Fluids and Electrolytes and  select next if mark as completed button not found")
    public void userSelectFluidsAndElectrolytesTileAndEnterIntoFirstUnitOfFluidsAndElectrolytesAndSelectNextIfMarkAsCompletedButtonNotFound() {
        CountUnitsInPharmacologyModule5Objects.SelectFluidsAndElectrolytesTileAndEnterIntoFirstUnitOfFluidsAndElectrolytes();
    }

    @Then("on selecting mark as completed that unit in Fluids and Electrolytes will mark as read")
    public void onSelectingMarkAsCompletedThatUnitInFluidsAndElectrolytesWillMarkAsRead() {
        CountUnitsInPharmacologyModule5Objects.tickMarkIsDisplayed();
    }

    @And("total count of units completed in Fluids and Electrolytes module is same as total count of completed units showing in Fluids and Electrolytes tile")
    public void totalCountOfUnitsCompletedInFluidsAndElectrolytesModuleIsSameAsTotalCountOfCompletedUnitsShowingInFluidsAndElectrolytesTile() {

    }
}
