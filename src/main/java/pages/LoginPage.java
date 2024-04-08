package pages;

import common.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utilities.JsonDataManger;

public class LoginPage extends PageBase {

    private final By phoneNumberField = AppiumBy.xpath("//android.view.View[@resource-id='phoneNumberField']/android.view.View/android.widget.EditText");
    private final By passwordField = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
    private final By loginButton = AppiumBy.xpath("//android.view.View[@resource-id='loginBtn']/android.widget.Button");
    String dataFile = "LoginCredentials.json";

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public LoginPage enterPhoneNumber() {
        setElementText(phoneNumberField, JsonDataManger.jsonReader("phoneNumber", dataFile));
        return this;
    }

    public LoginPage enterPassword() {
        setElementText(passwordField, JsonDataManger.jsonReader("password", dataFile));
        return this;
    }

    public void tapOnLoginButton() {
        clickOnElement(loginButton);
    }
}
