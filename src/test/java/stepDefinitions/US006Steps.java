package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.time.Duration;

public class US006Steps {
    header hp = new header();
    body bp = new body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
    @When("the student clicks on the Hamburger Menu")
    public void theStudentClicksOnTheHamburgerMenu() {
        mt.myClick(hp.hamburgerMenu);
    }

    @And("selects Messaging > Outbox")
    public void selectsMessagingOutbox() {
        mt.myClick(hp.messagingButton);
        mt.myClick(hp.outboxButton);
    }

    @Then("the student should be directed to the Outbox page")
    public void theStudentShouldBeDirectedToTheOutboxPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Outbox ']")));
        Assert.assertTrue(bp.outbox.getText().toLowerCase().trim().contains("outbox"));
    }

    @When("the student selects the message clicks the move to trash button and confirms")
    public void theStudentSelectsTheMessageClicksTheMoveToTrashButtonAndConfirms() {
        bp.checkbox.click();
        mt.myClick(bp.moveToTrashButton);
        mt.myClick(bp.ConfirmButton);
    }

    @Then("a success message should appear confirming the process")
    public void aSuccessMessageShouldAppearConfirmingTheProcess() {
        mt.verifyContainsText(hp.successMessage, "success");
    }
}
