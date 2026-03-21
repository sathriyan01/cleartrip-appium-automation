package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.FlightsPage;

public class OriginFieldTest extends BaseClass {

    @Test
    public void verifyOriginField() {

        HomePage home = new HomePage(driver);
        FlightsPage flights = new FlightsPage(driver);

        home.openFlights();

        Assert.assertTrue(flights.verifyOriginField());
    }
}