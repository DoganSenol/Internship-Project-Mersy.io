package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.Header;
import pages.body;
import pages.header;
import utilities.BaseDriver;

public class US007Steps {
    header hd=new header();
    body bd=new body();
    @When("The student clicks on the hamburger menu -> messaging menu -> Inbox")
    public void theStudentClicksOnTheHamburgerMenuMessagingMenuInbox() {
        hd.myClick(hd.hamburgerMenu);
        hd.myClick(hd.messagingButton);
        hd.myClick(hd.inboxButton);
    }

    @Then("The student clicks on the move to trash button")
    public void theStudentClicksOnTheMoveToTrashButton() {
        bd.myClick(bd.trashButton);
        bd.myClick(bd.ConfirmButton);
        hd.verifyContainsText(hd.successMessage, "success");


    }

    @When("The student clicks on the hamburger menu -> messaging menu -> Trash")
    public void theStudentClicksOnTheHamburgerMenuMessagingMenuTrash() {
        hd.myClick(hd.hamburgerMenu);
        hd.myClick(hd.messagingButton);
        hd.myClick(hd.trashButton);
    }

    @And("The student restore the messages")
    public void theStudentRestoreTheMessages() {
        bd.myClick(bd.checkBoxUs07);
        bd.myClick(bd.restoreButton);
        hd.verifyContainsText(hd.successMessage, "success");

    }

    @Then("The student delete the messages")
    public void theStudentDeleteTheMessages() {
        bd.myClick(bd.deleteIcon);
        bd.myClick(bd.submitButton);
        hd.verifyContainsText(hd.successMessage, "success");
    }
}
