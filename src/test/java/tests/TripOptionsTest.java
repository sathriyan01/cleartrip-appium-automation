package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.HomePage;
import pages.FlightsPage;

public class TripOptionsTest extends BaseClass {

	@Test
	public void verifyTripOptions() {

	    HomePage home = new HomePage(driver);
	    FlightsPage flights = new FlightsPage(driver);

	    home.openFlights();

	    Assert.assertTrue(flights.verifyTripOptions());
	}
}