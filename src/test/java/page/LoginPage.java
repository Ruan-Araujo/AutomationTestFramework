package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement emailCadastrarConta = $("#email_create");
    private final SelenideElement btnCriarConta = $("#SubmitCreate");

    private final SelenideElement emailLogin = $("#email");
    private final SelenideElement senhaLogin = $("#passwd");
    private final SelenideElement btnLogin = $("#SubmitLogin");

    public SelenideElement getEmailLogin() {
        return emailLogin;
    }

    public SelenideElement getSenhaLogin() {
        return senhaLogin;
    }

    public SelenideElement getBtnLogin() {
        return btnLogin;
    }

    public SelenideElement getEmailCadastrarConta() {
        return emailCadastrarConta;
    }

    public SelenideElement getBtnCriarConta() {
        return btnCriarConta;
    }
}
