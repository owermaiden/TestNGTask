package com.cybertek.tests;

import com.cybertek.pages.AmazonMainPage;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {

    AmazonMainPage amazonMainPage = new AmazonMainPage();

    @Test
    public void searchForHat(){

        amazonMainPage.searchBoxInput.sendKeys(ConfigurationReader.get("searchItem"));
        amazonMainPage.searchBoxEnterButton.click();

    }
}
