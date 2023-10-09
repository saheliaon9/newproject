package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPharmacologyModule7Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule7Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule7Objects CountUnitsInPharmacologyModule7Objects = new CountUnitsInPharmacologyModule7Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and then  selects  Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndThenSelectsPharmacologyTile() {

        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule7Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule7Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule7Objects.selectPharmacologyTile();
    }

    @When("user check the total count of units in immunological products and vaccines module")
    public void userCheckTheTotalCountOfUnitsInImmunologicalProductsAndVaccinesModule() {
        CountUnitsInPharmacologyModule7Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInImmunologicalProductsAndVaccinesModule();

    }

    @Then("total count of units in immunological products and vaccines module should be same as the total count of units showing in immunological products and vaccines tile")
    public void totalCountOfUnitsInImmunologicalProductsAndVaccinesModuleShouldBeSameAsTheTotalCountOfUnitsShowingInImmunologicalProductsAndVaccinesTile() {
        CountUnitsInPharmacologyModule7Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in immunological products and vaccines tile")
    public void userCheckTheTotalCountOfUnitsCompletedInImmunologicalProductsAndVaccinesTile() {
        CountUnitsInPharmacologyModule7Objects.CheckTotalCountOfUnitsCompletedInImmunologicalProductsAndVaccinesodule();

    }

    @Then("total count of completed units in immunological products and vaccines module is same as the total count of completed units showing in immunological products and vaccines tile")
    public void totalCountOfCompletedUnitsInImmunologicalProductsAndVaccinesModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInImmunologicalProductsAndVaccinesTile() {
        CountUnitsInPharmacologyModule7Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in immunological products and vaccines unit")
    public void userSelectMarkAsCompletedButtonInImmunologicalProductsAndVaccinesUnit() {
        CountUnitsInPharmacologyModule7Objects.selectMarkAsCompletedBtn();

    }

    @Then("that unit in immunological products and vaccines will mark as read")
    public void thatUnitInImmunologicalProductsAndVaccinesWillMarkAsRead() {
        CountUnitsInPharmacologyModule7Objects.checkUnitIsMarkAsRead();

    }
}
