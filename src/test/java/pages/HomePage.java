package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class HomePage extends Methods{

    public HomePage(){
        PageFactory.initElements(BaseDriver.getDriver(),this);}

    @FindBy(xpath ="//div[@class='ng-star-inserted']//img")

    public WebElement logoButton;


    public WebElement getLogoButton(String stringElement) {
        switch (stringElement) {

            case "logoButton":
                return this.logoButton;
        }

        return null;
    }


}
