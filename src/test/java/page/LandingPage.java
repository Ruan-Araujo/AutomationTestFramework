package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LandingPage {

    private final SelenideElement loginBtn =
            $(".pull-right > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)");

    private final SelenideElement btnFecharModal =
            $("div.sumome-react-wysiwyg-component:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)");

    private final SelenideElement navBar = $(".nav");

    public SelenideElement getNavBar() {
        return navBar;
    }

    private final SelenideElement titulo = $("#content > div:nth-child(1) > div:nth-child(1)");

    public SelenideElement getTitulo() {
        return titulo;
    }

    public SelenideElement getBtnFecharModal() {
        return btnFecharModal;
    }

    public SelenideElement getLoginBtn() {
        return loginBtn;
    }

}
