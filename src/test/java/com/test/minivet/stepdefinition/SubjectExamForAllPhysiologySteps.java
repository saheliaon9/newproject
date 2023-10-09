package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SubjectExamForAllPhysiologyObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubjectExamForAllPhysiologySteps  extends DriverBase {
    com.test.minivet.objects.SubjectExamForAllPhysiologyObjects  SubjectExamForAllPhysiologyObjects = new SubjectExamForAllPhysiologyObjects();

    @Given("the user has login to MRCEM and select test by subject button in dashboard and select MRCEM primary and select all physiology button")
    public void theUserHasLoginToMRCEMAndSelectTestBySubjectButtonInDashboardAndSelectMRCEMPrimaryAndSelectAllPhysiologyButton() {
        getDriver().get(GetProperty.value("appUrl"));
        SubjectExamForAllPhysiologyObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        SubjectExamForAllPhysiologyObjects.selectTestBySubject();
        SubjectExamForAllPhysiologyObjects.SelectStartSubjectSpecificTest();
        SubjectExamForAllPhysiologyObjects.selectMRCEMPrimary();
        SubjectExamForAllPhysiologyObjects.selectAllPhysiologyBtnButton(); }

    @When("the user answer all questions in all physiology screen and select submit exam")
    public void theUserAnswerAllQuestionsInAllPhysiologyScreenAndSelectSubmitExam() {
        SubjectExamForAllPhysiologyObjects.AttemptAllQuestions();
        SubjectExamForAllPhysiologyObjects.clickSubmitBtn(); }

    @Then("results will be shown in physiology screen")
    public void resultsWillBeShownInPhysiologyScreen() {
        SubjectExamForAllPhysiologyObjects.continueExamAndDashboardBtnIsDisplayed();
    }
}
