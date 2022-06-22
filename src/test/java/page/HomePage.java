package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement signIn = $(".login");

    private final SelenideElement campoDeBusca = $("#search_query_top");

    private final SelenideElement btnBusca = $(By.name("submit_search"));

    public SelenideElement getCampoDeBusca() {
        return campoDeBusca;
    }

    public SelenideElement getBtnBusca() {
        return btnBusca;
    }

    public SelenideElement getSignIn() {
        return signIn;
    }
}
