package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CustomerLoginPage extends Utility {

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectYourName;

    @FindBy (xpath = "//button[normalize-space()='Login']")
    WebElement clickLoginButton;


    public void selectFromYourNameDropdown(String name){
        clickOnElement(selectYourName);
        selectByVisibleTextFromDropDown(selectYourName,name);
        CustomListeners.test.log(Status.PASS, "Select Name from Dropdown" + name);
    }
    public void loginButton(){
        clickOnElement(clickLoginButton);
        CustomListeners.test.log(Status.PASS, "Click Login button");
    }
}
