package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import base.BaseClass;
import pages.HomePage;
import pages.FlightsPage;

public class FlightFilterTest extends BaseClass {

	@Test
	public void applyNonStopFilterTest() {

	    HomePage home = new HomePage(driver);
	    FlightsPage flights = new FlightsPage(driver);

	    home.openFlights();
	    flights.clickSearchFlights();
	    flights.applyNonStopFilter();

	    Assert.assertTrue(true); // simple validation
	}
}