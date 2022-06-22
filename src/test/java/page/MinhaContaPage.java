package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MinhaContaPage {

    private final SelenideElement titulo = $(".page-heading");
    private final SelenideElement historicoDePedidos = $(".icon-list-ol");
    private final SelenideElement meusBoletos = $(".icon-ban-circle");
    private final SelenideElement meusEnderecos = $(".icon-building");
    private final SelenideElement minhasInformacoes = $(".icon-user");
    private final SelenideElement meusFav = $(".icon-heart");

    public SelenideElement getTitulo() {
        return titulo;
    }

    public SelenideElement getHistoricoDePedidos() {
        return historicoDePedidos;
    }

    public SelenideElement getMeusBoletos() {
        return meusBoletos;
    }

    public SelenideElement getMeusEnderecos() {
        return meusEnderecos;
    }

    public SelenideElement getMinhasInformacoes() {
        return minhasInformacoes;
    }

    public SelenideElement getMeusFav() {
        return meusFav;
    }
}
