package com.test.minivet.stepdefinition;

import com.test.minivet.objects.QuestionReviewObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuestionReviewSteps extends DriverBase {
    com.test.minivet.objects.QuestionReviewObjects QuestionReviewObjects = new QuestionReviewObjects();

    @Given("the user has login in to mrcem web application and select continue button on question review tile")
    public void theUserHasLoginInToMrcemWebApplicationAndSelectContinueButtonOnQuestionReviewTile() {
        getDriver().get(GetProperty.value("appUrl"));
        QuestionReviewObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        QuestionReviewObjects.SelectContinueButtonOnQuestionReviewTile();
    }

    @When("the user search with subject")
    public void theUserSearchWithSubject() {
        QuestionReviewObjects.searchWithSubject();
    }

    @Then("if record exists searched subject will be displayed in the table")
    public void ifRecordExistsSearchedSubjectWillBeDisplayedInTheTable() {
        QuestionReviewObjects.SearchedSubjectWillBeDisplayedInTheTable();
    }

    @When("the user is in question review screen")
    public void theUserIsInQuestionReviewScreen() {
    }

    @Then("question type, subject and type search fields will be displayed")
    public void questionTypeSubjectAndTypeSearchFieldsWillBeDisplayed() {
        QuestionReviewObjects.questionTypeSubjectAndTypeSearchFieldsWillBeDisplayed();
    }

    @And("after search question review table will be displayed")
    public void afterSearchQuestionReviewTableWillBeDisplayed() {
        QuestionReviewObjects.afterSearchQuestionReviewTableWillBeDisplayed();
    }
}
