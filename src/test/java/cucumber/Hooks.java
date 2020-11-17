package cucumber;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static data.Urls.BASE_URL;

public class Hooks {

    @Before({"@openLoginPage"})
    public void beforeEach() {
        Selenide.open(BASE_URL);
    }

    @After({"@openLoginPage"})
    public void afterEach() {
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().quit();
    }
}
