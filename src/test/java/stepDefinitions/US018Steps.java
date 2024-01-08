package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Body;
import pages.Header;
import pages.Methods;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class US018Steps {
    Header hp = new Header();
    Body bp = new Body();
    Methods mt = new Methods();

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));

    @When("the student hovers over the Assignments menu on the homepage sees the total number of assigned tasks")
    public void theStudentHoversOverTheAssignmentsMenuOnTheHomepageSeesTheTotalNumberOfAssignedTasks() {
        mt.hover(hp.assignmentsButton);
        Assert.assertTrue(bp.assignmentsTaskAmount.isDisplayed());
        System.out.println("Number of assigned tasks = " + bp.assignmentsTaskAmount.getText().trim());

    }
}
