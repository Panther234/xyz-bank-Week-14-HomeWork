package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddCustomerPage extends Utility {

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement enterFirstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement enterLastName;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement enterPostCode;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickAddCustomer;

    public void firstName(String firstName) {
        sendTextToElement(enterFirstName, firstName);
        CustomListeners.test.log(Status.PASS, "Enter First name" + firstName);
    }

    public void lastName(String lastName) {
        sendTextToElement(enterLastName, lastName);
        CustomListeners.test.log(Status.PASS, "Enter Last name" + lastName);
    }

    public void postCode(String postCode) {
        sendTextToElement(enterPostCode, postCode);
        CustomListeners.test.log(Status.PASS, "Enter PostCode" + postCode);
    }

    public void addCustomer() {
        clickOnElement(clickAddCustomer);
        CustomListeners.test.log(Status.PASS, "Add Customer" );
    }

    public void alertTextVerify(String expectedMessage) throws InterruptedException {
        //Reporter.log("Alert text verify" + expectedMessage + message.toString() + "<br>");
        Thread.sleep(2000);
        String message = getTextFromAlert();
        verifyText(expectedMessage, message, "Error, Message not displayed as expected");
    }
}
