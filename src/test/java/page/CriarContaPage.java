package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CriarContaPage {

    private final SelenideElement generoRadioButton = $(By.name("id_gender"));
    private final SelenideElement nome = $("#customer_firstname");
    private final SelenideElement sobrenome = $("#customer_lastname");
    private final SelenideElement email = $("#email");
    private final SelenideElement password = $("#passwd");
    private final SelenideElement selectDias = $("#days");
    private final SelenideElement selectMeses = $("#months");
    private final SelenideElement selectAnos = $("#years");
    private final SelenideElement selectDiaDeNascimento = $("#days");
    private final SelenideElement newLetter = $("#newsletter");
    private final SelenideElement ofertas = $("#optin");
    private final SelenideElement nomeEndereco = $("#firstname");
    private final SelenideElement sobrenomeEndereco = $("#lastname");
    private final SelenideElement empresa = $("#company");
    private final SelenideElement logradouro = $("#address1");
    private final SelenideElement logradourComplemento = $("#address2");
    private final SelenideElement cidade = $("#city");
    private final SelenideElement selectEstado = $("#id_state");
    private final SelenideElement caixaPostal = $("#postcode");
    private final SelenideElement pais = $("#id_country");
    private final SelenideElement informacaoAdicional = $("#other");
    private final SelenideElement telefone = $("#phone");
    private final SelenideElement celular = $("#phone_mobile");
    private final SelenideElement enderecoAlias = $("#alias");
    private final SelenideElement btnRegistrar = $("#submitAccount");

    public SelenideElement getGeneroRadioButton() {
        return generoRadioButton;
    }

    public SelenideElement getNome() {
        return nome;
    }

    public SelenideElement getSobrenome() {
        return sobrenome;
    }

    public SelenideElement getEmail() {
        return email;
    }

    public SelenideElement getPassword() {
        return password;
    }

    public SelenideElement getSelectDias() {
        return selectDias;
    }

    public SelenideElement getSelectMeses() {
        return selectMeses;
    }

    public SelenideElement getSelectAnos() {
        return selectAnos;
    }

    public SelenideElement getSelectDiaDeNascimento() {
        return selectDiaDeNascimento;
    }

    public SelenideElement getNewLetter() {
        return newLetter;
    }

    public SelenideElement getOfertas() {
        return ofertas;
    }

    public SelenideElement getNomeEndereco() {
        return nomeEndereco;
    }

    public SelenideElement getSobrenomeEndereco() {
        return sobrenomeEndereco;
    }

    public SelenideElement getEmpresa() {
        return empresa;
    }

    public SelenideElement getLogradouro() {
        return logradouro;
    }

    public SelenideElement getLogradourComplemento() {
        return logradourComplemento;
    }

    public SelenideElement getCidade() {
        return cidade;
    }

    public SelenideElement getSelectEstado() {
        return selectEstado;
    }

    public SelenideElement getCaixaPostal() {
        return caixaPostal;
    }

    public SelenideElement getPais() {
        return pais;
    }

    public SelenideElement getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public SelenideElement getTelefone() {
        return telefone;
    }

    public SelenideElement getCelular() {
        return celular;
    }

    public SelenideElement getEnderecoAlias() {
        return enderecoAlias;
    }

    public SelenideElement getBtnRegistrar() {
        return btnRegistrar;
    }
}
