package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Header;
import pages.LoginPage;
import utilities.BaseDriver;
import utilities.ConfigurationReader;
import utilities.ExcelUtility;

import java.io.IOException;
import java.util.ArrayList;

public class US001Steps extends ConfigurationReader {
    LoginPage lp= new LoginPage();

    Header hd= new Header();
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

    @Then("The Student enter invalid username and password")
    public void theStudentEnterInvalidUsernameAndPassword(DataTable dataTable) {
        ArrayList<ArrayList<String>> table=
                ExcelUtility.getData("src/test/java/apachePOI/TestData.xlsx", "NegativeLoginTest", 2);

        for (int i = 0; i < table.size(); i++) {
            ArrayList<String> row= table.get(i);
            lp.mySendKeys(lp.usernameInput, row.get(0));
            lp.mySendKeys(lp.passwordInput, row.get(1));
            lp.myClick(lp.loginButton);
            lp.verifyContainsText(lp.invalidUserNamePassword, "Invalid");


        }
    }
}
