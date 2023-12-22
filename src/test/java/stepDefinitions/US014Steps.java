package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.Body;
import pages.Header;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class US014Steps {
    Header hp = new Header();
    Body bp = new Body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));


    @When("Student clicks on the Profile")
    public void studentClicksOnTheProfile() {
        mt.myClick(hp.profileButton);
    }

    @And("Student selects Settings")
    public void studentSelectsSettings() {
        mt.myClick(hp.settingsButton);
    }

    @Then("Student should be directed to the Settings section")
    public void studentShouldBeDirectedToTheSettingsSection() {
        Assert.assertTrue(bp.settingsText.getText().toLowerCase().trim().contains("settings"));
    }
    @And("click to photo")
    public void clickToPhoto() {
        bp.myClick(bp.upload_photo);
    }

    @And("click to upload photo icon")
    public void clickToUploadPhoto() {
        bp.myClick(bp.picture);
    }

    @Then("choose the photo jpg")
    public void chooseThePhotoJpg() throws AWTException, InterruptedException {
        StringSelection photoPath = new StringSelection("C:\\Users\\rusta\\Pictures\\thumb-1920-1332281.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photoPath, null);
        Thread.sleep(2000);
        new Robot().keyPress(KeyEvent.VK_CONTROL);
        new Robot().keyPress(KeyEvent.VK_V);
        new Robot().keyRelease(KeyEvent.VK_CONTROL);
        new Robot().keyRelease(KeyEvent.VK_V);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        new Robot().keyRelease(KeyEvent.VK_ENTER);
        bp.myClick(bp.uploadButton);
        Thread.sleep(2000);
        bp.myClick(bp.saveButton);
        Thread.sleep(1000);
        bp.verifyContainsText(hp.successMessage,"successfully");
     }
}

