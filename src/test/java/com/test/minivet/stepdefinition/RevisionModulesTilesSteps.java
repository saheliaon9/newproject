package com.test.minivet.stepdefinition;

import com.test.minivet.objects.RevisionModulesTilesObject;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RevisionModulesTilesSteps extends DriverBase{

    com.test.minivet.objects.RevisionModulesTilesObject RevisionModulesTilesObject = new RevisionModulesTilesObject();

    @Given("the user has login to MCREM exam prep website")
    public void theUserHasLoginToMCREMExamPrepWebsite() {
        getDriver().get(GetProperty.value("appUrl"));
        RevisionModulesTilesObject.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("user select continue in revision module tile")
    public void userSelectContinueInRevisionModuleTile() {
        RevisionModulesTilesObject.selectContinueInRevisionModuleTile();
    }

    @Then("anatomy, physiology, pharmacology, microbiology, pathology, evidence based medicine tiles under physiology will be shown")
    public void anatomyPhysiologyPharmacologyMicrobiologyPathologyEvidenceBasedMedicineTilesUnderPhysiologyWillBeShown() {
        RevisionModulesTilesObject.tilesUnderPhysiologywillBeshown();
    }

    @When("user select anatomy tile")
    public void userSelectAnatomyTile() {
        RevisionModulesTilesObject.selectAnatomytile();
    }

    @Then("tile under anatomy will be shown")
    public void tileUnderAnatomyWillBeShown() {
        RevisionModulesTilesObject.checkAnatomySubtiles();
    }

    @When("user select physiology tile")
    public void userSelectPhysiologyTile() {
        RevisionModulesTilesObject.SelectPhysiologyTile();
    }

    @Then("tile under physiology will be shown")
    public void tileUnderPhysiologyWillBeShown() {
        RevisionModulesTilesObject.checkPhysiologySubtiles();
    }

    @When("user select microbiology tile")
    public void userSelectMicrobiologyTile() {
        RevisionModulesTilesObject.selectMicrobiologyTile();
    }

    @Then("tile under microbiology will be shown")
    public void tileUnderMicrobiologyWillBeShown() {
        RevisionModulesTilesObject.checkMicrobiologySubtiles();
    }

    @When("user select pathology tile")
    public void userSelectPathologyTile() {
        RevisionModulesTilesObject.selectPathologyTile();
    }

    @Then("tile under pathology will be shown")
    public void tileUnderPathologyWillBeShown() {
        RevisionModulesTilesObject.selectPathologySubtiles();
    }

    @When("user select pharmacology tile")
    public void userSelectPharmacologyTile() {
        RevisionModulesTilesObject.SelectPharmacologyTile();
    }

    @Then("tile under pharmacology will be shown")
    public void tileUnderPharmacologyWillBeShown() {
        RevisionModulesTilesObject.checkPharmacologySubtiles();
    }
}
