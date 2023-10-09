package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CountUnitsInAnatomyModule5Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInAnatomyModule5Steps extends DriverBase {

    com.test.minivet.objects.CountUnitsInAnatomyModule5Objects  CountUnitsInAnatomyModule5Objects = new CountUnitsInAnatomyModule5Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select THORAX tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectTHORAXTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInAnatomyModule5Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInAnatomyModule5Objects.selectContinueBtnInRevisionModule();
        CountUnitsInAnatomyModule5Objects.selectAnatomyTile();
    }

    @When("user check the total count of units in THORAX module")
    public void userCheckTheTotalCountOfUnitsInTHORAXModule() {
        CountUnitsInAnatomyModule5Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInTHORAXModule();
    }

    @Then("total count of units in THORAX module should be same as the total count of units showing in THORAX tile")
    public void totalCountOfUnitsInTHORAXModuleShouldBeSameAsTheTotalCountOfUnitsShowingInTHORAXTile() {
        CountUnitsInAnatomyModule5Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in THORAX tile")
    public void userCheckTheTotalCountOfUnitsCompletedInTHORAXTile() {
        CountUnitsInAnatomyModule5Objects.CheckTotalCountOfUnitsCompletedInThoraxModule();
    }

    @Then("total count of completed units in THORAX module is same as the total count of completed units showing in THORAX tile")
    public void totalCountOfCompletedUnitsInTHORAXModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInTHORAXTile() {
        CountUnitsInAnatomyModule5Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in THORAX unit")
    public void userSelectMarkAsCompletedButtonInTHORAXUnit() {  CountUnitsInAnatomyModule5Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in THORAX will mark as read")
    public void thatUnitInTHORAXWillMarkAsRead() {         CountUnitsInAnatomyModule5Objects.checkUnitIsMarkAsRead();

    }
}
