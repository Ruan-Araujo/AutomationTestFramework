package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class FecharCompraPage {

    private SelenideElement btnCheckout = $(byAttribute("title", "Proceed to checkout"));

    public SelenideElement getBtnCheckout() {
        return btnCheckout;
    }

}
