package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.FlightsPage;

public class FlightSearchTest extends BaseClass {

    @Test
    public void verifySearchButton() {

        HomePage home = new HomePage(driver);
        FlightsPage flights = new FlightsPage(driver);

        home.openFlights();

        Assert.assertTrue(flights.verifySearchButton());
    }
}