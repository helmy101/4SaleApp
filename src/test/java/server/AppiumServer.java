package server;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.net.URL;

public class AppiumServer {
    private static AppiumDriverLocalService appiumService;

    public static void startAppiumServer() {
        // Build Appium server options
        AppiumServiceBuilder builder = new AppiumServiceBuilder().usingAnyFreePort()
                .withIPAddress("127.0.0.1")
                .usingPort(4723);

        // Start Appium server
        appiumService = builder.build();
        appiumService.start();
        System.out.println("Appium server started successfully.");
    }

    public static void stopAppiumServer() {
        if (appiumService != null && appiumService.isRunning()) {
            appiumService.stop();
            System.out.println("Appium server stopped.");
        }
    }

    public static URL getAppiumServerUrl() {
        if (appiumService != null && appiumService.isRunning()) {
            return appiumService.getUrl();
        } else {
            return null;
        }
    }
}
