package pages;


import common.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class HomePage extends PageBase {
    private final By searchBarField = AppiumBy.xpath("//android.widget.TextView[@text='Search for anything']");
    private final By allowButton = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button");
    private final By postAnAdButton = AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.forsale.forsale:id/navigation_bar_item_icon_view'])[3]");

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnAllowNotificationsButton() {
        clickOnElement(allowButton);
    }

    public void assertThatAppIsOpened() {
        assertElementIsDisplayed(searchBarField);
    }

    public void clickOnPostAnAdButton() {
        clickOnElement(postAnAdButton);
    }
}
