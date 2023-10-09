package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.test.minivet.objects.CountUnitsInEvidenceBasedModuleObjects;

public class CountUnitsInEvidenceBasedModuleSteps extends DriverBase{

    com.test.minivet.objects.CountUnitsInEvidenceBasedModuleObjects  CountUnitsInEvidenceBasedModuleObjects = new CountUnitsInEvidenceBasedModuleObjects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInEvidenceBasedModuleObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInEvidenceBasedModuleObjects.selectContinueBtnInRevisionModule();
    }


    @When("user check the total count of units in evidence based medicine module")
    public void userCheckTheTotalCountOfUnitsInEvidenceBasedMedicineModule() {
        CountUnitsInEvidenceBasedModuleObjects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInEvidenceModule();
    }

    @Then("total count of units in evidence based medicine module should be same as the total count of units showing in evidence based medicine tile")
    public void totalCountOfUnitsInEvidenceBasedMedicineModuleShouldBeSameAsTheTotalCountOfUnitsShowingInEvidenceBasedMedicineTile() {
        CountUnitsInEvidenceBasedModuleObjects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in evidence based medicine module")
    public void userCheckTheTotalCountOfUnitsCompletedInEvidenceBasedMedicineModule() {
        CountUnitsInEvidenceBasedModuleObjects.CheckTotalCountOfUnitsCompletedInEvidenceBasedMedicineModule();
    }

    @Then("total count of completed units in evidence based medicine module is same as the total count of completed units showing in evidence based medicine tile")
    public void totalCountOfCompletedUnitsInEvidenceBasedMedicineModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInEvidenceBasedMedicineTile() {
        CountUnitsInEvidenceBasedModuleObjects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }


    @When("user select  mark as completed button in evidence based medicine unit")
    public void userSelectMarkAsCompletedButtonInEvidenceBasedMedicineUnit() {
        CountUnitsInEvidenceBasedModuleObjects.selectMarkAsCompletedBtn(); }

    @Then("that unit in evidence based medicine will mark as read")
    public void thatUnitInEvidenceBasedMedicineWillMarkAsRead() {
        CountUnitsInEvidenceBasedModuleObjects.checkUnitIsMarkAsRead();
}
}