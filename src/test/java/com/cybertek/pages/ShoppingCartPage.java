package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//span[@data-action='a-dropdown-button']")
    public WebElement quantitySelectButton;

    @FindBy(css = "#sc-subtotal-amount-activecart>span")
    public WebElement totalPrice;

    @FindBy(css = ".a-dropdown-item.quantity-option")
    public List<WebElement> dropdownQuantityItems;
}
