package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Body;
import pages.Header;
import utilities.BaseDriver;

import java.time.Duration;

public class US025Steps {
    Header hd = new Header();
    Body bp = new Body();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));


    @Given("As a Student  click Calendar Button")
    public void asAStudentClickCalendarButton() {
        hd.myClick(hd.calendarButton);
    }
    @When("Student click previous button")
    public void studentClickPreviousButton() {
        bp.myClick(bp.previousicon);

    }

    @Then("Student click on a ended course")
    public void studentClickOnAEndedCourse() {
        bp.myClick(bp.endedCourse);


    }

    @And("Click to Recording Button")
    public void clickToRecordingButton() throws InterruptedException {
        bp.myClick(bp.recordingButon);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='ng-star-inserted']")));
        WebElement iframe = BaseDriver.getDriver().findElement(By.xpath("//iframe[@class='ng-star-inserted']"));
        BaseDriver.getDriver().switchTo().frame(iframe);
        bp.myClick(bp.startButon);
    }
}
