package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import web.pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @When("Enter username (.*) on the Login page")
    public void enterUsername(String username) {
        loginPage.userName.setValue(username);
    }

    @And("Enter password (.*) on the Login page")
    public void enterPassword(String password) {
        loginPage.password.setValue(password);
    }

    @Then("Click 'Login' button on the Login page")
    public void clickLoginButton() {
        loginPage.loginButton.click();
    }

    @And("Check message error (.*) is present on the Login page")
    public void checkMessageErrorIsPresent(String messageError) {
        Assert.assertTrue(loginPage.messageError(messageError)
                .isDisplayed());
    }
}
