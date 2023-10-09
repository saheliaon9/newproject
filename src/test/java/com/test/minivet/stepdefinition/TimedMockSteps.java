package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.objects.TimedMockObjects;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimedMockSteps extends DriverBase{
    com.test.minivet.objects.TimedMockObjects TimedMockObjects = new TimedMockObjects();
    @Given("the user has login to MRCEM and select timed mock exam under mock exam")
    public void theUserHasLoginToMRCEMAndSelectTimedMockExamUnderMockExam() {
        getDriver().get(GetProperty.value("appUrl"));
        TimedMockObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        TimedMockObjects.selectMockExam();
        TimedMockObjects.SelectTimeMocK();
    }

    @When("the user select start exam button on MRCEM Primary Mock Exam tile")
    public void theUserSelectStartExamButtonOnMRCEMPrimaryMockExamTile() {
        TimedMockObjects.selectStartExam();
    }

        @And("complete time mock exam and hit save")
    public void completeTimeMockExamAndHitSave() {
            TimedMockObjects.completeTimeMockExam();
            TimedMockObjects.hitSaveButton();
    }

    @Then("complete mock exam record will be shown in complete  exam screen")
    public void completeMockExamRecordWillBeShownInCompleteExamScreen() {
        TimedMockObjects.completeMockExamRecordWillBeShownInCompleteExamScreen();
        TimedMockObjects.onselectingEyeButtonQuizCompletedScreenWillBeShown();
    }
}
