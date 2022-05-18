package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.LandingPage;
import page.LoginPage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

public class LoginTest extends Base {

    /*Todo: Adding logs, Generating html reports, Screenshots on failure, Jenkins*/
    private LandingPage landingPage;
    private LoginPage loginPage;

    public static Logger log = LogManager.getLogger(LoginTest.class.getName());

    @BeforeTest
    public void setUp() throws IOException {
        landingPage = new LandingPage();
        log.info("Instanciando page object: landing page");
        loginPage = new LoginPage();
        log.info("Instanciando page object: login page");
        Configuration.browser = initializeProp("firefox");
        log.info("Configurando browser para abrir com firefox");
    }

    @Test(dataProvider = "dataLogin")
    public void login(String username, String password, String text) throws IOException {

        open(initializeProp("url"));
        log.info("Navegando para home page");

        if (landingPage.getBtnFecharModal().isDisplayed()) {
            landingPage.getBtnFecharModal().click();
            log.info("Modal fechado com sucesso");
        }

        landingPage.getLoginBtn().click();
        log.info("Indo pra página de login");
        loginPage.getEmailAdd().setValue(username);
        log.info("Inserindo e-mail");
        loginPage.getPassword().setValue(password);
        log.info("Inserindo senha");
        log.info(text);
        loginPage.getBtnLogin().pressEnter();
        log.info("Apertando no botão de login");
    }

    @DataProvider()
    public Object[][] dataLogin() {
        //Row stands for how many different data types should run
        //Columns stands for how many values per each test
        Object[][] data = new Object[2][3];

        //If Array size is 5 = 0,1,2,3,4
        //0th row
        data[0][0] = "nonrestricteduser@qw.com";
        data[0][1] = "123456";
        data[0][2] = "restricted user";

        //1th row
        data[1][0] = "restricteduser@qw.com";
        data[1][1] = "45678";
        data[1][2] = "restrcted user";

        return data;
    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWindow();
    }
}
