package com.nh_HotelResorts.pages;

import com.nh_HotelResorts.Base;
import com.nh_HotelResorts.locators.signup_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class signup_page extends signup_locators{
    public static signup_page instance;
    public signup_page(){
        PageFactory.initElements(driver,this);
    }


    public static signup_page getInstance(){
        if(instance == null){
            instance=new signup_page();
        }return instance;
    }
    public void performSignup() throws InterruptedException {
        acceptCookiesButton.click();
        myAccountButton.click();
        inscriptionButton.click();
        driver.navigate().refresh();
        emailInput.sendKeys(Base.props.getProperty("email"));
        passwordInput.sendKeys(Base.props.getProperty("password"));
        confirmPasswordInput.sendKeys(Base.props.getProperty("confirm_password"));
        firstnameInput.sendKeys(Base.props.getProperty("firstname"));
        lastnameInput.sendKeys(Base.props.getProperty("lastname"));
        birthdayBox1.click();
        birthdayInput.click();
        birthdayBox2.click();
        birthdayInput2.click();
        birthdayBox3.click();
        birthdayInput3.click();

        /*selectBirthday(
                Base.props.getProperty("jour"),
                Base.props.getProperty("mois"),
                Base.props.getProperty("annee")
        );*/
        genderInput.click();
        phoneNumberInput.sendKeys(Base.props.getProperty("phone"));
        nationalityInput.sendKeys(Base.props.getProperty("nationality"));
        nationalitySelected.click();
        languageBox.click();
        languageInput.click();
        //selectLanguage(Base.props.getProperty("language"));

        //selectAddressBox1(Base.props.getProperty("addressType"));
        boxAdress1.click();
        adressBox1.click();
        adressBox2.sendKeys(Base.props.getProperty("adressBox"));
        adressNumber.sendKeys(Base.props.getProperty("adressnumber"));
        adressCountry.sendKeys(Base.props.getProperty("pays"));
        adressCity.sendKeys(Base.props.getProperty("ville"));
        postalCode.sendKeys(Base.props.getProperty("codepostale"));
        confirmPolicy.click();
        scrollToElement(submitButton);
        submitButton.sendKeys(Keys.ENTER);
        Thread.sleep(10000);

    }

    public void selectBirthday(String day, String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Sélection du jour
            WebElement dayInput = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@placeholder='Jour']")));
            dayInput.click();
            Thread.sleep(500); // Attendre que la liste apparaisse

            WebElement dayOption = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//li[text()='" + day + "']")));
            dayOption.click();

            // Sélection du mois
            WebElement monthInput = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@placeholder='Mois']")));
            monthInput.click();
            Thread.sleep(500);

            WebElement monthOption = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//li[text()='" + month + "']")));
            monthOption.click();

            // Sélection de l'année
            WebElement yearInput = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@placeholder='Année']")));
            yearInput.click();
            Thread.sleep(500);

            WebElement yearOption = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//li[text()='" + year + "']")));
            yearOption.click();

        } catch (Exception e) {
            System.out.println("Erreur lors de la sélection de la date : " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void selectLanguage(String language) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Sélection du champ Langue
            WebElement languageInput = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@placeholder='Langue préférée*']")));
            languageInput.click();

            // Sélection de la langue dans la liste
            WebElement languageOption = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//li[text()='" + language + "']")));
            languageOption.click();

        } catch (Exception e) {
            System.out.println("Erreur lors de la sélection de la langue : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void selectAddressBox1(String addressType) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Sélection du champ Type de voie
            WebElement addressBox1Input = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//input[@placeholder='Type de voie*']")));
            addressBox1Input.click();

            // Sélection du type de voie dans la liste
            WebElement addressTypeOption = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//li[text()='" + addressType + "']")));
            addressTypeOption.click();

        } catch (Exception e) {
            System.out.println("Erreur lors de la sélection du type de voie : " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
    }


}
