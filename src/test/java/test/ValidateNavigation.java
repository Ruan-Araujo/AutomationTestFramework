package test;

import com.codeborne.selenide.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LandingPage;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class ValidateNavigation extends Base {
    private LandingPage landingPage;

    public static Logger log = LogManager.getLogger(ValidateNavigation.class.getName());

    @BeforeTest
    public void setUp() throws IOException {
        landingPage = new LandingPage();
        log.info("Instanciando page object: landing page");
        Configuration.browser = initializeProp("chrome");
        open(initializeProp("url"));
        log.info("Navengando para home page");
    }

    @Test
    public void validarLogin() throws IOException {
        Assert.assertEquals(landingPage.getTitulo().getText(), "Featured Courses".toUpperCase());
        log.info("Título validado com sucesso!");
        Assert.assertTrue(landingPage.getNavBar().isDisplayed());
        log.info("NavBar validada com sucesso!");
    }
}
