package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLogin;

    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;

    public void clickBankManagerLogin() {
        clickOnElement(bankManagerLogin);
        CustomListeners.test.log(Status.PASS, "Click BankManager Login");
    }

    public void clickCustomerLogin() {
        clickOnElement(customerLogin);
        CustomListeners.test.log(Status.PASS, "Click Login button");
    }
}
