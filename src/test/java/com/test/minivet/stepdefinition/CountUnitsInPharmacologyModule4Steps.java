package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.objects.CountUnitsInPharmacologyModule4Objects;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule4Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule4Objects CountUnitsInPharmacologyModule4Objects = new CountUnitsInPharmacologyModule4Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select the Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectThePharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule4Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule4Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule4Objects.selectPharmacologyTile();

    }

    @When("user check the total count of units in endocrine pharmacology module")
    public void userCheckTheTotalCountOfUnitsInEndocrinePharmacologyModule() {
        CountUnitsInPharmacologyModule4Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInEndocrinePharmacologyModule();

    }

    @Then("total count of units in endocrine pharmacology module should be same as the total count of units showing in endocrine pharmacology tile")
    public void totalCountOfUnitsInEndocrinePharmacologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInEndocrinePharmacologyTile() {
        CountUnitsInPharmacologyModule4Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in endocrine pharmacology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInEndocrinePharmacologyTile() {
        CountUnitsInPharmacologyModule4Objects.CheckTotalCountOfUnitsCompletedInEndocrinePharmacologyModule();

    }

    @Then("total count of completed units in endocrine pharmacology module is same as the total count of completed units showing in endocrine pharmacology tile")
    public void totalCountOfCompletedUnitsInEndocrinePharmacologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInEndocrinePharmacologyTile() {
        CountUnitsInPharmacologyModule4Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in endocrine pharmacology unit")
    public void userSelectMarkAsCompletedButtonInEndocrinePharmacologyUnit() {
        CountUnitsInPharmacologyModule4Objects.selectMarkAsCompletedBtn();
         }

    @Then("that unit in endocrine pharmacology unit will mark as read")
    public void thatUnitInEndocrinePharmacologyUnitWillMarkAsRead() {
        CountUnitsInPharmacologyModule4Objects.checkUnitIsMarkAsRead(); }
}
