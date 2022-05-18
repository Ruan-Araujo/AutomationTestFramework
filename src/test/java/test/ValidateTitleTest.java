package test;

import com.codeborne.selenide.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.LandingPage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class ValidateTitleTest extends Base {

    private LandingPage landingPage;

    //Log4j
    public static Logger log = LogManager.getLogger(ValidateTitleTest.class.getName());

    @BeforeTest
    public void setUp() throws IOException {
        landingPage = new LandingPage();
        log.info("Instanciando Page Object: LandingPage");
        Configuration.browser = initializeProp("chrome");
        open(initializeProp("url"));
        log.info("Navegando para home page");
    }

    @Test
    public void validarLogin() throws IOException {
        Assert.assertEquals(landingPage.getTitulo().getText(), "Featured Courses1".toUpperCase());
        log.info("Mensagem de texto do título validada com sucesso!");
    }
}
