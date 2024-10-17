package com.nh_HotelResorts.locators;

import com.nh_HotelResorts.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_locators extends Base {
    public login_locators(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")
    protected WebElement refuseCookiesButton;
    @FindBy(xpath = "")
    protected WebElement myAccountButton;
    @FindBy(xpath = "")
    protected WebElement seConnecterButton;
    @FindBy(xpath = "")
    protected WebElement joinNowButton;
    @FindBy(xpath = "")
    protected WebElement firstNameInput;
    @FindBy(xpath = "")
    protected WebElement lastNameInput;
    @FindBy(xpath = "")
    protected WebElement countryButton;
    @FindBy(xpath = "")
    protected WebElement languageButton;
    @FindBy(xpath = "")
    protected WebElement emailInput;
    @FindBy(xpath = "")
    protected WebElement passwordInput;
    @FindBy(xpath = "")
    protected WebElement confirmPasswordInput;
    @FindBy(xpath = "")
    protected WebElement phoneNumberInput;
    @FindBy(xpath = "")
    protected WebElement submitButton;
}
