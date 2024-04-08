package pages;

import common.PageBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PostAdPage extends PageBase {
    private final By pageLabel = AppiumBy.xpath("//android.widget.TextView[@text='Post an Ad']");
    private final By categoryButton = AppiumBy.id("com.forsale.forsale:id/chooseCategoryField");
    private final By probertyCategoryDropDown = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView" +
            "[@resource-id='com.forsale.forsale:id/rvCategorySelection']/android.view.ViewGroup[2]");
    private final By probertyServiceSubCategoryButton = AppiumBy.xpath("//androidx.recyclerview.widget." +
            "RecyclerView[@resource-id='com.forsale.forsale:id/rvCategorySelection']/android.view.ViewGroup[7]");
    private final By nextButton = AppiumBy.xpath("//android.widget.TextView[@text='Next']");
    private final By whereDropDown = AppiumBy.xpath("//android.widget.EditText[@resource-id='com.forsale.forsale:id/chooseDistrictField']");
    private final By districtDropDown = AppiumBy.id("com.forsale.forsale:id/locationSelectorText");
    private final By distictJahraOption = AppiumBy.xpath("//android.widget.TextView[@text='Jahra']");
    private final By doneDistrictButton = AppiumBy.id("com.forsale.forsale:id/btnProceed");
    private final By doneLocationButton = AppiumBy.xpath("//android.widget.TextView[@text='Done']");
    private final By tileTxtField = AppiumBy.id("com.forsale.forsale:id/adTitleField");
    private final By addMediaPageTitle = AppiumBy.xpath("//android.widget.TextView[@text='Add Media']");
    private final By validationMessage = AppiumBy.xpath("//android.widget.Toast[@text='Kindly Fill all the required information!']");

    public PostAdPage(AppiumDriver driver) {
        super(driver);
    }

    public void assertUserIsDirectedToPostAd() {
        assertElementIsDisplayed(pageLabel);
    }

    public PostAdPage tapOnCategoryButton() {
        clickOnElement(categoryButton);
        return this;
    }

    public PostAdPage tapOnPropertyCategoryDropDown() {
        clickOnElement(probertyCategoryDropDown);
        return this;
    }

    public PostAdPage tapOnProbertyServiceSubCategoryButton() {
        clickOnElement(probertyServiceSubCategoryButton);
        return this;
    }

    public PostAdPage tapOnNextButton() {
        clickOnElement(nextButton);
        return this;
    }

    public PostAdPage tapOnWhereDropDown() {
        clickOnElement(whereDropDown);
        return this;
    }

    public PostAdPage tapOnDistrictDropDown() {
        clickOnElement(districtDropDown);
        return this;
    }

    public PostAdPage tapOnDistictJahraOption() {
        clickOnElement(distictJahraOption);
        return this;
    }

    public PostAdPage tapOnDoneDistrictButton() {
        clickOnElement(doneDistrictButton);
        return this;
    }

    public PostAdPage tapOnDoneLocationButton() {
        clickOnElement(doneLocationButton);
        return this;
    }

    public PostAdPage enterAdTitle() {
        setElementText(tileTxtField, "Title 123");
        return this;
    }

    public void assertThatAddMediaScreenIsDisplayed() {
        assertElementIsDisplayed(addMediaPageTitle);
    }

    public void assertThatErrorMessageIsDisplayed() {
        String errorMessage = String.valueOf(getElementText(validationMessage));
        Assert.assertEquals(errorMessage, "Kindly Fill all the required information!");
    }

}
