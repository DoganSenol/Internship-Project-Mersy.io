package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.body;
import pages.header;
import utilities.BaseDriver;

import java.time.Duration;

public class US09FinanceSteps {
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));
    header hd=new header();
    body bd=new body();


    @Given("Student clicks on the finance section of the hamburger menu.")
    public void studentClicksOnTheFinanceSectionOfTheHamburgerMenu() {
        hd.myClick(hd.hamburgerMenu);
        hd.myClick(hd.financeButton);
        hd.myClick(hd.myFinanceButton);
    }

    @When("Student clicks on the section to make the payment.")
    public void studentClicksOnTheSectionToMakeThePayment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Students Fees ']")));
        Assert.assertTrue(bd.studentsFees.getText().toLowerCase().trim().contains("students fees"));
        bd.myClick(bd.eyeButton);
    }

    @Then("Student sees the payment options by clicking on the stripe section")
    public void studentSeesThePaymentOptionsByClickingOnTheStripeSection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Student Fee ']")));
        Assert.assertTrue(bd.studentFee.getText().toLowerCase().trim().contains("student fee"));
        bd.myClick(bd.paymentProvider);
    }

    @And("Student clicks on the desired payment option and enters the information.")
    public void studentClicksOnTheDesiredPaymentOptionAndEntersTheInformation() throws InterruptedException {
        Thread.sleep(1000);
        bd.myClick(bd.stripePayButton);
        bd.mySendKeys(bd.amountInput,"20");
        bd.myClick(bd.stripePayButton);
        bd.myClick(bd.payButton);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure payment input frame']")));
        WebElement iframe = BaseDriver.getDriver().findElement(By.xpath("//iframe[@title='Secure payment input frame']"));
        BaseDriver.getDriver().switchTo().frame(iframe);

        bd.myClick(bd.cardNumber);
        bd.mySendKeys(bd.cardNumber,"4242 4242 4242 4242");
        bd.mySendKeys(bd.expiration,"01 25");
        bd.mySendKeys(bd.cvc,"909");
        BaseDriver.getDriver().switchTo().parentFrame();
        bd.myClick(bd.stripePaymentsButton);

    }

    @And("Student must successfully complete the payment process")
    public void studentMustSuccessfullyCompleteThePaymentProcess() {
        bd.displayedAssert(bd.notPublishInfo);
    }
}
