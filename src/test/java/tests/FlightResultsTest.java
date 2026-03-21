package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.FlightsPage;

public class FlightResultsTest extends BaseClass {

    @Test
    public void verifyFlightResultsPage() {

        HomePage home = new HomePage(driver);
        FlightsPage flights = new FlightsPage(driver);

        home.openFlights();
        flights.clickSearchFlights();

        Assert.assertTrue(flights.verifyResultsPage());
    }
}