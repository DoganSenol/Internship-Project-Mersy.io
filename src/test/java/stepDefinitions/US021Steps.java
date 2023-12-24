package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

public class US021Steps {
    Header hp = new Header();
    Body bp = new Body();
    Methods mt = new Methods();

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));

    @And("confirms submit icons on the page are visible")
    public void confirmsSubmitIconsOnThePageAreVisible() {
        for (int i = 0; i < bp.submitButtonList.size(); i++) {
            Assert.assertTrue(bp.submitButtonList.get(i).isDisplayed());
        }
    }

    @Then("the student clicks on the submit icon of one of the homeworks")
    public void theStudentClicksOnTheSubmitIconOfOneOfTheHomeworks() {
        int selection = (int) (Math.random() * bp.submitButtonList.size());
        System.out.println(bp.submitButtonList.get(selection));
        mt.myClick(bp.submitButtonList.get(selection));
    }

    @And("accesses to text editor page")
    public void accessesToTextEditorPage() {
        Assert.assertTrue(bp.textEditorDialogBox.getText().trim().toLowerCase().contains("submission attempt"));
    }

    @And("verifies Submit button is not selectable till the student clicks on the Save as Draft button")
    public void verifiesSubmitButtonIsNotSelectableTillTheStudentClicksOnTheSaveAsDraftButton() {
        Assert.assertTrue(bp.textEditorSubmitButton.isEnabled());
    }

    @And("should write into the text editor")
    public void shouldWriteIntoTheTextEditor() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Rich Text Area']")));
        WebElement iframe = BaseDriver.getDriver().findElement(By.xpath("//iframe[@title='Rich Text Area']"));
        BaseDriver.getDriver().switchTo().frame(iframe);
        mt.myClick(bp.textEditor);
        mt.mySendKeys(bp.textEditor, "Team Mobile 5 ");
    }

    @And("paste a text")
    public void pasteAText() throws AWTException, InterruptedException {
        StringSelection filePath = new StringSelection("Post Intern");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        Thread.sleep(2000);
        new Robot().keyPress(KeyEvent.VK_CONTROL);
        new Robot().keyPress(KeyEvent.VK_V);
        new Robot().keyRelease(KeyEvent.VK_CONTROL);
        new Robot().keyRelease(KeyEvent.VK_V);
        BaseDriver.getDriver().switchTo().parentFrame();
    }

    @And("create picture or table in the text editor")
    public void createPictureOrTableInTheTextEditor() {
        mt.myClick(bp.textEditorMenu.get(3));
        mt.myClick(bp.image);
        mt.mySendKeys(bp.source, "https://static.javatpoint.com/tutorial/software-testing/images/sdlc-vs-stlc.png");
        mt.mySendKeys(bp.alternativeDescription, "SDLC & STLC");
        mt.myClick(bp.pictureInsertSaveButton);

        mt.myClick(bp.textEditorMenu.get(3));
        mt.myClick(bp.table);

        new Actions(BaseDriver.getDriver()).clickAndHold(bp.firstCell).perform();
        new Actions(BaseDriver.getDriver()).moveToElement(bp.lastCell).release().perform();
        mt.myClick(bp.lastCell);
    }

    @And("should attach file in the text editor")
    public void shouldAttachFileInTheTextEditor() throws AWTException, InterruptedException {
        mt.myClick(bp.textEditorMenu.get(8));
        mt.myClick(bp.myFromLocalButton);

        StringSelection filePath = new StringSelection("src/resources/upload/sdlc-vs-stlc.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        Thread.sleep(2000);
        new Robot().keyPress(KeyEvent.VK_CONTROL);
        new Robot().keyPress(KeyEvent.VK_V);
        new Robot().keyRelease(KeyEvent.VK_CONTROL);
        new Robot().keyRelease(KeyEvent.VK_V);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        new Robot().keyRelease(KeyEvent.VK_ENTER);
    }

    @And("clicks on the Save as Draft button")
    public void clicksOnTheSaveAsDraftButton() {
        mt.myClick(bp.saveAsDraftButton);
    }

    @And("clicks on the submit button")
    public void clicksOnTheSubmitButton() throws InterruptedException {
        Thread.sleep(3000);
        mt.myScriptClick(bp.textEditorSubmitButton);
    }

    @And("clicks on the Yes button for submission")
    public void clicksOnTheYesButtonForSubmission() {
        mt.myClick(bp.yesButton);
    }

    @And("the student verifies new submission button")
    public void theStudentVerifiesNewSubmissionButton() {
        mt.myScriptClick(bp.homeworkList.get(0));
        mt.myClick(bp.newSubmissionButton);
        Assert.assertTrue(bp.textEditorDialogBox.getText().trim().toLowerCase().contains("submission attempt"));
    }
}
