package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class US020Steps {
    header hp = new header();
    body bp = new body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));

    @When("the student clicks on the Assignments")
    public void theStudentClicksOnTheAssignments() {
        mt.myClick(hp.assignmentsButton);
    }

    @And("selects All from the Semester dropbox")
    public void selectsAllFromTheSemesterDropbox() {
       mt.myClick(bp.semesterDropbox);
       mt.myClick(bp.all);
    }

    @Then("the student views the list of homework items on the Assignments page")
    public void theStudentViewsTheListOfHomeworkItemsOnTheAssignmentsPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(bp.homeworkList.size()>0, "There is no any assigned homework");
        for (int i = 0; i < bp.homeworkList.size(); i++) {
            System.out.println(bp.homeworkList.get(i).getText());
        }
    }

    @And("confirms one of the homeworks' icons displaying information, submission, and favorite icons")
    public void confirmsOneOfTheHomeworksIconsDisplayingInformationSubmissionAndFavoriteIcons() throws InterruptedException {
        mt.hover(bp.firstHomeworkIconsList.get(0));
        wait.until(ExpectedConditions.visibilityOf(bp.iconText));
        Assert.assertTrue(bp.iconText.getText().equals("Assignment"));

        mt.hover(bp.firstHomeworkIconsList.get(1));
        wait.until(ExpectedConditions.visibilityOf(bp.iconText));
        Assert.assertTrue(bp.iconText.getText().equals("Submit"));

        mt.hover(bp.firstHomeworkIconsList.get(2));
        wait.until(ExpectedConditions.visibilityOf(bp.iconText));
        Assert.assertTrue(bp.iconText.getText().equals("Discussion"));

        mt.hover(bp.firstHomeworkIconsList.get(3));
        wait.until(ExpectedConditions.visibilityOf(bp.iconText));
        Assert.assertTrue(bp.iconText.getText().equals("Mark it"));
    }

    @And("Verify the icons are aligned to the right of each homework item")
    public void verifyTheIconsAreAlignedToTheRightOfEachHomeworkItem() {
      String iconPosition = bp.iconsPosition.getAttribute("fxlayoutalign");
      Assert.assertTrue(iconPosition.equals("end center"));
    }
    @When("The student clicks on any part of one of the homeworks item in the list")
    public void theStudentClicksOnAnyPartOfOneOfTheHomeworksItemInTheList() {
        mt.myClick(bp.firstHomeworkPanel);
    }

    @Then("Verify the student is directed to the homework details page")
    public void verifyTheStudentIsDirectedToTheHomeworkDetailsPage() {
        wait.until(ExpectedConditions.visibilityOf(bp.homeworkDetailsPage));
        Assert.assertTrue(bp.homeworkDetailsPage.getText().trim().equals("Assignment"));
    }

    @Then("If the student initiated a discussion for the homework item confirms the discussion icon is visible in the details page")
    public void ifTheStudentInitiatedADiscussionForTheHomeworkItemConfirmsTheDiscussionIconIsVisibleInTheDetailsPage() {
        mt.hover(bp.homeworkDiscussionButton);
        wait.until(ExpectedConditions.visibilityOf(bp.iconText));
        Assert.assertTrue(bp.iconText.getText().equals("Discussion"));
    }
}
