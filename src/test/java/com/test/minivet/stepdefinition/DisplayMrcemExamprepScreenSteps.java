package com.test.minivet.stepdefinition;

import com.test.minivet.objects.DisplayMrcemExamprepScreenObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class DisplayMrcemExamprepScreenSteps extends DriverBase {
    com.test.minivet.objects.DisplayMrcemExamprepScreenObjects  DisplayMrcemExamprepScreenObjects = new DisplayMrcemExamprepScreenObjects();

    @Given("the user has enter the mrcem url in browser")
    public void theUserHasEnterTheMrcemUrlInBrowser() {
        getDriver().get(GetProperty.value("appUrl"));
    }

    @When("the mrcem screen is displayed")
    public void theMrcemScreenIsDisplayed()throws IOException {
        DisplayMrcemExamprepScreenObjects.verifyMRCEMscreen();
    }

    @Then("MRCEm primary and intermediate button, login button will be displayed")
    public void mrcemPrimaryAndIntermediateButtonLoginButtonWillBeDisplayed() {
        DisplayMrcemExamprepScreenObjects.mrcemPrimaryAndIntermediateButtonLoginButtonWillBeDisplayed();
    }

    @And("about the exam, exam tips, buy full access, books, testimonials, sample questions, free resources, contact us buttons will be displayed")
    public void aboutTheExamExamTipsBuyFullAccessBooksTestimonialsSampleQuestionsFreeResourcesContactUsButtonsWillBeDisplayed() {
        DisplayMrcemExamprepScreenObjects.buttonsListWillBeDisplayed(); }

    @And("subscription block is also displayed")
    public void subscriptionBlockIsAlsoDisplayed() {
        DisplayMrcemExamprepScreenObjects.subscriptionBlockIsAlsoDisplayed();
    }
}
