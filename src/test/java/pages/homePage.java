package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class homePage extends Methods{

    public homePage(){
        PageFactory.initElements(BaseDriver.getDriver(),this);}

    @FindBy(xpath ="//img[@src='assets/images/logos/logo_icon_mini.png']")
    public WebElement logoButton;


    public WebElement getLogoButton(String stringElement) {
        switch (stringElement) {

            case "logoButton":
                return this.logoButton;
        }

        return null;
    }


}
