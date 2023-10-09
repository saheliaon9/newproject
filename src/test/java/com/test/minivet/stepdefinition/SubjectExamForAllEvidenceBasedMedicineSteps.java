package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SubjectExamForAllEvidenceBasedMedicineObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubjectExamForAllEvidenceBasedMedicineSteps  extends DriverBase {
    com.test.minivet.objects.SubjectExamForAllEvidenceBasedMedicineObjects  SubjectExamForAllEvidenceBasedMedicineObjects = new SubjectExamForAllEvidenceBasedMedicineObjects();

    @Given("the user has login to MRCEM and select test by subject button in dashboard and select MRCEM primary and select all evidence based medicine button")
    public void theUserHasLoginToMRCEMAndSelectTestBySubjectButtonInDashboardAndSelectMRCEMPrimaryAndSelectAllEvidenceBasedMedicineButton() {
        getDriver().get(GetProperty.value("appUrl"));
        SubjectExamForAllEvidenceBasedMedicineObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        SubjectExamForAllEvidenceBasedMedicineObjects.selectTestBySubject();
        SubjectExamForAllEvidenceBasedMedicineObjects.SelectStartSubjectSpecificTest();
        SubjectExamForAllEvidenceBasedMedicineObjects.selectMRCEMPrimary();
        SubjectExamForAllEvidenceBasedMedicineObjects.selectAllEvidenceBasedMedicineButton();  }

    @When("the user answer all questions in all evidence based medicine screen and select submit exam")
    public void theUserAnswerAllQuestionsInAllEvidenceBasedMedicineScreenAndSelectSubmitExam() {
        SubjectExamForAllEvidenceBasedMedicineObjects.AttemptAllQuestions();
        SubjectExamForAllEvidenceBasedMedicineObjects.clickSubmitBtn();  }

    @Then("results will be shown in evidence based medicine screen")
    public void resultsWillBeShownInEvidenceBasedMedicineScreen() {
        SubjectExamForAllEvidenceBasedMedicineObjects.continueExamAndDashboardBtnIsDisplayed(); }
}

