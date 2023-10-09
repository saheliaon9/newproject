package com.test.minivet.stepdefinition;

import com.test.minivet.objects.UntimedMockObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UntimedMockExamSteps extends DriverBase {
    com.test.minivet.objects.UntimedMockObjects UntimedMockObjects = new UntimedMockObjects();

    @Given("the user has login to MRCEM and select untimed mock exam under mock exam")
    public void theUserHasLoginToMRCEMAndSelectUntimedMockExamUnderMockExam() {
        getDriver().get(GetProperty.value("appUrl"));
        UntimedMockObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        UntimedMockObjects.selectMockExam();
        UntimedMockObjects.SelectUntimeMocK();
    }

    @When("the user select start exam button on MRCEM Primary untimed Exam tile")
    public void theUserSelectStartExamButtonOnMRCEMPrimaryUntimedExamTile() {
        UntimedMockObjects.selectStartExam();
    }

    @And("complete untimed mock exam and hit save")
    public void completeUntimedMockExamAndHitSave() {
        UntimedMockObjects.completeMockExam();
        UntimedMockObjects.hitSubmitButton();
    }

    @Then("complete untimed exam record will be shown in complete  exam screen")
    public void completeUntimedExamRecordWillBeShownInCompleteExamScreen() {
        UntimedMockObjects.completeMockExamRecordWillBeShownInCompleteExamScreen();
        UntimedMockObjects.onselectingEyeButtonQuizCompletedScreenWillBeShown();
    }
}
