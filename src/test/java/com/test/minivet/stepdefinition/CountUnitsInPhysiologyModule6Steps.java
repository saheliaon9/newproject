package com.test.minivet.stepdefinition;
import com.test.minivet.objects.CountUnitsInPhysiologyModule6Objects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CountUnitsInPhysiologyModule6Steps extends DriverBase {
    
    com.test.minivet.objects.CountUnitsInPhysiologyModule6Objects CountUnitsInPhysiologyModule6Objects = new CountUnitsInPhysiologyModule6Objects();

    @Given("the user has login to MCREM exam prep website and select continue button in revision tile and then hit physiology tile")
    public void theUserHasLoginToMCREMExamPrepWebsiteAndSelectContinueButtonInRevisionTileAndThenHitPhysiologyTile() {
        getDriver().get(GetProperty.value("appUrl"));
        CountUnitsInPhysiologyModule6Objects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CountUnitsInPhysiologyModule6Objects.selectContinueBtnInRevisionModule();
        CountUnitsInPhysiologyModule6Objects.selectPhysiologyTile();
    }

    @When("user check the total count of units in respiratory physiology module")
    public void userCheckTheTotalCountOfUnitsInRespiratoryPhysiologyModule() {
        CountUnitsInPhysiologyModule6Objects.checkTheToatalNoOfUnitShowingInTileIsSamesAsNoOfUnitsShowingInRespiratoryPhysiologyModule();

    }

    @Then("total count of units in respiratory physiology module should be same as the total count of units showing in respiratory physiology tile")
    public void totalCountOfUnitsInRespiratoryPhysiologyModuleShouldBeSameAsTheTotalCountOfUnitsShowingInRespiratoryPhysiologyTile() {
        CountUnitsInPhysiologyModule6Objects.CheckTotalCountOfUnitsCompletedInRespiratoryPhysiologyModule();

    }

    @When("user check the total count of units completed in respiratory physiology tile")
    public void userCheckTheTotalCountOfUnitsCompletedInRespiratoryPhysiologyTile() {
        CountUnitsInPhysiologyModule6Objects.CheckTotalCountOfUnitsCompletedInRespiratoryPhysiologyModule();

    }

    @Then("total count of completed units in respiratory physiology module is same as the total count of completed units showing in respiratory physiology tile")
    public void totalCountOfCompletedUnitsInRespiratoryPhysiologyModuleIsSameAsTheTotalCountOfCompletedUnitsShowingInRespiratoryPhysiologyTile() {
        CountUnitsInPhysiologyModule6Objects.totalCompletedUnitsInModuleIsEqualToTheTotalCountOfCompletedUnitShowingInTile();

    }
}
