package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SubjectExamForAllPharmacologyObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubjectExamForAllPharmacologySteps extends DriverBase {
    com.test.minivet.objects.SubjectExamForAllPharmacologyObjects  SubjectExamForAllPharmacologyObjects = new SubjectExamForAllPharmacologyObjects();

    @Given("the user has login to MRCEM and select test by subject button in dashboard and select MRCEM primary and select all pharmacology button")
    public void theUserHasLoginToMRCEMAndSelectTestBySubjectButtonInDashboardAndSelectMRCEMPrimaryAndSelectAllPharmacologyButton() {
        getDriver().get(GetProperty.value("appUrl"));
        SubjectExamForAllPharmacologyObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        SubjectExamForAllPharmacologyObjects.selectTestBySubject();
        SubjectExamForAllPharmacologyObjects.SelectStartSubjectSpecificTest();
        SubjectExamForAllPharmacologyObjects.selectMRCEMPrimary();
        SubjectExamForAllPharmacologyObjects.selectAllPharmacologyButton(); }

    @When("the user answer all questions in all pharmacology screen and select submit exam")
    public void theUserAnswerAllQuestionsInAllPharmacologyScreenAndSelectSubmitExam() {
        SubjectExamForAllPharmacologyObjects.AttemptAllQuestions();
        SubjectExamForAllPharmacologyObjects.clickSubmitBtn(); }



    @Then("results will be shown in pharmacology screen")
    public void resultsWillBeShownInPharmacologyScreen() {
        SubjectExamForAllPharmacologyObjects.continueExamAndDashboardBtnIsDisplayed(); }

}
