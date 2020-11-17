package web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class HeaderPage {

    public SelenideElement profileHeaderButton(String userName){
        return $x(format("//button[contains (@data-test-id, 'header-member-menu-button')" +
                " and contains (.,'%s')]", userName));
    }

}
