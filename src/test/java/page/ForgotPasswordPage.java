package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {

    private final SelenideElement enderecoEmailInput = $("#user_email");
    private final SelenideElement btnSendMeInstruction = $(By.name("commit"));
    private final  SelenideElement tituloReset = $(".main-hero > h1:nth-child(1)");

    public SelenideElement getEnderecoEmailInput() {
        return enderecoEmailInput;
    }

    public SelenideElement getBtnSendMeInstruction() {
        return btnSendMeInstruction;
    }

    public SelenideElement getTituloReset() {
        return tituloReset;
    }
}
