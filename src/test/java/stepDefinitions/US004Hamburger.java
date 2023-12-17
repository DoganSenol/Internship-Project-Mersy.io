package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
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
    public void theStudentMustHaveToClickNewMessage() throws AWTException {
        bp.myClick(bp.newMessage);
        bp.verifyContainsText(bp.MessagingBoxText,"New Message");
        new Robot().keyPress(KeyEvent.VK_TAB);
        new Robot().keyRelease(KeyEvent.VK_TAB);


    }

    @Given("The student must have to click Inbox")
    public void theStudentMustHaveToClickInbox() throws AWTException {
        hp.myClick(hp.hamburgerMenu);
        hp.myClick(hp.messagingButton);
        hp.myClick(hp.inboxButton);
        bp.verifyContainsText(bp.MessagingBoxText,"Inbox");
        new Robot().keyPress(KeyEvent.VK_TAB);
        new Robot().keyRelease(KeyEvent.VK_TAB);
    }

    @When("The student must have to click Outbox")
    public void theStudentMustHaveToClickOutbox() throws AWTException {
        hp.myClick(hp.hamburgerMenu);
        mt.myClick(hp.messagingButton);
        bp.myClick(hp.outboxButton);
        bp.verifyContainsText(bp.MessagingBoxText,"Outbox");
        new Robot().keyPress(KeyEvent.VK_TAB);
        new Robot().keyRelease(KeyEvent.VK_TAB);
    }

    @Then("The student must have to click Trash")
    public void theStudentMustHaveToClickTrash() throws AWTException {
        hp.myClick(hp.hamburgerMenu);
        hp.myClick(hp.messagingButton);
        bp.myClick(hp.trashButton);
        bp.verifyContainsText(bp.MessagingBoxText,"Trash");
        new Robot().keyPress(KeyEvent.VK_TAB);
        new Robot().keyRelease(KeyEvent.VK_TAB);
    }
}
