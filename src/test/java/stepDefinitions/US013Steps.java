package stepDefinitions;

import io.cucumber.java.en.When;
import pages.header;

public class US013Steps {

    header hd=new header();
    @When("The student clicks on the Attendance Button")
    public void theStudentClicksOnTheAttendanceButton() {
        hd.myClick(hd.attendanceButton);
    }
}
