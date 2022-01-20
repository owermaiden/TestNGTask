package com.cybertek.tests;

import com.cybertek.moneygaminPages.RegistrationPage;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoneyGamingTest extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void moneyGamingTest(){

        registrationPage.joinNowButton.click();
        Select titleSelect = new Select(registrationPage.titleSelect);
        titleSelect.selectByIndex(1);
        registrationPage.firstname.sendKeys("Omer");
        registrationPage.lastname.sendKeys("Erden");
        registrationPage.termCheckBox.click();
        registrationPage.submitButton.click();
        String message = registrationPage.dobLabel.getText();
        String expected = "This field is required";
        Assert.assertEquals(message,expected);
    }
}
