package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CompleteSaveSubjectExamObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompleteSaveSubjectExamSteps extends DriverBase {

    com.test.minivet.objects.CompleteSaveSubjectExamObjects  CompleteSaveSubjectExamObjects = new CompleteSaveSubjectExamObjects();

    @Given("the user has login to mrcem site and select continue button on saved exam and select subject exam")
    public void theUserHasLoginToMrcemSiteAndSelectContinueButtonOnSavedExamAndSelectSubjectExam() {
        getDriver().get(GetProperty.value("appUrl"));
        CompleteSaveSubjectExamObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        CompleteSaveSubjectExamObjects.selectContinueBtnOnSavedExamTile();
        CompleteSaveSubjectExamObjects.selectSubjectExamBTn();
    }

    @When("user select action button from first row in subject exam table")
    public void userSelectActionButtonFromFirstRowInSubjectExamTable() {
        CompleteSaveSubjectExamObjects.selectActionBtnAndGoToNextTab();
    }

    @And("attempt all questions and hit submit exam button")
    public void attemptAllQuestionsAndHitSubmitExamButton() {
        CompleteSaveSubjectExamObjects.attemptAllquestions();
        CompleteSaveSubjectExamObjects.hitSubmitBtn();

    }

    @Then("result section will be displayed")
    public void resultSectionWillBeDisplayed() {
        CompleteSaveSubjectExamObjects.resultSectionWillBedisplayed();
        CompleteSaveSubjectExamObjects.inSavedExamScreenThatSubjectWillNotBeShownAsitIsCompleted();


    }
}
