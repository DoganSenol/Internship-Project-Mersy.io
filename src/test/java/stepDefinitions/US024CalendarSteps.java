package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.body;
import pages.header;


public class US024CalendarSteps {

    header hd = new header();
    body bd = new body();

    @Given("Student click Calendar button")
    public void studentClickCalendarButton() {
        hd.myClick(hd.calendarButton);
    }

    @When("Student click an any course and verify course information")
    public void studentClickAnAnyCourseAndVerifyCourseInformation() {
        bd.myClick(bd.pbBiologyCourse);
        bd.verifyContainsText(bd.coursesName, "Biology");
        bd.myClick(bd.closeButton);

    }

    @Then("Student click on a course that is not published and verify")
    public void studentClickOnACourseThatIsNotPublishedAndVerify() {
        bd.myClick(bd.biologyCourse);
        bd.displayedAssert(bd.notPublishInfo);
        bd.displayedAssert(bd.notPublishCoursesInfo);
        bd.myClick(bd.closeButton);
    }

    @And("Student click on a published course and verify")
    public void studentClickOnAPublishedCourseAndVerify() {
        bd.myClick(bd.pbBiologyCourse);
        bd.displayedAssert(bd.courseInformation);
        bd.myClick(bd.topicButton);
        bd.clickableAssert(bd.topicButton);
        bd.myClick(bd.attachmentsButton);
        bd.clickableAssert(bd.attachmentsButton);
        bd.myClick(bd.recentEventsButton);
        bd.clickableAssert(bd.recentEventsButton);
    }
}
