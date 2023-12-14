package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class body extends Methods{

    public body()
    {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    //////////////////////Aygül/////////////////////





    ///////////////////Senol/////////////////////////

    @FindBy(xpath="(//ms-confirm-button)[1]")
    public WebElement trashButton;







    //////////////////////Musab///////////////////////










    //////////////////////Göksah///////////////////////













    //////////////////////Enes///////////////////////











    //////////////////////Talat///////////////////////












    //////////////////////Ümit///////////////////////

    // Messaging > Outbox
    @FindBy(xpath="//span[text()=' Outbox ']")
    public WebElement outbox;
    @FindBy(xpath="(//div[@class='mdc-checkbox']/input)[2]")
    public WebElement checkbox;
    @FindBy(xpath="//span[text()='Move to Trash']")
    public WebElement moveToTrashButton;
    @FindBy(xpath="//span[text()=' Yes ']")
    public WebElement ConfirmButton;

    // Finance > My Finance
    @FindBy(xpath="//span[text()=' Students Fees ']")
    public WebElement studentsFees;

    @FindBy(xpath="(//tr/td)[9]")
    public WebElement balance;

    @FindBy(xpath="//span[text()=' Student Fee ']")
    public WebElement studentFee;

    @FindBy(xpath="//label[text()='Stripe ']")  //input[@type='radio' and @value='STRIPE']
    public WebElement paymentProvider;

    @FindBy(xpath="//input[@type='radio' and @value='CUSTOM_AMOUNT']") //(//span[text()='Pay'])[1]
    public WebElement payRadio;

    @FindBy(xpath="//input[@data-placeholder='Amount']")
    public WebElement amountInput;

    @FindBy(xpath="(//span[text()='Pay'])[2]")
    public WebElement payButton;

    @FindBy(css="#Field-numberInput")
    public WebElement cardNumber;

    @FindBy(xpath="//input[@id='Field-expiryInput']")
    public WebElement expiration;

    @FindBy(xpath="//input[@id='Field-cvcInput']")
    public WebElement cvc;

    @FindBy(xpath="//*[@class='stripe-img']")
    public WebElement stripePaymentsButton;













    //////////////////////Talip///////////////////////












    //////////////////////Sokol///////////////////////














    //////////////////////Rustam///////////////////////










    public WebElement getWebelement(String stringElement)
    {switch (stringElement)
    {




    }

        return null;
    }
}
