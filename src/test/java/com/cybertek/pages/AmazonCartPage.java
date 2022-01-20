package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonCartPage extends BasePage{

    @FindBy(css= "#quantity")
    public WebElement quantitySelectButton;

    @FindBy(css = ".a-dropdown-item")
    public List<WebElement> dropdownItems;

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToCartButton;
}
