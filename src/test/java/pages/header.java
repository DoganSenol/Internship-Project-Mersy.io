package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class header {

    public header() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//ms-layout-menu-button//button)[1]")
    public WebElement coursesButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[2]")
    public WebElement calendarButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[3]")
    public WebElement attendanceButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[4]")
    public WebElement assignmentsButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[5]")
    public WebElement gradingButton;
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger mat-button-wrapper mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']")
    public WebElement hamburgerMenu;
    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingButton;
    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement newMessageButton;
    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inboxButton;
    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outboxButton;
    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trashButton;
    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement financeButton;
    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger user-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']")
    public WebElement profileButton;
    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsButton;


    public WebElement getWebelement(String stringElement) {
        switch (stringElement) {


        }

        return null;
    }


}
