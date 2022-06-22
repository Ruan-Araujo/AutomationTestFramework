package action;

import base.Base;
import page.FecharCompraPage;
import page.HomePage;
import page.LoginPage;
import page.ProductPage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class RealizarCompraAction extends Base{

    private HomePage homePage;
    private LoginPage loginPage;
    private ProductPage productPage;
    private FecharCompraPage fecharCompraPage;
    public RealizarCompraAction() {
        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
        this.productPage = new ProductPage();
        this.fecharCompraPage = new FecharCompraPage();
    }

    public void realizarCompra() throws IOException {
        open(initializeProp("url2"));
        sleep(1000);
        homePage.getSignIn().click();
        loginPage.getEmailLogin().setValue("patolino4@email.com");
        loginPage.getSenhaLogin().setValue("12345");
        loginPage.getBtnLogin().click();
        homePage.getCampoDeBusca().setValue("T-Shirts");
        homePage.getBtnBusca().click();
        productPage.getCardTShirt().scrollIntoView(true).hover();
        productPage.getBtnAddAoCarinho().click();
        sleep(2000);
        productPage.getBtnProsseguirCompra().click();
        fecharCompraPage.getBtnCheckout().click();
        fecharCompraPage.getBtnCheckout().click();
    }
}
