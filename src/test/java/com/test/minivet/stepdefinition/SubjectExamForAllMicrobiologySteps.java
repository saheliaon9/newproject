package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SubjectExamForAllMicrobiologyObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubjectExamForAllMicrobiologySteps extends DriverBase {
    com.test.minivet.objects.SubjectExamForAllMicrobiologyObjects  SubjectExamForAllMicrobiologyObjects = new SubjectExamForAllMicrobiologyObjects();

    @Given("the user has login to MRCEM and select test by subject button in dashboard and select MRCEM primary and select all microbiology button")
    public void theUserHasLoginToMRCEMAndSelectTestBySubjectButtonInDashboardAndSelectMRCEMPrimaryAndSelectAllMicrobiologyButton() {
        getDriver().get(GetProperty.value("appUrl"));
        SubjectExamForAllMicrobiologyObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        SubjectExamForAllMicrobiologyObjects.selectTestBySubject();
        SubjectExamForAllMicrobiologyObjects.SelectStartSubjectSpecificTest();
        SubjectExamForAllMicrobiologyObjects.selectMRCEMPrimary();
        SubjectExamForAllMicrobiologyObjects.selectAllMicrobiologyButton();}

    @When("the user answer all questions in all microbiology screen and select submit exam")
    public void theUserAnswerAllQuestionsInAllMicrobiologyScreenAndSelectSubmitExam() {
        SubjectExamForAllMicrobiologyObjects.AttemptAllQuestions();
        SubjectExamForAllMicrobiologyObjects.clickSubmitBtn();
    }

    @Then("results will be shown in microbiology screen")
    public void resultsWillBeShownInMicrobiologyScreen() {
        SubjectExamForAllMicrobiologyObjects.continueExamAndDashboardBtnIsDisplayed(); }

}

