package action;

import base.Base;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import page.CriarContaPage;
import page.HomePage;
import page.LoginPage;
import page.MinhaContaPage;

import java.io.IOException;

public class CriarContaAction extends Base {

    public static Logger log = LogManager.getLogger(CriarContaAction.class.getName());
    private HomePage homePage;
    private LoginPage loginPage;
    private CriarContaPage contaPage;
    private MinhaContaPage minhaContaPage;

    public CriarContaAction() {
        this.homePage = new HomePage();
        log.info("Instanciando page object: home page");
        this.loginPage = new LoginPage();
        log.info("Instanciando page object: login page");
        this.contaPage = new CriarContaPage();
        log.info("Instanciando page object: criar conta page");
        this.minhaContaPage = new MinhaContaPage();
        log.info("Instanciando page object: home page");
        Configuration.timeout = 10000;
    }

    public void fazerCadastro() throws IOException {
        Selenide.open(initializeProp("url2"));
        log.info("Indo para a página principal");
        homePage.getSignIn().click();
        log.info("Clicado no botão signIn");
        loginPage.getEmailCadastrarConta().setValue("patolino4@email.com");
        log.info("Inserindo email");
        loginPage.getBtnCriarConta().click();
        log.info("Clicando no botão para criar conta");
        contaPage.getGeneroRadioButton().selectRadio("1");
        log.info("Selecionando gênero");
        contaPage.getNome().setValue("Patolino");
        log.info("Inserindo nome");
        contaPage.getSobrenome().setValue("Calça de shopping");
        log.info("Iserindo sobrenome");
        contaPage.getPassword().setValue("12345");
        log.info("Inserindo senha");
        contaPage.getSelectDias().selectOptionByValue("2");
        log.info("Selecionando dia de nascimento");
        contaPage.getSelectMeses().selectOptionByValue("7");
        log.info("Selecionando mês de nascimento");
        contaPage.getSelectAnos().selectOptionByValue("1998");
        log.info("Selecionando ano de nascimento");
        contaPage.getNewLetter().click();
        log.info("Selecioanando checkbox de newsletter");
        contaPage.getOfertas().click();
        log.info("Selecioanando checkbox de ofertas");
        contaPage.getEmpresa().setValue("Vertigo");
        log.info("Inserindo nome da empresa");
        contaPage.getLogradouro().setValue("Rua das amazonas");
        log.info("Inserindo logradouro");
        contaPage.getLogradourComplemento().setValue("Final da rua");
        log.info("Inserindo complemento do logradouro");
        contaPage.getCidade().setValue("Nova Ypork");
        log.info("Inserindo nome da cidade");
        contaPage.getSelectEstado().selectOptionByValue("2");
        log.info("Selecinando o estado");
        contaPage.getCaixaPostal().setValue("00000");
        log.info("Inserindo código postal");
        contaPage.getPais().selectOptionByValue("21");
        log.info("Selecioanando país");
        contaPage.getInformacaoAdicional().setValue("Automatizando");
        log.info("Inserindo info adicional");
        contaPage.getCelular().setValue("98768756");
        log.info("Inserindo celular");
        contaPage.getEnderecoAlias().setValue("casa");
        log.info("Inserindo alias de endereço");
        contaPage.getBtnRegistrar().click();
        log.info("Selecioanando botão de registrar");
        minhaContaPage.getTitulo().shouldHave(Condition.text("My account".toUpperCase()));
        log.info("Selecionando btn de registrar");
    }
}
