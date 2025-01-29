package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Body;
import pages.HomePage;
import utilities.BaseDriver;
import utilities.ConfigurationReader;

import java.time.Duration;

public class US002Steps extends ConfigurationReader {
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
  HomePage hp=new HomePage();
  Body bp=new Body();
    @When("User must click on the logo")
    public void userMustClickOnTheLogo() throws InterruptedException {

        hp.myClick(hp.logoButton);
    }

    @Then("should be able to get to the main page of the course")
    public void shouldBeAbleToGetToTheMainPageOfTheCourse() throws InterruptedException {
        hp.backPage();
        hp.wait(3000);
        bp.scrollToElement(bp.programs);
    }

    @And("get general information")
    public void getGeneralInformation() {
    }
}
