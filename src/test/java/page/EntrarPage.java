package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntrarPage {

    private final SelenideElement   emailAdd = $("#user_email"),
                                    password = $("#user_password"),
                                    btnLogin = $(By.name("commit")),

                                    btnForgotPass = $(".link-below-button");

    public SelenideElement getEmailAdd() {
        return emailAdd;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getBtnLogin() {
        return btnLogin;
    }

    public SelenideElement getBtnForgotPass() {
        return btnForgotPass;
    }
}
