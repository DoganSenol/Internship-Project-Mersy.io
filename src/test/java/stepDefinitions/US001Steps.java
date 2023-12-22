package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.BaseDriver;
import utilities.ConfigurationReader;

import java.io.IOException;

public class US001Steps extends ConfigurationReader {
    LoginPage lp= new LoginPage();
    @Given("Navigate to Website")
    public void navigateToWebsite() throws IOException {
        BaseDriver.getDriver().get(getUrl());
    }

    @And("Enter username that as {string} and password that as {string}")
    public void enterUsernameThatAsAndPasswordThatAs(String username, String password) throws IOException {
        lp.mySendKeys(lp.usernameInput,getUserName());
        lp.mySendKeys(lp.passwordInput, getPassword());


    }

    @When("Click login Button")
    public void clickLoginButton() {
        lp.myClick(lp.loginButton);
    }

    @Then("Verify that student logged in")
    public void verifyThatStudentLoggedIn() {
        lp.verifyContainsText(lp.loginVerifyText, "Internship");
    }
}
