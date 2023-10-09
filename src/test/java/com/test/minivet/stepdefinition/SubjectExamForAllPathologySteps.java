package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SubjectExamForAllPathologyObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubjectExamForAllPathologySteps extends DriverBase {
    com.test.minivet.objects.SubjectExamForAllPathologyObjects  SubjectExamForAllPathologyObjects = new SubjectExamForAllPathologyObjects();

    @Given("the user has login to MRCEM and select test by subject button in dashboard and select MRCEM primary and select all pathology button")
    public void theUserHasLoginToMRCEMAndSelectTestBySubjectButtonInDashboardAndSelectMRCEMPrimaryAndSelectAllPathologyButton() {
        getDriver().get(GetProperty.value("appUrl"));
        SubjectExamForAllPathologyObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        SubjectExamForAllPathologyObjects.selectTestBySubject();
        SubjectExamForAllPathologyObjects.SelectStartSubjectSpecificTest();
        SubjectExamForAllPathologyObjects.selectMRCEMPrimary();
        SubjectExamForAllPathologyObjects.selectAllPathologyButton(); }

    @When("the user answer all questions in all pathology screen and select submit exam")
    public void theUserAnswerAllQuestionsInAllPathologyScreenAndSelectSubmitExam() {
        SubjectExamForAllPathologyObjects.AttemptAllQuestions();
        SubjectExamForAllPathologyObjects.clickSubmitBtn(); }

    @Then("results will be shown in pathology screen")
    public void resultsWillBeShownInPathologyScreen() {
        SubjectExamForAllPathologyObjects.continueExamAndDashboardBtnIsDisplayed(); }
}

