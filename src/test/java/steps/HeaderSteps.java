package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import org.junit.Assert;
import web.pages.HeaderPage;

public class HeaderSteps {

    private HeaderPage headerPage = new HeaderPage();

    @And("Check profile button for user (.*) is present at the Header")
    public void checkProfileButtonForUserIsPresent(String userName) {
        Assert.assertTrue(headerPage.profileHeaderButton(userName)
                .isDisplayed());
    }
}
