package connector;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

import server.AppiumServer;

public class Hooks {
    public static AppiumDriver driver;
    private static DesiredCapabilities capabilities;

    @Before
    public void setUp(Scenario scenario) throws Exception {
        // Start Appium server
        AppiumServer.startAppiumServer();

        // Set up desired capabilities
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel 6");
        capabilities.setCapability("appPackage", "com.forsale.forsale");
        capabilities.setCapability("appActivity", "com.forsale.app.features.maincontainer.MainContainerActivity");
        capabilities.setCapability("automationName", "UiAutomator2");

        // Initialize Appium driver
        URL appiumServerUrl = AppiumServer.getAppiumServerUrl();
        driver = new AndroidDriver(appiumServerUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown(Scenario scenario) {
        // Quit the driver after each scenario
        if (driver != null) {
            driver.quit();
        }

        // Stop Appium server
        AppiumServer.stopAppiumServer();
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static DesiredCapabilities getCapabilities() {
        return capabilities;
    }
}
