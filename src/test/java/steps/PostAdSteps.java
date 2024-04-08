package steps;

import connector.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PostAdPage;

public class PostAdSteps {
    PostAdPage postAdPage = new PostAdPage(Hooks.driver);

    @Then("user should directed to posting an ad")
    public void userShouldDirectedToPostingAnAd() {
        postAdPage.assertUserIsDirectedToPostAd();
    }

    @When("user pick a category")
    public void userPickACategory() {
        postAdPage.tapOnCategoryButton()
                .tapOnPropertyCategoryDropDown()
                .tapOnProbertyServiceSubCategoryButton();
    }

    @And("tap on next button")
    public void tapOnNextButton() {
        postAdPage.tapOnNextButton();
    }

    @Then("error message should appear")
    public void errorMessageShouldAppear() {
        postAdPage.assertThatErrorMessageIsDisplayed();
    }

    @When("user select address")
    public void userSelectAddress() {
        postAdPage.tapOnWhereDropDown()
                .tapOnDistrictDropDown()
                .tapOnDistictJahraOption()
                .tapOnDoneDistrictButton()
                .tapOnDoneLocationButton();
    }

    @And("user enter title for the ad")
    public void userEnterTitleForTheAd() {
        postAdPage.enterAdTitle();
    }

    @Then("user should be directed to Add media screen")
    public void userShouldBeDirectedToAddMediaScreen() {
        postAdPage.assertThatAddMediaScreenIsDisplayed();
    }
}
