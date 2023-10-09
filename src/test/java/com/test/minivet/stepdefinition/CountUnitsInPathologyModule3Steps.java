package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CountUnitsInPathologyModule3Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPathologyModule3Steps extends DriverBase{
    com.test.minivet.objects.CountUnitsInPathologyModule3Objects CountUnitsInPathologyModule3Objects = new CountUnitsInPathologyModule3Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and user select the pathology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndUserSelectThePathologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPathologyModule3Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPathologyModule3Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPathologyModule3Objects.selectPathologyTile();

    }

    @When("user check the total count of units in pathology of infections module")
    public void userCheckTheTotalCountOfUnitsInPathologyOfInfectionsModule() {
        CountUnitsInPathologyModule3Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInPathologyOfInfectionsModule();
    }

    @Then("total count of units in pathology of infections module should be same as the total count of units showing in pathology of infections tile")
    public void totalCountOfUnitsInPathologyOfInfectionsModuleShouldBeSameAsTheTotalCountOfUnitsShowingInPathologyOfInfectionsTile() {
        CountUnitsInPathologyModule3Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in pathology of infections tile")
    public void userCheckTheTotalCountOfUnitsCompletedInPathologyOfInfectionsTile() {
        CountUnitsInPathologyModule3Objects.CheckTotalCountOfUnitsCompletedInPathologyOfInfectionodule();
    }

    @Then("total count of completed units in pathology of infections is same as the total count of completed units showing in pathology of infections tile")
    public void totalCountOfCompletedUnitsInPathologyOfInfectionsIsSameAsTheTotalCountOfCompletedUnitsShowingInPathologyOfInfectionsTile() {
        CountUnitsInPathologyModule3Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in pathology of infections unit")
    public void userSelectMarkAsCompletedButtonInPathologyOfInfectionsUnit() {
        CountUnitsInPathologyModule3Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in pathology of infections will mark as read")
    public void thatUnitInPathologyOfInfectionsWillMarkAsRead() {
        CountUnitsInPathologyModule3Objects.checkUnitIsMarkAsRead();
    }
}
