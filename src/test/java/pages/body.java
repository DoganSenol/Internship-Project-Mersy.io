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
    @FindBy(xpath="(//div[@class='mdc-checkbox'])[2]")
    public WebElement checkBoxUs07;








    //////////////////////Musab///////////////////////










    //////////////////////Göksah///////////////////////













    //////////////////////Enes///////////////////////
    ////////////////////CalendarLocator//////////////
    @FindBy(xpath = "(//div[@class=\"mat-elevation-z4 ng-star-inserted\"])[1]") //E etiketli biyoloji dersi
    public WebElement pbBiologyCourse;
    @FindBy(xpath = "//ms-tab-group[@class=\"ng-star-inserted\"]") //Calendar'da derslerin bilgi kısmı
    public WebElement courseInformation;
    @FindBy(xpath = "(//div[@class=\"mat-elevation-z4 ng-star-inserted\"])[6]") //E etiketli biyoloji dersinin altındaki yayınlanmamış biyoloji dersi
    public WebElement biologyCourse;
    @FindBy(xpath = "//mat-toolbar-row[@class=\"mat-toolbar-row\"]/span") //Tüm derslere ait açılır penceredeki isimler.
    public WebElement coursesName;
    @FindBy(xpath = "//mat-accordion[@class=\"mat-accordion\"]") //Dersin yayınlanmadığına dair açılır pencere uyarısı.
    public WebElement notPublishInfo;
    @FindBy(xpath = "(//ms-dialog-content[@class=\"mat-dialog-content ng-untouched ng-pristine ng-invalid\"]//div)[10]") //Tüm yayınlanmamış derslere ait bilgiler.
    public WebElement notPublishCoursesInfo;
    @FindBy(xpath = "//button[@aria-label=\"Close dialog\"]") //açılır pencerelerin kapatma tuşu
    public WebElement closeButton;
    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[1]") //yayınlanmış dersin üst kısmındaki buton
    public WebElement topicButton;
    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[2]") //yayınlanmış dersin üst kısmındaki buton
    public WebElement attachmentsButton;
    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[3]") //yayınlanmış dersin üst kısmındaki buton
    public WebElement recentEventsButton;
    @FindBy(xpath = "//div[@id=\"mat-tab-label-11-0\"]") //yayınlanmış dersin üst kısmındaki buton
    public WebElement informationButton;











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
