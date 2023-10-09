package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPharmacologyModule8Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule8Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule8Objects CountUnitsInPharmacologyModule8Objects = new CountUnitsInPharmacologyModule8Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and then hit the  Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndThenHitThePharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule8Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule8Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule8Objects.selectPharmacologyTile();
    }

    @When("user check the total count of units in infections module")
    public void userCheckTheTotalCountOfUnitsInInfectionsModule() {
        CountUnitsInPharmacologyModule8Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInInfectionsModule();

    }

    @Then("total count of units in infections module should be same as the total count of units showing in infections tile")
    public void totalCountOfUnitsInInfectionsModuleShouldBeSameAsTheTotalCountOfUnitsShowingInInfectionsTile() {
        CountUnitsInPharmacologyModule8Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in infections tile")
    public void userCheckTheTotalCountOfUnitsCompletedInInfectionsTile() {
        CountUnitsInPharmacologyModule8Objects.CheckTotalCountOfUnitsCompletedInInfectionsModule();

    }

    @Then("total count of completed units in infections module is same as the total count of completed units showing in infections tile")
    public void totalCountOfCompletedUnitsInInfectionsModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInInfectionsTile() {
        CountUnitsInPharmacologyModule8Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in infections unit")
    public void userSelectMarkAsCompletedButtonInInfectionsUnit() {
        CountUnitsInPharmacologyModule8Objects.selectMarkAsCompletedBtn();

    }

    @Then("that unit in infections will mark as read")
    public void thatUnitInInfectionsWillMarkAsRead() {
        CountUnitsInPharmacologyModule8Objects.checkUnitIsMarkAsRead();

    }
}
