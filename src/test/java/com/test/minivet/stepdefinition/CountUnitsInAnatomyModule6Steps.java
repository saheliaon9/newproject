package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CountUnitsInAnatomyModule5Objects;
import com.test.minivet.objects.CountUnitsInAnatomyModule6Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInAnatomyModule6Steps extends DriverBase {

    com.test.minivet.objects.CountUnitsInAnatomyModule6Objects  CountUnitsInAnatomyModule6Objects = new CountUnitsInAnatomyModule6Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select upper limb tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectUpperLimbTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInAnatomyModule6Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInAnatomyModule6Objects.selectContinueBtnInRevisionModule();
        CountUnitsInAnatomyModule6Objects.selectAnatomyTile();
    }

    @When("user check the total count of units in upper limb module")
    public void userCheckTheTotalCountOfUnitsInUpperLimbModule() {
        CountUnitsInAnatomyModule6Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInUpperLimbModule();

    }

    @Then("total count of units in upper limb module should be same as the total count of units showing in upper limb tile")
    public void totalCountOfUnitsInUpperLimbModuleShouldBeSameAsTheTotalCountOfUnitsShowingInUpperLimbTile() {
        CountUnitsInAnatomyModule6Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in UPPER LIMB tile")
    public void userCheckTheTotalCountOfUnitsCompletedInUPPERLIMBTile() {
        CountUnitsInAnatomyModule6Objects.CheckTotalCountOfUnitsCompletedInUpperLimbModule();
    }

    @Then("total count of completed units in UPPER LIMB module is same as the total count of completed units showing in UPPER LIMB tile")
    public void totalCountOfCompletedUnitsInUPPERLIMBModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInUPPERLIMBTile() {


        CountUnitsInAnatomyModule6Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in UPPER LIMB unit")
    public void userSelectMarkAsCompletedButtonInUPPERLIMBUnit() {
    }

    @Then("that unit in UPPER LIMB will mark as read")
    public void thatUnitInUPPERLIMBWillMarkAsRead() {
    }
}

