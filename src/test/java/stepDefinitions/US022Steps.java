package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Body;
import pages.Header;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US022Steps {
    Body bd = new Body();
    Header hd = new Header();

    @When("The student clicks on Assignments Button")
    public void theStudentClicksOnAssignmentsButton() {
        hd.myClick(hd.assignmentsButton);
    }

    @Then("The student reset the settings")
    public void theStudentResetTheSettings() throws AWTException {
        bd.myClick(bd.status1);
        bd.myClick(bd.publishedCheckBox);
        new Robot().keyPress(KeyEvent.VK_ESCAPE);
        new Robot().keyRelease(KeyEvent.VK_ESCAPE);
        bd.myClick(bd.semester);
        bd.myClick(bd.alll);
    }

    @And("The student should be able to filter courses from the Courses tab")
    public void theStudentShouldBeAbleToFilterCoursesFromTheCoursesTab() throws AWTException {
        hd.myClick(hd.assignmentsButton);
        bd.myClick(bd.status1);
        bd.myClick(bd.publishedCheckBox);
        new Robot().keyPress(KeyEvent.VK_ESCAPE);
        new Robot().keyRelease(KeyEvent.VK_ESCAPE);
        bd.myClick(bd.semester);
        bd.myClick(bd.alll);
        bd.myClickWithoutScroll(bd.showAll);
        bd.myClick(bd.biology);
        bd.myClick(bd.showAll);
        bd.myClick(bd.chemistry);
        bd.verifyContainsText(bd.assertionChemistry, "Chemistry");
        bd.myClick(bd.showAll);
        bd.myClick(bd.geometry);
        bd.verifyContainsText(bd.assertionGeometry, "Geometry");
        bd.myClick(bd.showAll);
        bd.myClick(bd.dutch);
        bd.verifyContainsText(bd.assertionDutch, "Dutch");
        bd.myClick(bd.showAll);
        bd.myClick(bd.mathematics);
        bd.verifyContainsText(bd.assertionMathematics, "Mathematics");
        bd.myClick(bd.showAll);
        bd.myClick(bd.physical);
        bd.myClick(bd.showAll);
        bd.myClick(bd.spanish);
        bd.verifyContainsText(bd.assertionSpanish, "Spanish");
        bd.myClick(bd.showAll);
        bd.myClick(bd.statistics);
        bd.myClick(bd.showAll);
        bd.myClick(bd.alll);

    }
    @Then("The student should be able to filter courses from the Status tab")
    public void theStudentShouldBeAbleToFilterCoursesFromTheStatusTab() throws AWTException {
        hd.myClick(hd.assignmentsButton);
        bd.myClick(bd.status1);
        bd.myClick(bd.publishedCheckBox);
        new Robot().keyPress(KeyEvent.VK_ESCAPE);
        new Robot().keyRelease(KeyEvent.VK_ESCAPE);
        bd.myClick(bd.semester);
        bd.myClick(bd.alll);
        bd.myClickWithoutScroll(bd.status1);
        bd.myClick(bd.publishedCheckBox);
        bd.verifyContainsText(bd.assertionPublished, "Published");
        bd.myClick(bd.publishedCheckBox);
        bd.myClick(bd.resultsPublishedCheckBox);
        bd.verifyContainsText(bd.assertionResultsPublished, "Results");
        bd.myClick(bd.resultsPublishedCheckBox);
        new Robot().delay(1000);
        new Robot().keyPress(KeyEvent.VK_ESCAPE);
        new Robot().keyRelease(KeyEvent.VK_ESCAPE);
    }

    @And("The student should be able to filter courses from the Semester tab")
    public void theStudentShouldBeAbleToFilterCoursesFromTheSemesterTab() throws AWTException {
        bd.myClick(hd.assignmentsButton);
        bd.myClick(bd.status1);
        bd.myClick(bd.publishedCheckBox);
        new Robot().keyPress(KeyEvent.VK_ESCAPE);
        new Robot().keyRelease(KeyEvent.VK_ESCAPE);
        bd.myClick(bd.semester);
        bd.myClick(bd.alll);
        bd.myClickWithoutScroll(bd.semester);
        bd.myClick(bd.semester1);
        bd.verifyContainsText(bd.semester1, "Semester 1");
        bd.myClickWithoutScroll(bd.semester);
        bd.myClick(bd.semester2);
        bd.verifyContainsText(bd.semester2, "Semester 2");
        bd.myClickWithoutScroll(bd.semester);
        bd.myClick(bd.semesterAll);
        bd.verifyContainsText(bd.semesterAll, "All");


    }

    @And("The student should be able to filter courses from the Show By tab")
    public void theStudentShouldBeAbleToFilterCoursesFromTheShowByTab() throws AWTException {
        bd.myClick(hd.assignmentsButton);
        bd.myClick(bd.status1);
        bd.myClick(bd.publishedCheckBox);
        new Robot().keyPress(KeyEvent.VK_ESCAPE);
        new Robot().keyRelease(KeyEvent.VK_ESCAPE);
        bd.myClick(bd.semester);
        bd.myClick(bd.alll);
        bd.myClickWithoutScroll(bd.showBy);
        bd.myClick(bd.defaultBy);
        bd.verifyContainsText(bd.defaultBy, "Default View");
        bd.myClickWithoutScroll(bd.showBy);
        bd.myClick(bd.showByCourse);
        bd.verifyContainsText(bd.showByCourse, "Course");
        bd.myClickWithoutScroll(bd.showBy);
        bd.myClick(bd.showByType);
        bd.verifyContainsText(bd.showByType, "Type");
        bd.myClickWithoutScroll(bd.showBy);
        bd.myClick(bd.showByDate);
        bd.verifyContainsText(bd.showByDate, "Date");
        bd.myClickWithoutScroll(bd.showBy);
        bd.myClick(bd.showByChart);
        bd.verifyContainsText(bd.showByChart, "Chart");
    }
}










