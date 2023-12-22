package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.Body;
import pages.Header;
import utilities.BaseDriver;

import java.time.Duration;

public class US016Steps {
    Header hp = new Header();
    Body bp = new Body();
    Methods mt = new Methods();

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));

    @When("the evaluation page should be a link \\(Grading) that the student can access.")
    public void theEvaluationPageShouldBeALinkGradingThatTheStudentCanAccess() {
        mt.myClick(hp.gradingButton);
    }

    @Then("the student can select Course Grade , Student Transcript,Transcript by Subject buttons")
    public void theStudentCanSelectCourseGradeStudentTranscriptTranscriptBySubjectButtons() {
        mt.myClick(bp.courseGrade);
        Assert.assertTrue(bp.courseName.getText().toLowerCase().trim().contains("course name"));

        mt.myClick(bp.studentTranscript);
        //Assert.assertTrue(bp.courseCode.getText().toLowerCase().trim().contains("course code"));

        mt.myClick(bp.transccriptSubject);
        Assert.assertTrue(bp.subject.getText().toLowerCase().trim().contains("subject"));
    }

}