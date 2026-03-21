package base;

import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import utils.ConfigReader;

public class BaseClass {

    public static AndroidDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName(ConfigReader.getProperty("platformName"));
        options.setDeviceName(ConfigReader.getProperty("deviceName"));
        options.setAutomationName(ConfigReader.getProperty("automationName"));

        options.setAppPackage(ConfigReader.getProperty("appPackage"));
        options.setAppActivity(ConfigReader.getProperty("appActivity"));

        options.setAutoGrantPermissions(true);

        driver = new AndroidDriver(
                new URL(ConfigReader.getProperty("appiumServer")),
                options
        );

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Thread.sleep(3000); // allow UI to load

        System.out.println("App launched successfully");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(4000);

        if (driver != null) {
            driver.quit();
        }
    }
}
