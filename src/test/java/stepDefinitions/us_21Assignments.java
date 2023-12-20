package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.time.Duration;
import java.util.List;

public class us_21Assignments    {
    header hp = new header();
    body bp = new body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));


    @When("Student clicks on the Assignments")
    public void studentClicksOnTheAssignments() throws InterruptedException {
        hp.myClick(hp.assignmentsButton);
        bp.myClick(bp.semesterButton);
        bp.myClick(bp.allButton);

    }

    @And("Student selects Homework and should be push Submit button and verify")
    public void studentSelectsHomework() {
        for (WebElement element : bp.homeworklist)
        {
            String css= element.getCssValue("border-left-color");
            if (css.equals("rgb(255, 128, 171)")){
                WebElement buton= element.findElement(By.cssSelector("ms-icon-button:nth-child(2)"));
                bp.myClick(buton);
                List<WebElement> dialog = BaseDriver.getDriver().findElements(By.tagName(" mat-dialog-container"));
                Assert.assertTrue(dialog.size() > 0, " -There isnt such button ");

            }

        }

    }

     @And("write text and upload picture")
    public void writeTextAndUploadPicture() {
    }

    @And("click to attach_files icon")
    public void clickToAttach_filesIcon() {
    }

    @Then("save_as_draft the homework")
    public void save_as_draftTheHomework() {
    }

    @And("verify success message")
    public void verifySuccessMessage() {
    }

    @And("click to Send button verify transaction")
    public void clickToSendButtonVerifyTransaction() {
    }

    @And("verify New Submission button")
    public void verifyNewSubmissionButton() {
    }
}
