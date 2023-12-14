package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Methods;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class US08Steps {
    header hp = new header();
    body bd = new body();
    Methods mt = new Methods();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));

    @And("selects Finance > My Finance")
    public void selectsFinanceMyFinance() {
        mt.myClick(hp.financeButton);
        mt.myClick(hp.myFinanceButton);
    }

    @Then("the student should be directed to the My Finance section")
    public void theStudentShouldBeDirectedToTheMyFinanceSection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Students Fees ']")));
        Assert.assertTrue(bd.studentsFees.getText().toLowerCase().trim().contains("students fees"));
    }

    @Given("The student must have fee for payment")
    public void theStudentMustHaveFeeForPayment() {
        double trimmedBalance = Double.parseDouble(bd.balance.getText().replaceAll("[^0-9.]", ""));
        Assert.assertTrue(trimmedBalance > 0, "Balance is lower than 0 (Zero). Do not make any payment !");
    }

    @When("the student clicks one of the elements of the Students Fees table")
    public void theStudentClicksOneOfTheElementsOfTheStudentsFeesTable() {
        mt.myClick(bd.balance);
    }

    @Then("the student should be directed to the Student Fee section")
    public void theStudentShouldBeDirectedToTheStudentFeeSection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Student Fee ']")));
        Assert.assertTrue(bd.studentFee.getText().toLowerCase().trim().contains("student fee"));
    }

    @When("the student selects provider for payment process")
    public void theStudentSelectsProviderForPaymentProcess() {
        mt.myClick(bd.paymentProvider);
    }

    @And("the student selects pay type, amount and completes payment process by entering credit card information")
    public void theStudentSelectsPayTypeAmountAndCompletesPaymentProcessByEnteringCreditCardInformation() throws AWTException, InterruptedException {
        mt.myScriptClick(bd.payRadio);
        mt.mySendKeys(bd.amountInput,"1.00");
        new Robot().keyPress(KeyEvent.VK_TAB);
        new Robot().keyRelease(KeyEvent.VK_TAB);
        mt.myClick(bd.payButton);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure payment input frame']")));
        WebElement iframe = BaseDriver.getDriver().findElement(By.xpath("//iframe[@title='Secure payment input frame']"));
        BaseDriver.getDriver().switchTo().frame(iframe);

        mt.mySendKeys(bd.cardNumber,"4242 4242 4242 4242");
        mt.mySendKeys(bd.expiration,"1223");
        mt.mySendKeys(bd.cvc,"123");
        BaseDriver.getDriver().switchTo().parentFrame();
        mt.myScriptClick(bd.stripePaymentsButton);
    }
}
