package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class US05Steps {
    header hd = new header();
    body bd = new body();

    @Given("Student clicks on the Hamburger Menu, messaging and new message button")
    public void theStudentClicksOnTheHamburgerMenuMessagingAndNewMessageButton() {
        hd.myClick(hd.hamburgerMenu);
        hd.myClick(hd.messagingButton);
        hd.myClick(hd.newMessageButton);
    }

    @When("Student clicks on the receivers button and selects receivers")
    public void studentClicksOnTheReceiversButtonAndSelectsReceivers() {
        bd.verifyContainsText(bd.newMessageText, "New Message");
        bd.myClick(bd.receiversButton);
        bd.myClick(bd.receiversCheckbox);
        bd.myClick(bd.addCloseButton);
        bd.displayedAssert(bd.notPublishInfo);
    }

    @Then("Student student writes the subject in the subject field.")
    public void studentStudentWritesTheSubjectInTheSubjectField() {
        bd.myClick(bd.subjectField);
        bd.mySendKeys(bd.subjectTextField, "course notes");
    }

    @And("Student create a table")
    public void studentCreateATable() {
        bd.myClick(bd.tableButton);
        bd.myClick(bd.createTheTable);
        bd.myClick(bd.tableRows);

        WebElement iframe = BaseDriver.getDriver().findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        BaseDriver.getDriver().switchTo().frame(iframe);

        bd.displayedAssert(bd.createdTable);

        BaseDriver.getDriver().switchTo().parentFrame();

        bd.myClick(bd.tableButton);
        bd.myClick(bd.deleteTableButton);
    }

    @When("Student write a text in text area")
    public void studentWriteATextInTextArea() {

        WebElement iframe = BaseDriver.getDriver().findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        BaseDriver.getDriver().switchTo().frame(iframe);

        bd.mySendKeys(bd.messageTextArea, "It's enough to get the locator right ");
        BaseDriver.getDriver().switchTo().parentFrame();

    }

    @Then("Student should be able to attach files to their message")
    public void studentShouldBeAbleToAttachFilesToTheirMessage() throws InterruptedException, AWTException {
        bd.clickableAssert(bd.attachFilesButton);
        bd.myClick(bd.attachFilesButton);
        bd.clickableAssert(bd.msgFromLocalButton);
        bd.myClick(bd.msgFromLocalButton);

        StringSelection photoPath = new StringSelection("/Users/enesbuke/IdeaProjects/Internship-Project-Mersy.io/src/resources/download/DownloadTestData.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photoPath, null);
        Thread.sleep(2000);
        new Robot().keyPress(KeyEvent.VK_CONTROL);
        new Robot().keyPress(KeyEvent.VK_V);
        new Robot().keyRelease(KeyEvent.VK_CONTROL);
        new Robot().keyRelease(KeyEvent.VK_V);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        new Robot().keyRelease(KeyEvent.VK_ENTER);

    }

    @And("Student should be able to send the message successfully")
    public void studentShouldBeAbleToSendTheMessageSuccessfully() {
        bd.myClick(bd.msgSendButton);
        bd.displayedAssert(bd.notPublishInfo);
    }

    @And("Student should be able to see a list of sent message items")
    public void studentShouldBeAbleToSeeAListOfSentMessageItems() {
        hd.myClick(hd.hamburgerMenu);
        hd.myClick(hd.messagingButton);
        hd.myClick(hd.outboxButton);

        bd.verifyContainsText(bd.outboxMessage, "course notes");
        bd.displayedAssert(bd.outboxMessage);
    }
}
