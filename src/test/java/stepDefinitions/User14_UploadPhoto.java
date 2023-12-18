package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class User14_UploadPhoto {
    header hp = new header();
    body bp = new body();
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
    public void chooseThePhotoJpg() throws AWTException {
        StringSelection photoPath = new StringSelection("C:\\Users\\rusta\\Desktop\\thumb-1920-1332281.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photoPath, null);

        new Robot().keyPress(KeyEvent.VK_CONTROL);
        new Robot().keyPress(KeyEvent.VK_V);
        new Robot().keyRelease(KeyEvent.VK_CONTROL);
        new Robot().keyRelease(KeyEvent.VK_V);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        new Robot().keyRelease(KeyEvent.VK_ENTER);
        bp.myClick(bp.uploadButton);
        bp.myClick(bp.saveButton);
        bp.verifyContainsText(bp.MessagingBoxText,"successfully");

    }
}

