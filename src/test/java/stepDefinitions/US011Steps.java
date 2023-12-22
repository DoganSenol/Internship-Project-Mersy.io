package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Body;
import pages.Header;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class US011Steps {

    Header hd = new Header();
    Body bd = new Body();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));
    @When("The student click on the Hamburger Menu")
    public void theStudentClickOnTheHamburgerMenu() {

        hd.myClick(hd.hamburgerMenu);
    }
    @Then("The student click on the Finance -> My Finance")
    public void theStudentClickOnTheFinanceMyFinance() {
        hd.myClick(hd.financeButton);
        hd.myClick(hd.myFinanceButton);
    }

    @And("The student should see the Students Fees text")
    public void theStudentShouldSeeTheStudentsFeesText() {
        bd.verifyContainsText(bd.studentFeesText, "Fees");
    }

    @Then("The student click on the  Balance Link")
    public void theStudentClickOnTheBalanceLink() {
        bd.myClick(bd.balance);
    }

    @And("The student should see the Student Fee text")
    public void theStudentShouldSeeTheStudentFeeText() {
        bd.verifyContainsText(bd.studentFeesText, "Student Fee");
    }

    @When("The student clicks on the Stripe for the payment process")
    public void theStudentClicksOnTheStripeForThePaymentProcess() {
        bd.myClick(bd.paymentProvider);
    }

    @And("The student selects the payment method, enters the amount, inputs their credit card information, and completes the payment")
    public void theStudentSelectsThePaymentMethodEntersTheAmountInputsTheirCreditCardInformationAndCompletesThePayment() throws AWTException, IOException {
        bd.myScriptClick(bd.payRadio);
        bd.mySendKeys(bd.amountInput,"1.00");
        new Robot().keyPress(KeyEvent.VK_TAB);
        new Robot().keyRelease(KeyEvent.VK_TAB);
        bd.myClick(bd.payButton);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure payment input frame']")));
        WebElement iframe = BaseDriver.getDriver().findElement(By.xpath("//iframe[@title='Secure payment input frame']"));
        BaseDriver.getDriver().switchTo().frame(iframe);

        String path="src/test/java/apachePOI/TestData.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheet("CampusBankData");
        String cardNumber= String.valueOf(sheet.getRow(9).getCell(4));
        String expiration= String.valueOf(sheet.getRow(10).getCell(5));
        String cvc= String.valueOf(sheet.getRow(11).getCell(6));

        bd.mySendKeys(bd.cardNumber, cardNumber);
        bd.mySendKeys(bd.expiration, expiration);
        bd.mySendKeys(bd.cvc, cvc);

        BaseDriver.getDriver().switchTo().parentFrame();
        bd.myScriptClick(bd.stripePaymentsButton);
    }

    @Then("The student should see the Success Message")
    public void theStudentShouldSeeTheSuccessMessage() {
        hd.verifyContainsText(hd.successMessage,"success");
    }
}
