package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OpenAccountPage extends Utility {

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectCustomer;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;

    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement clickProcessButton;

    @FindBy(xpath = "//button[normalize-space()='Home']")
    WebElement navigateHomePage;

    public void selectFromCustomerDropdown(String name) {
        selectByVisibleTextFromDropDown(selectCustomer, name);
        CustomListeners.test.log(Status.PASS, "Select Customer" + name);
    }

    public void selectFromCurrencyDropdown(String text) {
        selectByVisibleTextFromDropDown(selectCurrency, text);
        CustomListeners.test.log(Status.PASS, "Select Currency" + text);
    }

    public void clickProcess() {
        clickOnElement(clickProcessButton);
        CustomListeners.test.log(Status.PASS, "Click Process button");
    }

    public void alertTextVerify(String expectedMessage) throws InterruptedException {
        //Reporter.log("Verify Alert Message" + expectedMessage + Message.toString() + "<br>");
        Thread.sleep(2000);
        String Message = getTextFromAlert();
        verifyText(expectedMessage, Message, "Error, Message not displayed as expected");
    }

    public void backToHomePage() {
        clickOnElement(navigateHomePage);
        CustomListeners.test.log(Status.PASS, "Navigate to Homepage");
    }

}
