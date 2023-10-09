package com.test.minivet.stepdefinition;

import com.test.minivet.objects.BooksObjects;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class BooksSteps extends DriverBase {
    com.test.minivet.objects.BooksObjects  BooksObjects = new BooksObjects();

    @Given("the user has login to mrcem and hits home icon")
    public void theUserHasLoginToMrcemAndHitsHomeIcon() {
        getDriver().get(GetProperty.value("appUrl"));
        BooksObjects.loginToMrcemExamPrepWebsiteAndSelectHomeIcon(GetProperty.value("username"), GetProperty.value("password"));
    }

    @When("the user selects books")
    public void theUserSelectsBooks() {
        BooksObjects.theUserSelectsBooks();  }

    @Then("books screen will be displayed")
    public void booksScreenWillBeDisplayed()throws IOException {
        BooksObjects.booksScreenWillBeDisplayed();  }
}
