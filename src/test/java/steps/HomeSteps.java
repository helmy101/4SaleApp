package steps;

import connector.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage(Hooks.driver);

    @Then("Verify that user is directed to Home Page")
    public void verifyThatUserIsDirectedToHomePage() {

    }

    @When("User click on admin Button from left side menu")
    public void userClickOnAdminButtonFromLeftSideMenu() {

    }

    @Given("Open forsale application")
    public void openForsaleApplication() {
        homePage.clickOnAllowNotificationsButton();
        homePage.assertThatAppIsOpened();
    }

    @When("user tap on post an ad")
    public void userTapOnPostAnAd() {
        homePage.clickOnPostAnAdButton();
    }
}
