package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import com.test.minivet.objects.CountUnitsInMicrobiologyModule1Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInMicrobiologyModule1Steps 	extends DriverBase {
    com.test.minivet.objects.CountUnitsInMicrobiologyModule1Objects CountUnitsInMicrobiologyModule1Objects = new CountUnitsInMicrobiologyModule1Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and selects microbiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndSelectsMicrobiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInMicrobiologyModule1Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInMicrobiologyModule1Objects.selectContinueBtnInRevisionModule();
        CountUnitsInMicrobiologyModule1Objects.selectMicrobiologyTile();
    }

    @When("user check the total count of units in principles of microbiology module")
    public void userCheckTheTotalCountOfUnitsInPrinciplesOfMicrobiologyModule() {
        CountUnitsInMicrobiologyModule1Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInPrinciplesOfMicrobiologyModule();

    }

    @Then("total count of units in principles of microbiology module should be same as the total count of units showing in principles of microbiology tile")
    public void totalCountOfUnitsInPrinciplesOfMicrobiologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInPrinciplesOfMicrobiologyTile() {
        CountUnitsInMicrobiologyModule1Objects.totalUnitsInModuleIsEqualToTheTotalCountOfunitShowingInTile();

    }

    @When("user check the total count of units completed in principles of microbiology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInPrinciplesOfMicrobiologyTile() {
        CountUnitsInMicrobiologyModule1Objects.CheckTotalCountOfUnitsCompletedInPrinciplesOfMicrobiologyyodule();

    }

    @Then("total count of completed units in principles of microbiology module is same as the total count of completed units showing in principles of microbiology tile")
    public void totalCountOfCompletedUnitsInPrinciplesOfMicrobiologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInPrinciplesOfMicrobiologyTile() {
        CountUnitsInMicrobiologyModule1Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();
    }

    @When("user select  mark as completed button in principles of microbiology unit")
    public void userSelectMarkAsCompletedButtonInPrinciplesOfMicrobiologyUnit() {
        CountUnitsInMicrobiologyModule1Objects.selectMarkAsCompletedBtn();
    }

    @Then("that unit in principles of microbiology will mark as read")
    public void thatUnitInPrinciplesOfMicrobiologyWillMarkAsRead() {
        CountUnitsInMicrobiologyModule1Objects.checkUnitIsMarkAsRead();
    }
}
