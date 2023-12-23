package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Body;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class US017Steps {

    Body bd = new Body();

    WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));

    @And("Student can select Student Transcript")
    public void studentCanSelectStudentTranscript() {
        bd.myClick(bd.studentTranscript);
    }

    @When("Student click on print button")
    public void studentClickOnPrintButton() {
        bd.myClick(bd.printButton);

    }

    @Then("Student click download button")
    public void studentClickDownloadButton() throws InterruptedException, AWTException {

        Robot robot = new Robot();
        robot.delay(2000);

        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(2000);
        }
        }
    }

