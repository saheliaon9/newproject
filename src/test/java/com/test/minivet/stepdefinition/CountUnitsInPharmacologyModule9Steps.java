package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPharmacologyModule9Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPharmacologyModule9Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPharmacologyModule9Objects CountUnitsInPharmacologyModule9Objects = new CountUnitsInPharmacologyModule9Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and the user selects Pharmacology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndTheUserSelectsPharmacologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPharmacologyModule9Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPharmacologyModule9Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPharmacologyModule9Objects.selectPharmacologyTile();
    }

    @When("user check the total count of units in musculoskeletal Pharmacology module")
    public void userCheckTheTotalCountOfUnitsInMusculoskeletalPharmacologyModule() {
        CountUnitsInPharmacologyModule9Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInMusculoskeletalPharmacologyModule();

    }

    @Then("total count of units in musculoskeletal Pharmacology module should be same as the total count of units showing in musculoskeletal Pharmacology tile")
    public void totalCountOfUnitsInMusculoskeletalPharmacologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInMusculoskeletalPharmacologyTile() {
        CountUnitsInPharmacologyModule9Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in musculoskeletal Pharmacology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInMusculoskeletalPharmacologyTile() {
        CountUnitsInPharmacologyModule9Objects.CheckTotalCountOfUnitsCompletedInMusculoskeletalPharmacologyodule();

    }

    @Then("total count of completed units in musculoskeletal Pharmacology module is same as the total count of completed units showing in musculoskeletal Pharmacology tile")
    public void totalCountOfCompletedUnitsInMusculoskeletalPharmacologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInMusculoskeletalPharmacologyTile() {
        CountUnitsInPharmacologyModule9Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in musculoskeletal Pharmacology unit")
    public void userSelectMarkAsCompletedButtonInMusculoskeletalPharmacologyUnit() {
        CountUnitsInPharmacologyModule9Objects.selectMarkAsCompletedBtn();

    }

    @Then("that unit in musculoskeletal Pharmacology will mark as read")
    public void thatUnitInMusculoskeletalPharmacologyWillMarkAsRead() {
        CountUnitsInPharmacologyModule9Objects.checkUnitIsMarkAsRead();

    }
}
