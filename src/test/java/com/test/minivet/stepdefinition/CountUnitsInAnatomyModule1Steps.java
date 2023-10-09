package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CountUnitsInAnatomyModule1Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInAnatomyModule1Steps extends DriverBase {

    com.test.minivet.objects.CountUnitsInAnatomyModule1Objects  CountUnitsInAnatomyModule1Objects = new CountUnitsInAnatomyModule1Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select anatomy tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectAnatomyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInAnatomyModule1Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInAnatomyModule1Objects.selectContinueBtnInRevisionModule();
        CountUnitsInAnatomyModule1Objects.selectAnatomyTile();
    }

    @When("user check the total count of units in abdomen and pelvis module")
    public void userCheckTheTotalCountOfUnitsInAbdomenAndPelvisModule() {

        CountUnitsInAnatomyModule1Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInAbdomenAndPelvisModule();
    }

    @Then("total count of units in abdomen and pelvis module should be same as the total count of units showing in abdomen and pelvis tile")
    public void totalCountOfUnitsInAbdomenAndPelvisModuleShouldBeSameAsTheTotalCountOfUnitsShowingInAbdomenAndPelvisTile() {
        CountUnitsInAnatomyModule1Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in abdomen and pelvis tile")
    public void userCheckTheTotalCountOfUnitsCompletedInAbdomenAndPelvisTile() {
        CountUnitsInAnatomyModule1Objects.CheckTotalCountOfUnitsCompletedInAbdomenAndPelvisModule();
    }

    @Then("total count of completed units in abdomen and pelvis module is same as the total count of completed units showing in abdomen and pelvis tile")
    public void totalCountOfCompletedUnitsInAbdomenAndPelvisModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInAbdomenAndPelvisTile() {
        CountUnitsInAnatomyModule1Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in abdomen and pelvis unit")
    public void userSelectMarkAsCompletedButtonInAbdomenAndPelvisUnit() {
        CountUnitsInAnatomyModule1Objects.selectMarkAsCompletedBtn();  }

    @Then("that unit in abdomen and pelvis will mark as read")
    public void thatUnitInAbdomenAndPelvisWillMarkAsRead() {
        CountUnitsInAnatomyModule1Objects.checkUnitIsMarkAsRead();
    }
}
