package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import utils.WaitUtils;

public class FlightsPage {

    AndroidDriver driver;

    public FlightsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By searchFlightsButton = By.xpath("//*[contains(@text,'Search flights')]");

    public boolean verifySearchButton() {

        WaitUtils.waitForElement(driver, searchFlightsButton);

        boolean visible = driver.findElement(searchFlightsButton).isDisplayed();

        if (visible) {
            System.out.println("Search button verified successfully");
        }

        return visible;
    }

    public void clickSearchFlights() {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WaitUtils.waitForElement(driver, searchFlightsButton);

        driver.findElement(searchFlightsButton).click();

        System.out.println("Search flights clicked");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        verifyResultsPage();
    }

    public boolean verifyResultsPage() {

        By resultsLoaded = By.xpath("//android.view.ViewGroup");

        WaitUtils.waitForElement(driver, resultsLoaded);

        System.out.println("Flights results page loaded successfully");

        return true;
    }

    public void applyNonStopFilter() {

        By filterButton = By.xpath("//*[contains(@text,'Filter')]");
        By nonStopOption = By.xpath("//*[contains(@text,'Non')]");

        // wait for filter button
        WaitUtils.waitForElement(driver, filterButton);

        driver.findElement(filterButton).click();

        System.out.println("Filter panel opened");

        // wait for Non-stop option
        WaitUtils.waitForElement(driver, nonStopOption);

        driver.findElement(nonStopOption).click();

        System.out.println("Non-stop filter applied successfully");
    }

    public boolean verifyOriginField() {

        By originField = By.xpath("//*[contains(@text,'From')]");

        WaitUtils.waitForElement(driver, originField);

        boolean visible = driver.findElement(originField).isDisplayed();

        if (visible) {
            System.out.println("Origin field verified successfully");
        }

        return visible;
    }

    public boolean verifyTravellerSection() {

        By travellerSection = By.xpath("//*[contains(@text,'traveller') or contains(@text,'Traveller')]");

        WaitUtils.waitForElement(driver, travellerSection);

        boolean visible = driver.findElement(travellerSection).isDisplayed();

        System.out.println("Traveller section verified successfully");

        return visible;
    }

    public boolean verifyTripOptions() {

        By oneWay = By.xpath("//*[contains(@text,'One way')]");
        By roundTrip = By.xpath("//*[contains(@text,'Round')]");

        WaitUtils.waitForElement(driver, oneWay);
        WaitUtils.waitForElement(driver, roundTrip);

        System.out.println("Trip options verified successfully");

        return true;
    }
}
