package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.body;
import pages.header;

import java.awt.*;
import java.awt.event.KeyEvent;


public class US013Steps {

    header hd = new header();
    body bd = new body();

    @When("The student clicks on the Attendance Button")
    public void theStudentClicksOnTheAttendanceButton() {
        hd.myClick(hd.attendanceButton);
    }

    @And("The student clicks on the ATTENDANCE EXCUSES")
    public void theStudentClicksOnTheATTENDANCEEXCUSES() {
        bd.myClickWithoutScroll(bd.attendanceExcuses);
    }

    @Then("The student clicks on the Add Button")
    public void theStudentClicksOnTheAddButton() {
        bd.myScriptClick(bd.addButton);
    }

    @And("The student select the type of EXCUSES and the date of EXCUSES")
    public void theStudentSelectTheTypeOfEXCUSESAndTheDateOfEXCUSES() throws AWTException {

        bd.myClick(bd.openCalendar);

        new Robot().keyPress(KeyEvent.VK_CONTROL);
        new Robot().keyPress(KeyEvent.VK_RIGHT);
        new Robot().keyRelease(KeyEvent.VK_CONTROL);
        new Robot().keyRelease(KeyEvent.VK_RIGHT);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        new Robot().keyRelease(KeyEvent.VK_ENTER);
        new Robot().keyPress(KeyEvent.VK_ESCAPE);
        new Robot().keyRelease(KeyEvent.VK_ESCAPE);

    }

    @Then("The student and writes a message sends an EXCUSE")
    public void theStudentAndWritesAMessageSendsAnEXCUSE() throws AWTException, InterruptedException {
        bd.mySendKeys(bd.textField, "I am sick. Attached is my medical certificate");
        bd.myClick(bd.attachFiles);
        bd.myClick(bd.fromLocalButton);

        Robot robot = new Robot();
        robot.delay(1000);

        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        for (int i = 0; i < 7; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        bd.myClick(bd.sendButton);

        hd.verifyContainsText(hd.successMessage, "success");
    }
}
