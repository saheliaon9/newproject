package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPhysiologyModule5Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPhysiologyModule5Steps extends DriverBase{
    com.test.minivet.objects.CountUnitsInPhysiologyModule5Objects CountUnitsInPhysiologyModule5Objects = new CountUnitsInPhysiologyModule5Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and hit physiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndHitPhysiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPhysiologyModule5Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPhysiologyModule5Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPhysiologyModule5Objects.selectPhysiologyTile();
    }

    @When("user check the total count of units in renal physiology module")
    public void userCheckTheTotalCountOfUnitsInRenalPhysiologyModule() {
        CountUnitsInPhysiologyModule5Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInRenalPhysiologyModule();

    }

    @Then("total count of units in renal physiology module should be same as the total count of units showing in renal physiology tile")
    public void totalCountOfUnitsInRenalPhysiologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInRenalPhysiologyTile() {
        CountUnitsInPhysiologyModule5Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in renal physiology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInRenalPhysiologyTile() {
        CountUnitsInPhysiologyModule5Objects.CheckTotalCountOfUnitsCompletedInRenalPhysiologyModule();

    }

    @Then("total count of completed units in renal physiology module is same as the total count of completed units showing in renal physiology tile")
    public void totalCountOfCompletedUnitsInRenalPhysiologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInRenalPhysiologyTile() {
        CountUnitsInPhysiologyModule5Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }
}
