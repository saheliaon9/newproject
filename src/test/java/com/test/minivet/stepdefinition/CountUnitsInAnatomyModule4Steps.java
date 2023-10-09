package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CountUnitsInAnatomyModule4Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInAnatomyModule4Steps extends DriverBase {

    com.test.minivet.objects.CountUnitsInAnatomyModule4Objects  CountUnitsInAnatomyModule4Objects = new CountUnitsInAnatomyModule4Objects();
    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select LOWER LIMB tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectLOWERLIMBTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInAnatomyModule4Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInAnatomyModule4Objects.selectContinueBtnInRevisionModule();
        CountUnitsInAnatomyModule4Objects.selectAnatomyTile();
    }

    @When("user check the total count of units in LOWER LIMB module")
    public void userCheckTheTotalCountOfUnitsInLOWERLIMBModule() {
        CountUnitsInAnatomyModule4Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInLowerLimbModule();
    }

    @Then("total count of units in LOWER LIMB module should be same as the total count of units showing in LOWER LIMB tile")
    public void totalCountOfUnitsInLOWERLIMBModuleShouldBeSameAsTheTotalCountOfUnitsShowingInLOWERLIMBTile() {
        CountUnitsInAnatomyModule4Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in LOWER LIMB tile")
    public void userCheckTheTotalCountOfUnitsCompletedInLOWERLIMBTile() {
        CountUnitsInAnatomyModule4Objects.CheckTotalCountOfUnitsCompletedInLowerLimbModule();
    }

    @Then("total count of completed units in LOWER LIMB module is same as the total count of completed units showing in LOWER LIMB tile")
    public void totalCountOfCompletedUnitsInLOWERLIMBModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInLOWERLIMBTile() {
        CountUnitsInAnatomyModule4Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in LOWER LIMB unit")
    public void userSelectMarkAsCompletedButtonInLOWERLIMBUnit() {  CountUnitsInAnatomyModule4Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in LOWER LIMB will mark as read")
    public void thatUnitInLOWERLIMBWillMarkAsRead() {        CountUnitsInAnatomyModule4Objects.checkUnitIsMarkAsRead();

    }
}
