package common;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.openqa.selenium.By;


public class PageBase {

    protected AppiumDriver driver;

    public PageBase(AppiumDriver driver) {
        this.driver = driver;
    }

    public void clickOnElement(By element) {
        driver.findElement(element).click();
    }

    public void setElementText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public void assertElementIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed(), "Element Not Displayed");
    }

    public String getElementText(By element) {
        return driver.findElement(element).getText();
    }
}
