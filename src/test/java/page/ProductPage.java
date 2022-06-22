package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private SelenideElement cardTShirt = $(".product_img_link"),
                            btnAddAoCarinho = $(".ajax_add_to_cart_button > span:nth-child(1)"),
                            btnProsseguirCompra = $("a.button-medium > span");



    public SelenideElement getBtnProsseguirCompra() {
        return btnProsseguirCompra;
    }

    public SelenideElement getCardTShirt() {
        return cardTShirt;
    }

    public SelenideElement getBtnAddAoCarinho() {
        return btnAddAoCarinho;
    }
}
