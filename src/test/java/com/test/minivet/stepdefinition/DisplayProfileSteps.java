package com.test.minivet.stepdefinition;

import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import  com.test.minivet.objects.DisplayProfileObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplayProfileSteps extends DriverBase{
    com.test.minivet.objects.DisplayProfileObject DisplayProfileObject = new DisplayProfileObject();

    @Given("the user has login to mrcem")
    public void theUserHasLoginToMrcem() {
        getDriver().get(GetProperty.value("appUrl"));
        DisplayProfileObject.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user select profile option")
    public void theUserSelectProfileOption() {
        DisplayProfileObject.selectProfileOption();

    }

    @Then("profile details will be displayed")
    public void profileDetailsWillBeDisplayed() {
        DisplayProfileObject.profileDetailsWillBeDisplayed();
    }

    @And("change password and order will be displayed")
    public void changePasswordAndOrderWillBeDisplayed() {
        DisplayProfileObject.changePasswordAndOrderWillBeDisplayed();
    }
}
