package com.test.minivet.stepdefinition;

import com.test.minivet.objects.ChangePasswordObject;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordSteps extends DriverBase{
    com.test.minivet.objects.ChangePasswordObject ChangePasswordObject = new ChangePasswordObject();

    @Given("the user login to MRCEM and selects your profile option from user menu")
    public void theUserLoginToMRCEMAndSelectsYourProfileOptionFromUserMenu() {
        getDriver().get(GetProperty.value("appUrl"));
        ChangePasswordObject.loginToMrcemExamPrepWebsite(GetProperty.value("username"), GetProperty.value("password"));
        ChangePasswordObject.SelectsYourProfileOptionFromUserMenu();
}

    @When("the user selects change password button and hit save button without entering data in any field")
    public void theUserSelectsChangePasswordButtonAndHitSaveButtonWithoutEnteringDataInAnyField() {
        ChangePasswordObject.selectChangePasswordBtn();
        ChangePasswordObject.selectSaveBtnWithoutEnteringDataInAnyField();
    }

    @Then("validation message will be shown for old, new and reenter password")
    public void validationMessageWillBeShownForOldNewAndReenterPassword() {
        ChangePasswordObject.validationMessageWillBeShownForOldNewAndReenterPassword();
    }

    @When("the user enter correct old password and enter different password in new and confirm password")
    public void theUserEnterCorrectOldPasswordAndEnterDifferentPasswordInNewAndConfirmPassword() {
        ChangePasswordObject.EnterCorrectOldPassword();
        ChangePasswordObject.EnterDifferentPasswordInNewAndConfirmPassword();
    }

    @Then("alert  will be shown for entering different password in new and confirm password")
    public void alertWillBeShownForEnteringDifferentPasswordInNewAndConfirmPassword() {
        ChangePasswordObject.alertWillBeShown();
    }

    @When("the user enter invalid old password and enter matching password in new and confirm password")
    public void theUserEnterInvalidOldPasswordAndEnterMatchingPasswordInNewAndConfirmPassword() {
        ChangePasswordObject.EnterInvalidOldPassword();
        ChangePasswordObject.EnterMatchingPasswordInNewAndConfirmPassword();
    }

    @Then("all  fields will become blank")
    public void allFieldsWillBecomeBlank() {
        ChangePasswordObject.allFieldsWillBecomeBlank();
    }

    @When("the user enter valid old password and enter matching password in new and confirm password and hit save button")
    public void theUserEnterValidOldPasswordAndEnterMatchingPasswordInNewAndConfirmPasswordAndHitSaveButton() {
        ChangePasswordObject.EnterValidOldPasswordAndEnterMatchingPasswordInNewAndConfirmPasswordAndHitSaveButton(GetProperty.value("password"));
    }

    @Then("password saved successfully message will show")
    public void passwordSavedSuccessfullyMessageWillShow() {

        ChangePasswordObject.passwordSavedSuccessfullyMessageWillShow();
    }

    @When("the user enter old password and new and confirm password less than six and hit save button")
    public void theUserEnterOldPasswordAndNewAndConfirmPasswordLessThanSixAndHitSaveButton() {
        ChangePasswordObject.inAllFieldEnterCharactersLessThanSix();
    }

    @When("the user enter confirm and new password same as old password")
    public void theUserEnterConfirmAndNewPasswordSameAsOldPassword() {
        ChangePasswordObject.EnterConfirmAndNewPasswordSameAsOldPassword(GetProperty.value("password")); }

    @Then("validation message will be shown for entering confirm and new password same as old password")
    public void validationMessageWillBeShownForEnteringConfirmAndNewPasswordSameAsOldPassword() {
        ChangePasswordObject.validationMessageWillBeShownForEnteringConfirmAndNewPasswordSameAsOldPassword();
    }
}
