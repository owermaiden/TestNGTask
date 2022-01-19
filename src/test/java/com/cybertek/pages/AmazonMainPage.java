package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMainPage extends BasePage{

    @FindBy(xpath = "//h2/a")
    public WebElement firstSearchResultforHat;
}
