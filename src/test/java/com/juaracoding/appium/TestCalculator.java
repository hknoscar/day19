package com.juaracoding.appium;

import com.juaracoding.day19.Calculator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class TestCalculator {
    public static AndroidDriver<MobileElement> driver;
    public Calculator calculator;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 2 API 29");
        capabilities.setCapability("uuid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        calculator = new Calculator(driver);
    }

    @Test
    public void testAdd() {
        calculator.calcAdd();
        System.out.println("Hasil = "+calculator.getTxtResult());
        assertEquals(calculator.getTxtResult(), "3");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }

}
