package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBoxInput;

    @FindBy(css = "#nav-search-submit-button")
    public WebElement searchBoxEnterButton;

    @FindBy(css = "#nav-cart")
    public WebElement cartButton;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


}
