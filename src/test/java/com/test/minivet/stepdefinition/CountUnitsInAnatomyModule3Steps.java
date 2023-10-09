package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CountUnitsInAnatomyModule3Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInAnatomyModule3Steps extends DriverBase {

    com.test.minivet.objects.CountUnitsInAnatomyModule3Objects  CountUnitsInAnatomyModule3Objects = new CountUnitsInAnatomyModule3Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and select HEAD AND NECK tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectHEADANDNECKTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInAnatomyModule3Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInAnatomyModule3Objects.selectContinueBtnInRevisionModule();
        CountUnitsInAnatomyModule3Objects.selectAnatomyTile();
    }

    @When("user check the total count of units in HEAD AND NECK module")
    public void userCheckTheTotalCountOfUnitsInHEADANDNECKModule() {
        CountUnitsInAnatomyModule3Objects.checkTheTotalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInHeadAndNeckModule();
    }

    @Then("total count of units in HEAD AND NECK module should be same as the total count of units showing in HEAD AND NECK tile")
    public void totalCountOfUnitsInHEADANDNECKModuleShouldBeSameAsTheTotalCountOfUnitsShowingInHEADANDNECKTile() {
        CountUnitsInAnatomyModule3Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();
    }

    @When("user check the total count of units completed in head and neck tile")
    public void userCheckTheTotalCountOfUnitsCompletedInHeadAndNeckTile() {
        CountUnitsInAnatomyModule3Objects.CheckTotalCountOfUnitsCompletedInHeadAndNeckModule();
    }

    @Then("total count of completed units in head and neck module is same as the total count of completed units showing in head and neck tile")
    public void totalCountOfCompletedUnitsInHeadAndNeckModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInHeadAndNeckTile() {
        CountUnitsInAnatomyModule3Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in  head and neck unit")
    public void userSelectMarkAsCompletedButtonInHeadAndNeckUnit() { CountUnitsInAnatomyModule3Objects.selectMarkAsCompletedBtn();


    }

    @Then("that unit in  head and neck will mark as read")
    public void thatUnitInHeadAndNeckWillMarkAsRead() {        CountUnitsInAnatomyModule3Objects.checkUnitIsMarkAsRead();

    }
}
