package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.FlightsPage;

public class NegativeSearchWithoutDestinationTest extends BaseClass {

    @Test
    public void searchWithoutDestination() {

        HomePage home = new HomePage(driver);
        FlightsPage flights = new FlightsPage(driver);

        home.openFlights();

        try {

            flights.clickSearchFlights();

            // If it reaches results → wrong behavior
            System.out.println("❌ Test Failed: Search should not proceed without destination");
            Assert.fail("Search succeeded without destination");

        } catch (Exception e) {

            // Expected behavior
            System.out.println("✅ Test Passed: Search blocked without destination");
            Assert.assertTrue(true);
        }
    }
}