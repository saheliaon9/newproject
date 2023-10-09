package com.test.minivet.stepdefinition;

import com.test.minivet.objects.CompletedExamsObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompletedExamsSteps extends DriverBase {
    com.test.minivet.objects.CompletedExamsObjects CompletedExamsObjects = new CompletedExamsObjects();

    @Given("user has login to mrcem web application")
    public void userHasLoginToMrcemWebApplication() {
        getDriver().get(GetProperty.value("appUrl"));
        CompletedExamsObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password")); }

    @When("user select continue button on completed exams tile")
    public void userSelectContinueButtonOnCompletedExamsTile() {
        CompletedExamsObjects.selectContinueBtnOnCompletedExamsTile();
    }

    @Then("list of completed exams for subject exams and mock exams will be displayed")
    public void listOfCompletedExamsForSubjectExamsAndMockExamsWillBeDisplayed() {
        CompletedExamsObjects.checkListOfSubjectExams();
        CompletedExamsObjects.checkListOfMockExams();
        }
}
