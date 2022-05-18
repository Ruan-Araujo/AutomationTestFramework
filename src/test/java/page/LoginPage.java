package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement   emailAdd = $("#user_email"),
                                    password = $("#user_password"),
                                    btnLogin = $(By.name("commit"));

    public SelenideElement getEmailAdd() {
        return emailAdd;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getBtnLogin() {
        return btnLogin;
    }
}
