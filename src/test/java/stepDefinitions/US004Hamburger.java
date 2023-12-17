package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.body;
import pages.header;
import utilities.BaseDriver;
import java.time.Duration;

public class US004Hamburger {
    header hp = new header();
    body bp = new body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));

    @When("the student click on the Hamburger Menu")
    public void theStudentClickOnTheHamburgerMenu() {
        hp.myClick(hp.hamburgerMenu);

    }
    @And("select  Messaging")
    public void selectMessaging() {
        hp.myClick(hp.messagingButton);

    }
    @Then("The student must have to click New Message")
    public void theStudentMustHaveToClickNewMessage() {
       bp.myClick(bp.newMessage);
       Assert.assertTrue(bp.newMessageText.getText().contains("New Message"), "False");
       //bp.myClick(bp.button);

    }
    @Given("The student must have to click Inbox")
    public void theStudentMustHaveToClickInbox() {
        wait.until(ExpectedConditions.elementToBeClickable(hp.hamburgerMenu));
        hp.myClick(hp.hamburgerMenu);
        hp.myClick(hp.messagingButton);
        hp.myClick(hp.inboxButton);
    }
    @When("The student must have to click Outbox")
    public void theStudentMustHaveToClickOutbox() {
        wait.until(ExpectedConditions.elementToBeClickable(hp.hamburgerMenu));
        hp.myClick(hp.hamburgerMenu);
        mt.myClick(hp.messagingButton);
        bp.myClick(hp.outboxButton);
    }
    @Then("The student must have to click Trash")
    public void theStudentMustHaveToClickTrash() {
        wait.until(ExpectedConditions.elementToBeClickable(hp.hamburgerMenu));
        hp.myClick(hp.hamburgerMenu);
        hp.myClick(hp.messagingButton);
        bp.myClick(hp.trashButton);
    }
 }
