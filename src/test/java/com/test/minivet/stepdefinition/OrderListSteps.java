package com.test.minivet.stepdefinition;

import com.test.minivet.objects.OrderListObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderListSteps extends DriverBase {

    com.test.minivet.objects.OrderListObjects  OrderListObjects = new OrderListObjects();

    @Given("the user has login to MRCEM and select my profie option from user menu")
    public void theUserHasLoginToMRCEMAndSelectMyProfieOptionFromUserMenu() {
        getDriver().get(GetProperty.value("appUrl"));
        OrderListObjects.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
    OrderListObjects.SelectsYourProfileOptionFromUserMenu();
    }

    @When("the user selects order button")
    public void theUserSelectsOrderButton() {
        OrderListObjects.theUserSelectsOrderButton();
    }

    @Then("order table is displayed")
    public void orderTableIsDisplayed() {
        OrderListObjects.orderTableIsDisplayed();
    }
}
