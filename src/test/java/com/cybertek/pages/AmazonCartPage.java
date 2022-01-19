package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonCartPage extends BasePage{

    @FindBy(xpath= "(//span[@data-action='a-dropdown-button'])[1]")
    public WebElement quantitySelectButton;

    @FindBy(css = ".a-dropdown-item")
    public List<WebElement> dropdownItems;

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToCartButton;
}
