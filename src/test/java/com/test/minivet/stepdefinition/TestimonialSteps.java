package com.test.minivet.stepdefinition;

import com.test.minivet.objects.TestimonialObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class TestimonialSteps extends DriverBase {
    com.test.minivet.objects.TestimonialObjects  TestimonialObjects = new TestimonialObjects();


    @Given("the user has login to mrcem and hit the home icon")
    public void theUserHasLoginToMrcemAndHitTheHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        TestimonialObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user selects testimonial")
    public void theUserSelectsTestimonial() {
        TestimonialObjects.UserSelectsTestimonial(); }

    @Then("testimonial screen will be displayed")
    public void testimonialScreenWillBeDisplayed() throws IOException {
        TestimonialObjects.testimonialScreenWillBeDisplayed();  }
}
