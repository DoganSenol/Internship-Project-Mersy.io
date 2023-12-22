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

import java.time.Duration;

public class US015Steps {
    Header hp = new Header();
    Body bp = new Body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));

    @When("the student clicks on the Profile")
    public void theStudentClicksOnTheProfile() {
        mt.myClick(hp.profileButton);
    }

    @And("selects Settings")
    public void selectsSettings() {
        mt.myClick(hp.settingsButton);
    }

    @Then("the student should be directed to the Settings section")
    public void theStudentShouldBeDirectedToTheSettingsSection() {
        Assert.assertTrue(bp.settingsText.getText().toLowerCase().trim().contains("settings"));

    }

    @When("the student clicks Default Theme dropbox and verifies that there are more than three themes")
    public void theStudentClicksDefaultThemeDropboxAndVerifiesThatThereAreMoreThanThreeThemes() {
        mt.myClick(bp.themeDropbox);
        Assert.assertTrue(bp.themeList.size() >= 3, "There are less than 3 themes");
    }

    @And("the student selects one of the themes clicks on the save button and verifies theme of the page")
    public void theStudentSelectsOneOfTheThemesClicksOnTheSaveButtonAndVerifiesThemeOfThePage() {
        int selection = (int) (Math.random() * bp.themeList.size());
        mt.myClick(bp.themeList.get(selection));
        System.out.println("Selected Theme Number: " + selection);
        mt.myClick(bp.saveButton);
        String backgroundColor = bp.settingsToolbar.getCssValue("background-color");
        System.out.println(bp.settingsToolbar.getCssValue("background-color"));
        switch (selection){
            case 0 :
                if (backgroundColor.equals("rgba(45, 50, 62, 1)"))
                    System.out.println("Default Theme is changed to " + "Default Theme");
                break;
            case 1 :
                if (backgroundColor.equals("rgba(103, 58, 183, 1)"))
                    System.out.println("Default Theme is changed to " + "Purple Theme");
                break;
            case 2 :
                if (backgroundColor.equals("rgba(54, 30, 84, 1)"))
                System.out.println("Default Theme is changed to " + "Dark Purple Theme");
                break;
            case 3 :
                if (backgroundColor.equals("rgba(63, 81, 181, 1)"))
                System.out.println("Default Theme is changed to " + "Indigo");
                break;
            default:
                System.out.println("Default Theme is wrong !");
        }
    }
}
