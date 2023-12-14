package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.Header;
import pages.body;
import pages.header;

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
        bd.myClick(bd.moveToTrashButton);
        bd.myClick(bd.yesButton);
        bd.verifyContainsText(bd.successfullyMessage, "success");
    }
}
