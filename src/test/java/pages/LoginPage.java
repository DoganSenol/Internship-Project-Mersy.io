package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LoginPage extends Methods {

    public LoginPage()
    {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div//input[@formcontrolname='username']")
    public WebElement usernameInput;
    @FindBy(xpath = "//div//input[@formcontrolname='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "((//div[@fxlayout='row'])[3]//span)[1]")
    public WebElement loginVerifyText;







    public WebElement getWebelement(String stringElement)
    {switch (stringElement)
    {
        case "usernameInput": return this.usernameInput;
        case "passwordInput": return this.passwordInput;
        case "loginButton": return this.loginButton;
        case "loginVerifyText": return this.loginVerifyText;



    }

        return null;
    }
}
