package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage extends Utility {

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement logoutTab;

    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement addAmount;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement depositSuccessful;

    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawlTab;

    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawButton;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement transactionSuccessful;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement addWithdrawlAmount;


    public void verifyLogoutTabDisplayed() throws InterruptedException {
        verifyThatTextIsDisplayed(logoutTab, "Logout");
        CustomListeners.test.log(Status.PASS, "Verify Logout displayed");
    }

    public void clickLogoutTab() {
        clickOnElement(logoutTab);
        CustomListeners.test.log(Status.PASS, "Click Logout Tab");
    }

    public void clickDepositTab() {
        clickOnElement(depositTab);
        CustomListeners.test.log(Status.PASS, "Click Deposit Tab");
    }

    public void enterAmount(String money) {
        sendKeysToElement(addAmount, money);
        CustomListeners.test.log(Status.PASS, "Enter Amount " + money);
    }

    public void clickDepositButton() {
        clickOnElement(depositButton);
        CustomListeners.test.log(Status.PASS, "Click Deposit Button");
    }

    public void verifyDepositMessage(String expectedMessage) {
        String Message = getTextFromElement(depositSuccessful);
        verifyText(expectedMessage, Message, "Element not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Deposit Message " + expectedMessage);
    }

    public void clickWithdrawalTab() {
        clickOnElement(withdrawlTab);
        CustomListeners.test.log(Status.PASS, "Click Withdrawl tab");
    }

    public void enterWithdrawlAmount(String money) throws InterruptedException {
        sendKeysToElement(addWithdrawlAmount, money);
        CustomListeners.test.log(Status.PASS, "Enter Withdrawl Amount" + money);
    }

    public void clickWithdrawlButton() throws InterruptedException {
        clickOnElement(withdrawButton);
        CustomListeners.test.log(Status.PASS, "Click Withdrawl Button" );
    }

    public void verifyWithdrawMessage(String expectedMessage) throws InterruptedException {
        String Message = getTextFromElement(transactionSuccessful);
        verifyText(expectedMessage, Message, "Element not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Withdrawl Message " + expectedMessage);
    }


}
