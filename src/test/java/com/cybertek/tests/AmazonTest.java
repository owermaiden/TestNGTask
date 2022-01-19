package com.cybertek.tests;

import com.cybertek.pages.AmazonCartPage;
import com.cybertek.pages.AmazonMainPage;
import com.cybertek.pages.ShoppingCartPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {

    AmazonMainPage amazonMainPage = new AmazonMainPage();
    AmazonCartPage amazonCartPage = new AmazonCartPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void searchForHat(){

        amazonMainPage.searchBoxInput.sendKeys(ConfigurationReader.get("searchItem"));
        amazonMainPage.searchBoxEnterButton.click();
        amazonMainPage.firstSearchResultforHat.click();

        BrowserUtils.waitForPageToLoad(3);
        amazonCartPage.quantitySelectButton.click();
        amazonCartPage.dropdownItems.get(1).click();
        amazonCartPage.addToCartButton.click();

        amazonMainPage.cartButton.click();
        BrowserUtils.waitForPageToLoad(3);

        String initialPrice = shoppingCartPage.totalPrice.getText();
        System.out.println(initialPrice);

        shoppingCartPage.quantitySelectButton.click();
        shoppingCartPage.dropdownQuantityItems.get(1).click();

        BrowserUtils.waitFor(2);
        String newPrice = shoppingCartPage.totalPrice.getText();
        System.out.println(newPrice);

        Assert.assertNotEquals(newPrice, initialPrice);








    }
}
