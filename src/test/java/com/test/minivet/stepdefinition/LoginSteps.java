package com.test.minivet.stepdefinition;
import com.test.minivet.utils.DriverBase;
import com.test.minivet.utils.GetProperty;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.test.minivet.objects.LoginObject;

public class LoginSteps extends DriverBase{


        com.test.minivet.objects.LoginObject LoginObject = new LoginObject();

        @Given("the user has hit the mrcemexamprep URl in the browser")
        public void theUserHasHitTheMrcemexamprepURlInTheBrowser () {

            getDriver().get(GetProperty.value("appUrl"));
            System.out.println("Title of page : "+ getDriver().getTitle());

        }

        @And("select login button")
        public void selectLoginButton() {
                LoginObject.selectLoginButon();
        }

        @When("user enter valid username and password and select signin button")
        public void UserEnterValidUsernameAndPasswordAndSelectSigninButton (){
                LoginObject.enterlogincredentialsAndSelectSignInBtn(GetProperty.value("username"), GetProperty.value("password"));
        }

        @Then("mrcemexamprep dashboard screen will open")
        public void mrcemexamprepDashboardScreenWillOpen () {
                LoginObject.mrcemexamprepDashboardScreenWillOpen();
        }


        @When("user enter invalid username and password and select signin button")
        public void userEnterInvalidUsernameAndPasswordAndSelectSigninButton() {
                LoginObject.enterInvalidUsernameandpassword();
                LoginObject.selectSignButon();
        }

        @Then("error message will show saying Username or email is not registered with us")
        public void errorMessageWillShowSayingUsernameOrEmailIsNotRegisteredWithUs() {
                LoginObject.errorMessageWillShowForEnteringInvalidUsername();
        }

        @When("user enter valid username and invalid password and select signin button")
        public void userEnterValidUsernameAndInvalidPasswordAndSelectSigninButton() {
                LoginObject.enterValidUsernameAndInvalidPassword();
                LoginObject.selectSignButon();
        }

        @Then("error message will show saying password is not valid")
        public void errorMessageWillShowSayingPasswordIsNotValid() {
                LoginObject.errorMessageWillShowSayingPasswordIsNotValid();
        }

        @When("user select signin button without entering valid username and password")
        public void userSelectSigninButtonWithoutEnteringValidUsernameAndPassword() {

                LoginObject.selectSignButon();
        }

        @Then("validation message will show for username and password")
        public void validationMessageWillShowForUsernameAndPassword() {
                LoginObject.checkValidationMesssageForUserNameAndPassword();
        }
}