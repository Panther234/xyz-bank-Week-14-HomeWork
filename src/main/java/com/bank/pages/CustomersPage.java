package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CustomersPage extends Utility {

    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement verifyMessage;


    public void verifyDisplayNameMessage(String expectedMessage) throws InterruptedException {
       String Message = getTextFromElement(verifyMessage);
        verifyText(expectedMessage, Message, "Element not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Displayed Name Message " + expectedMessage);
    }
}
