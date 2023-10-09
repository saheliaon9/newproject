package com.test.minivet.stepdefinition;

import com.test.minivet.objects.SavedExamsObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SavedExamsSteps extends DriverBase {
    com.test.minivet.objects.SavedExamsObjects SavedExamsObjects = new SavedExamsObjects();

    @Given("the user has login to mrcem web application")
    public void theUserHasLoginToMrcemWebApplication() {
        getDriver().get(GetProperty.value("appUrl"));
        SavedExamsObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("user select continue button on saved exams tile")
    public void userSelectContinueButtonOnSavedExamsTile() {
        SavedExamsObjects.selectContinueBtnOnSavedExamsTile();
    }

    @Then("list of saved exams for subject exams and mock exams will be displayed")
    public void listOfSavedExamsForSubjectExamsAndMockExamsWillBeDisplayed() {
        SavedExamsObjects.checkListOfSubjectExams();
        SavedExamsObjects.checkListOfMockExams();
    }
}
