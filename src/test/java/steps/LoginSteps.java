package steps;

import connector.Hooks;
import io.cucumber.java.en.And;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(Hooks.driver);

    @And("user enter login credentials")
    public void userEnterLoginCredentials() {
        loginPage.enterPhoneNumber()
                .enterPassword()
                .tapOnLoginButton();
    }
}
