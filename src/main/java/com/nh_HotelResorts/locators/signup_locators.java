package com.nh_HotelResorts.locators;

import com.nh_HotelResorts.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup_locators extends Base {
    public signup_locators(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@id='consent-prompt-submit']")
    protected WebElement acceptCookiesButton;
    @FindBy(xpath = "//span[@class='icon-login nh-ic-profile']")
    protected WebElement myAccountButton;
    @FindBy(xpath = "//a[@title='Inscrivez-vous']")
    protected WebElement inscriptionButton;
    @FindBy(xpath = "//input[@id='__BVID__48']")
    protected WebElement emailInput;
    @FindBy(xpath = "//input[@id='__BVID__52']")
    protected WebElement passwordInput;
    @FindBy(xpath = "//input[@id='__BVID__57']")
    protected WebElement confirmPasswordInput;
    @FindBy(xpath = "//input[@id='__BVID__61']")
    protected WebElement firstnameInput;
    @FindBy(xpath = "//input[@id='__BVID__65']")
    protected WebElement lastnameInput;
    @FindBy(xpath = "//div[@id='vs1__combobox']")
    protected WebElement birthdayBox1;
    @FindBy(xpath = "//input[@placeholder='Mois']")
    protected WebElement birthdayBox2;
    @FindBy(xpath = "//input[@placeholder='Année']")
    protected WebElement birthdayBox3;
    @FindBy(xpath = "//li[@id='vs1__option-15']")
    protected WebElement birthdayInput;
    @FindBy(xpath = "//li[@id='vs2__option-6']")
    protected WebElement birthdayInput2;
    @FindBy(xpath = "//li[@id='vs3__option-21']")
    protected WebElement birthdayInput3;
    @FindBy(xpath = "//span[normalize-space()='Masculin']")
    protected WebElement genderInput;
    @FindBy(xpath = "//input[@id='__BVID__90']")
    protected WebElement phoneNumberInput;
    @FindBy(xpath = "//input[@id='nationality']")
    protected WebElement nationalityInput;
    @FindBy(xpath = "//span[normalize-space()='Tunisien']")
    protected WebElement nationalitySelected;
    @FindBy(xpath = "//input[@placeholder='Langue préférée*']")
    protected WebElement languageBox;
    @FindBy(xpath = "//li[@id='vs4__option-3']")
    protected WebElement languageInput;
    @FindBy(xpath = "//input[@placeholder='Type de voie*']")
    protected WebElement boxAdress1;
    @FindBy(xpath = "//li[@id='vs5__option-4']")
    protected WebElement adressBox1;
    @FindBy(xpath = "//input[@id='__BVID__110']")
    protected WebElement adressBox2;
    @FindBy(xpath = "//input[@id='__BVID__114']")
    protected WebElement adressNumber;
    @FindBy(xpath = "//input[@id='country']")
    protected WebElement adressCountry;
    @FindBy(xpath = "//input[@id='__BVID__122']")
    protected WebElement adressCity;
    @FindBy(xpath = "//input[@id='__BVID__126']")
    protected WebElement postalCode;
    @FindBy(xpath = "//label[@for='GDPR_flag_5']")
    protected WebElement confirmPolicy;
    @FindBy(xpath = "//button[normalize-space()='Envoyer']")
    protected WebElement submitButton;


}