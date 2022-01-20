package com.cybertek.moneygaminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(css = "#title")
    public WebElement titleSelect;

    @FindBy(css = "#forename")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='map(lastName)']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='map(terms)']")
    public WebElement termCheckBox;

    @FindBy(xpath = "//input[@type='submit' and @id='form']")
    public WebElement submitButton;

    @FindBy(xpath = "//label[@for='dob']")
    public WebElement dobLabel;
}
