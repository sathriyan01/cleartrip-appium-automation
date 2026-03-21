package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HotelsNavigationTest extends BaseClass {

    @Test
    public void verifyHotelsNavigation() {

        HomePage home = new HomePage(driver);

        home.openHotels();

        // simple validation
        Assert.assertTrue(driver.getPageSource().contains("Hotels"));

        System.out.println("Hotels navigation verified successfully");
    }
}