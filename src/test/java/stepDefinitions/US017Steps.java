package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.body;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class US017Steps {

    body bd = new body();

    WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));

    @And("Student can select Student Transcript")
    public void studentCanSelectStudentTranscript() {
        bd.myClick(bd.studentTranscript);
    }

    @When("Student click on print button")
    public void studentClickOnPrintButton() {
        bd.myClick(bd.printButton);

    }

    @Then("Student click download button")
    public void studentClickDownloadButton() throws InterruptedException {

        Thread.sleep(2000);

        Set<String> handles = BaseDriver.getDriver().getWindowHandles();
        System.out.println("handles = " + handles);

        Iterator<String> it = handles.iterator();
        String parentWind = it.next();
        System.out.println("parentWind = " + parentWind);
        String childWind = it.next();
        System.out.println("childWind = " + childWind);

        BaseDriver.getDriver().switchTo().window(childWind);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#viewer")));

        WebElement element = BaseDriver.getDriver().findElement(By.cssSelector("pdf-viewer#viewer")).getShadowRoot()
                .findElement(By.cssSelector("viewer-toolbar#toolbar")).getShadowRoot().findElement(By.cssSelector("viewer-download-controls#")).getShadowRoot()
                .findElement(By.cssSelector("cr-icon-button#download"));
        bd.myClick(element);
        }



        @And("Student must download successfully.")
        public void studentMustDownloadSuccessfully () throws AWTException {
        new Robot().keyRelease(KeyEvent.VK_CONTROL);
            new Robot().keyRelease(KeyEvent.VK_V);
            new Robot().keyPress(KeyEvent.VK_ENTER);
            new Robot().keyRelease(KeyEvent.VK_ENTER);
        }
    }

