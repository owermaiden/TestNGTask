package com.cybertek.amazonPages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage extends BasePage{

    public AmazonMainPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//h2/a")
    public WebElement firstSearchResultforHat;
}
