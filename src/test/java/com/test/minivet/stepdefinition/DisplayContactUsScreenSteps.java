package com.test.minivet.stepdefinition;

import com.test.minivet.objects.DisplayContactUsScreenObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplayContactUsScreenSteps extends DriverBase {
    com.test.minivet.objects.DisplayContactUsScreenObjects  DisplayContactUsScreenObjects = new DisplayContactUsScreenObjects();

    @Given("the user has login to MRCEM and selects  home icon")
    public void theUserHasLoginToMRCEMAndSelectsHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        DisplayContactUsScreenObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user selects contact us tab")
    public void theUserSelectsContactUsTab() {
        DisplayContactUsScreenObjects.SelectsContactUsTab();   }

    @Then("contact us screen will be displayed")
    public void contactUsScreenWillBeDisplayed() {
        DisplayContactUsScreenObjects.contactUsScreenWillBeDisplayed();
    }

    @And("selects submit button without entering any data in any field")
    public void selectsSubmitButtonWithoutEnteringAnyDataInAnyField() {
        DisplayContactUsScreenObjects.selectsSubmitButtonWithoutEnteringAnyDataInAnyField();    }

    @Then("validation message will be shown for question field")
    public void validationMessageWillBeShownForQuestionField() {
        DisplayContactUsScreenObjects.validationMessageWillBeShownForQuestionField();  }
}
