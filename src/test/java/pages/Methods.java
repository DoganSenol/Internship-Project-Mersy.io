package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BaseDriver;

import java.time.Duration;

public class Methods {

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));

    public JavascriptExecutor javascriptExecutor = (JavascriptExecutor) BaseDriver.getDriver();

    public  void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public  void loadWait(WebElement element){
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));

    }

    public void mySendKeys(WebElement element,String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }
    public  void scrollToElement(WebElement element){

        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
    }

    public void myScriptClick(WebElement element){
        scrollToElement(element);
        javascriptExecutor.executeScript("arguments[0].click();", element);
    }

    public  void mySelectByIndex(WebElement element,int index){
        scrollToElement(element);
        Select ElemenetSelect=new Select(element);
        ElemenetSelect.selectByIndex(index);
    }

    public  void mySelectByValue(WebElement element, String value){
        scrollToElement(element);
        Select ElementSelect=new Select(element);
        ElementSelect.selectByValue(value);
    }

    public  static  int randomChoise(int limit){
        return (int) (Math.random()*limit);
    }
    public  void  hover(WebElement element){
        Actions actions = new Actions(BaseDriver.getDriver());
        Action action=actions.moveToElement(element).build();
        action.perform();
    }
    public void backPage(){
        BaseDriver.getDriver().navigate().back();
    }

}
