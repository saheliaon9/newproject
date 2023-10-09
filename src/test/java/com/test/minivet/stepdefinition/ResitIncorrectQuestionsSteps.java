package com.test.minivet.stepdefinition;

import com.test.minivet.objects.ResitIncorrectQuestionsObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResitIncorrectQuestionsSteps extends DriverBase {
    com.test.minivet.objects.ResitIncorrectQuestionsObjects  ResitIncorrectQuestionsObjects = new ResitIncorrectQuestionsObjects();

    @Given("the user has login to mrcem web application and select continue button on resit incorrect questions tile")
    public void theUserHasLoginToMrcemWebApplicationAndSelectContinueButtonOnResitIncorrectQuestionsTile() {
        getDriver().get(GetProperty.value("appUrl"));
        ResitIncorrectQuestionsObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        ResitIncorrectQuestionsObjects.selectContinueButtonOnResitIncorrectQuestionsTile();
    }

    @When("the select start exam button on mrcemprimary tile")
    public void theSelectStartExamButtonOnMrcemprimaryTile() {
        ResitIncorrectQuestionsObjects.selectplaybutton();
}

    @Then("tiles under resit incorrect section will be displayed")
    public void tilesUnderResitIncorrectSectionWillBeDisplayed() {
        ResitIncorrectQuestionsObjects.displayTilesUnderResitIncorrectQuestions();
    }

    @And("select start exam on any one tile")
    public void selectStartExamOnAnyOneTile() {
        ResitIncorrectQuestionsObjects.selectStartExamOnAnyOneTile();
    }

    @And("attempt all questions and hit save button")
    public void attemptAllQuestionsAndHitSaveButton() {
        ResitIncorrectQuestionsObjects.attemptAllQuestions();
        ResitIncorrectQuestionsObjects.hitSaveButton();
    }


    @Then("results section and go to dashboard button will be displayed")
    public void resultsSectionAndGoToDashboardButtonWillBeDisplayed() {
        ResitIncorrectQuestionsObjects.resultsSectionAndGoToDashboardButtonWillBeDisplayed();
    }
}
