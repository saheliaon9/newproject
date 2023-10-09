package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SubjectExamForAllAnatomyObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubjectExamForAllAnatomySteps extends DriverBase{
    com.test.minivet.objects.SubjectExamForAllAnatomyObjects  SubjectExamForAllAnatomyObjects = new SubjectExamForAllAnatomyObjects();

    @Given("the user has login to MRCEM and select test by subject button in dashboard and select MRCEM primary and select all anatomy button")
    public void theUserHasLoginToMRCEMAndSelectTestBySubjectButtonInDashboardAndSelectMRCEMPrimaryAndSelectAllAnatomyButton() {
        getDriver().get(GetProperty.value("appUrl"));
        SubjectExamForAllAnatomyObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        SubjectExamForAllAnatomyObjects.selectTestBySubject();
        SubjectExamForAllAnatomyObjects.SelectStartSubjectSpecificTest();
        SubjectExamForAllAnatomyObjects.selectMRCEMPrimary();
        SubjectExamForAllAnatomyObjects.selectAllAnatomyButton();
    }

    @When("the user answer all questions in all anatomy screen and select submit exam")
    public void theUserAnswerAllQuestionsInAllAnatomyScreenAndSelectSubmitExam() {
        SubjectExamForAllAnatomyObjects.AttemptAllQuestions();
        SubjectExamForAllAnatomyObjects.clickSubmitBtn();
    }

    @Then("results will be shown in anatomy screen")
    public void resultsWillBeShownInAnatomyScreen() {
        SubjectExamForAllAnatomyObjects.continueExamAndDashboardBtnIsDisplayed();
    }
}
