package com.test.minivet.stepdefinition;

import com.test.minivet.objects.ChangeAnswerAndPauseExamInTimeMockObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeAnswerAndPauseExamInTimeMockSteps extends DriverBase{
    com.test.minivet.objects.ChangeAnswerAndPauseExamInTimeMockObjects  ChangeAnswerAndPauseExamInTimeMockObjects = new ChangeAnswerAndPauseExamInTimeMockObjects();

    @Given("the user has login to mrcem and enter into time mock exam")
    public void theUserHasLoginToMrcemAndEnterIntoTimeMockExam() {
        getDriver().get(GetProperty.value("appUrl"));
        ChangeAnswerAndPauseExamInTimeMockObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        ChangeAnswerAndPauseExamInTimeMockObjects.selectMockExam();
        ChangeAnswerAndPauseExamInTimeMockObjects.SelectTimeMocK();
        ChangeAnswerAndPauseExamInTimeMockObjects.selectStartExam();

    }

    @When("user click change answer button to change option")
    public void userClickChangeAnswerButtonToChangeOption() {
        ChangeAnswerAndPauseExamInTimeMockObjects.selectChangeAnswerBtn(); }

    @Then("user is allowed to select option")
    public void userIsAllowedToSelectOption() {
        ChangeAnswerAndPauseExamInTimeMockObjects.userIsAllowedToSelectOption();}

    @When("user select pause exam button")
    public void userSelectPauseExamButton() {
        ChangeAnswerAndPauseExamInTimeMockObjects.SelectPauseExamButton(); }

    @Then("dashboard screen will be displayed")
    public void dashboardScreenWillBeDisplayed() {
        ChangeAnswerAndPauseExamInTimeMockObjects.dashboardScreenWillBeDisplayed();
    }
}
