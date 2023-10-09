package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInPhysiologyModule3Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPhysiologyModule3Steps extends DriverBase {
    com.test.minivet.objects.CountUnitsInPhysiologyModule3Objects CountUnitsInPhysiologyModule3Objects = new CountUnitsInPhysiologyModule3Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and selects the physiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectsThePhysiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPhysiologyModule3Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPhysiologyModule3Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPhysiologyModule3Objects.selectPhysiologyTile();
    }

    @When("user check the total count of units in endocrine physiology module")
    public void userCheckTheTotalCountOfUnitsInEndocrinePhysiologyModule() {
        CountUnitsInPhysiologyModule3Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInEndocrinePhysiologyModule();

    }

    @Then("total count of units in endocrine physiology module should be same as the total count of units showing in endocrine physiology tile")
    public void totalCountOfUnitsInEndocrinePhysiologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInEndocrinePhysiologyTile() {
        CountUnitsInPhysiologyModule3Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in endocrine physiology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInEndocrinePhysiologyTile() {
        CountUnitsInPhysiologyModule3Objects.CheckTotalCountOfUnitsCompletedInEndocrinePhysiologyModule();

    }

    @Then("total count of completed units in endocrine physiology module is same as the total count of completed units showing in endocrine physiology tile")
    public void totalCountOfCompletedUnitsInEndocrinePhysiologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInEndocrinePhysiologyTile() {
        CountUnitsInPhysiologyModule3Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }

    @When("user select  mark as completed button in endocrine physiology unit")
    public void userSelectMarkAsCompletedButtonInEndocrinePhysiologyUnit() {
        CountUnitsInPhysiologyModule3Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in endocrine physiology will mark as read")
    public void thatUnitInEndocrinePhysiologyWillMarkAsRead() {
            CountUnitsInPhysiologyModule3Objects.checkUnitIsMarkAsRead(); }

}
