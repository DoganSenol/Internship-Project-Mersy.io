package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.body;

import java.util.Arrays;
import java.util.List;

public class US003 {

    body el = new body();

    @When("Click Coures Button")
    public void clickCouresButton() {
        el.myClick(el.coursesButton);
    }

    @Then("Should be Welcome")
    public void shouldBeWelcome() {
        el.verifyContainsText(el.welcomeText, "Welcome, Student_5 11A !");
    }

    @When("Click Calendar Button")
    public void clickCalendarButton() {
        el.myClick(el.calendarButton);
    }

    @Then("Should be Calendar word")
    public void shouldBeCalendarWord() {
        el.verifyContainsText(el.calendarText, "Calendar");
    }

    @When("Click Attendance button")
    public void clickAttendanceButton() {
        el.myClick(el.attendanceButton);
    }

    @Then("Should be Attendance word")
    public void shouldBeAttendanceWord() {
        el.verifyContainsText(el.attendanceText, "Attendance");
    }

    @When("Click Assignments button")
    public void clickAssignmentsButton() {
        el.myClick(el.assignmentsButton);
    }

    @Then("Should see Assifnments")
    public void shouldSeeAssifnments() {
        el.verifyContainsText(el.assigmentsText, "Assignments");
    }

    @When("Click Grading button")
    public void clickGradingButton() {
        el.myClick(el.gradingButton);
    }

    @Then("Should see Grading")
    public void shouldSeeGrading() {
        el.verifyContainsText(el.gradingText, "Grading");
    }

    @When("Click Hamburg button")
    public void clickHamburgButton() {
        el.myClick(el.hamburgerMenu);
    }

    @Then("Should see Messaging,Finance,Education,Video Conference,Surveyd")
    public void shouldSeeMessagingFinanceEducationVideoConferenceSurveyd() {
        List<String> stringList = Arrays.asList("Messaging", "Finance", "Education", "Video Conference", "Surveys");
        el.verifyMenuItems(el.hamburgMenuList, stringList);

    }

    @When("Click Chats button")
    public void clickMessageButton() {
        el.myClick(el.chatsButton);
    }


    @Then("Should see Student_5_11A_Mark Zuckerberg")
    public void shouldSeeStudent__A_MarkZuckerberg() {
        el.verifyContainsText(el.chatsWindow, "Student_5 11A - Mark Zuckerberg");
    }

    @When("Click Messages button")
    public void clickMessagesButton() {
        el.myClick(el.messageBoxButton);
    }


    @Then("Should see Messages window")
    public void shouldSeeMessagesWindow() {
        el.verifyContainsText(el.messagesText, "Messages");
    }

    @When("Click Profile button")
    public void clickProfileButton() {
        el.myClick(el.profileButton);
    }

    @Then("Shold see My Certificates,My Files,Change Password,Settings,Sign Out")
    public void sholdSeeMyCertificatesMyFilesChangePasswordSettingsSignOut() {
        List<String> stringList = Arrays.asList("My Certificates","My Files","Change Password","Settings","Sign Out");
        el.verifyMenuItems(el.profileButtonList,stringList);
    }
}
