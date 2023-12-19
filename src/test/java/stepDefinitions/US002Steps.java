package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homePage;
import utilities.BaseDriver;
import utilities.ConfigurationReader;

import java.time.Duration;

public class US002Steps extends ConfigurationReader {
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
  homePage hp=new homePage();
    @When("User must click on the logo")
    public void userMustClickOnTheLogo() {

        hp.myClick(hp.logoButton);
    }

    @Then("should be able to get to the main page of the course")
    public void shouldBeAbleToGetToTheMainPageOfTheCourse() {

        hp.backPage();
    }

    @And("get general information")
    public void getGeneralInformation() {
    }
}
