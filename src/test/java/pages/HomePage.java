package pages;

import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.WaitUtils;

public class HomePage {

    AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Locators
    By exploreButton = By.xpath("//*[contains(@text,'Explore')]");
    By hotelsCard = By.xpath("//android.widget.TextView[@text='Hotels']");
    By flightsCard = By.xpath("//android.widget.TextView[@text='Flights']");

    public void openFlights() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(flightsCard)
        )).click();

        System.out.println("Flights page opened successfully");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void openHotels() {

        By hotelsCard = By.xpath("//android.widget.TextView[@text='Hotels']");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(hotelsCard)
        )).click();

        System.out.println("Hotels page opened successfully");
    }
}
