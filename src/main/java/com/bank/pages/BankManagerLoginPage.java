package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BankManagerLoginPage extends Utility {

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerButton;

    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;


    public void addCustomerButton() {
        clickOnElement(addCustomerButton);
        CustomListeners.test.log(Status.PASS, "Click Add customer" );
    }
    public void openAccount(){
        clickOnElement(openAccount);
        CustomListeners.test.log(Status.PASS, "Click Open account" );
    }

}
