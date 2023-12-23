package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Body;
import pages.Header;
import pages.Methods;
import utilities.BaseDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class US012Steps {
    Header hp = new Header();
    Body bp = new Body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));

    @When("the student clicks three dots icon for report")
    public void theStudentClicksThreeDotsIconForReport() {
        wait.until(ExpectedConditions.visibilityOf(bp.threeDotsIcon));
        bp.threeDotsIcon.click();
    }

    @And("clicks on the excel report")
    public void clicksOnTheExcelReport() {
        mt.myClick(bp.excelReport);
    }

    @And("clicks on the pdf report")
    public void clicksOnThePdfReport() throws AWTException, InterruptedException {
        bp.threeDotsIcon.click();
        mt.myClick(bp.pdfReport);

        Robot robot = new Robot();
        robot.delay(2000);

        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(2000);
        }
    }
}
