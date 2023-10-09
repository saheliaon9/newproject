package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SaveAndCompleteSubjectExamObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaveAndCompleteSubjectExamSteps extends DriverBase {
    com.test.minivet.objects.SaveAndCompleteSubjectExamObjects  SaveAndCompleteSubjectExamObjects = new SaveAndCompleteSubjectExamObjects();

    @Given("the user has login to mRCEM and selects start by specific subject exam")
    public void theUserHasLoginToMRCEMAndSelectsStartBySpecificSubjectExam() {
        getDriver().get(GetProperty.value("appUrl"));
        SaveAndCompleteSubjectExamObjects.loginToMrcemExamPrepWebsiteAndSelectStartBySpecificSubjectExam(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user selects any tile in subject exam screen")
    public void theUserSelectsAnyTileInSubjectExamScreen() {
        SaveAndCompleteSubjectExamObjects.SelectsAnyTileInSubjectExamScreen();  }

    @And("attempt few questions and select dashboard button and selects continue button on save exam tile")
    public void attemptFewQuestionsAndSelectDashboardButtonAndSelectsContinueButtonOnSaveExamTile() {
        SaveAndCompleteSubjectExamObjects.attemptFewQuestions();
    }

    @Then("that subject will be shown in saved exam screen")
    public void thatSubjectWillBeShownInSavedExamScreen() {
            SaveAndCompleteSubjectExamObjects.SelectDashboardButtonAndSelectsContinueButtonOnSaveExamTile();
        SaveAndCompleteSubjectExamObjects.thatSubjectWillBeShownInSavedExamScreen(); }

    @And("attempt few questions and select submit button and select dashboard button and selects continue button on complete exam tile")
    public void attemptFewQuestionsAndSelectSubmitButtonAndSelectDashboardButtonAndSelectsContinueButtonOnCompleteExamTile() {
        SaveAndCompleteSubjectExamObjects.attemptQuestions();
        SaveAndCompleteSubjectExamObjects.clickSubmitBtn();
        SaveAndCompleteSubjectExamObjects.SelectDashboardButtonAndSelectsContinueButtonOnCompleteExamTile();
    }

        @Then("that subject will be shown in complete exam screen")
        public void thatSubjectWillBeShownInCompleteExamScreen () {
        SaveAndCompleteSubjectExamObjects.thatSubjectWillBeShownInCompleteExamScreen();
    }

    }
