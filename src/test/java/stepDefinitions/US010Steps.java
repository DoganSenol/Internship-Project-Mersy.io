package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Body;
import utilities.BaseDriver;

import java.time.Duration;

public class US010Steps {
    Body el = new Body();
    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(),Duration.ofSeconds(20));

    @And("Click the eye")

    public void clickTheEye() {
        el.myClick(el.eyeButton);

    }

    @And("Click the stripeRadio > Click Pay > Click Amount")
    public void clickTheStripeRadioClickPayClickAmount() {
        el.myClick(el.stripeRadio);
        el.myClick(el.pay);
        el.mySendKeys(el.inputAmount, "1");
        el.myClick(el.stripeRadio);
        el.myClick(el.payButton);
    }

    @Given("Click card input text and enter card number")
    public void clickCardInputTextAndEnterCardNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure payment input frame']")));
        WebElement ifram = BaseDriver.getDriver().findElement(By.xpath("//iframe[@title='Secure payment input frame']"));
        BaseDriver.getDriver().switchTo().frame(ifram);

        el.mySendKeys(el.inputCardNum,"4242424242424242");
        el.mySendKeys(el.inputExpiration,"1230");
        el.mySendKeys(el.inputCvc,"123");
        BaseDriver.getDriver().switchTo().parentFrame();
        el.myClick(el.stripePayment);
    }


    @Then("Should see paymentSuccessfully")
    public void shouldSeePaymentSuccessfully() {
        el.verifyContainsText(el.paymentSuccessfully,"Student Payment successfully created");
    }
}
