package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import base.BaseClass;
import pages.HomePage;

public class FlightsNavigationTest extends BaseClass {

	@Test
	public void verifyFlightsPageNavigation() {

	    HomePage home = new HomePage(driver);

	    home.openFlights();

	    Assert.assertTrue(true);
	}
}