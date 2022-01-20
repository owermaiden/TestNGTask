package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonCartPage extends BasePage{

    public AmazonCartPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css= "#quantity")
    public WebElement quantitySelectButton;

    // public Select quantitySelect = new Select(quantitySelectButton);  -> doesnt accept this element...

    @FindBy(css = ".a-dropdown-item")
    public List<WebElement> dropdownItems;

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToCartButton;
}
