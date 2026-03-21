package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;

public class NegativeElementNotFoundTest extends BaseClass {

    @Test
    public void verifyElementNotPresent() {

        driver.findElement(By.xpath("//android.widget.TextView[@text='NonExistingElement']"));

    }
}