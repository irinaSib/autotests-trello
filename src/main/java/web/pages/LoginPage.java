package web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class LoginPage {

    public SelenideElement userName = $x("//input[@id='user']"),
            password = $x("//input[@id='password']"),
            loginButton = $x("//input[@id='login']");

    public SelenideElement messageError(String messageError){
        return $x(format("//p[contains (@class, 'error-message') and contains (.,'%s')]",
                messageError));
    }
}
