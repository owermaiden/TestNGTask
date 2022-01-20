package com.cybertek.amazonPages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartPage extends BasePage{

    public ShoppingCartPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[.='Qty:']/..")
    public WebElement quantitySelectButton;

    @FindBy(css = "#sc-subtotal-amount-activecart>span")
    public WebElement totalPrice;

    @FindBy(css = ".a-dropdown-item.quantity-option")
    public List<WebElement> dropdownQuantityItems;
}
