package test;

import action.CriarContaAction;
import base.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class CriarContaTest extends Base {

    private CriarContaAction criarContaAction;

    @BeforeTest
    public void setUp() throws IOException {
        criarContaAction = new CriarContaAction();
        //Configuration.browser = iniciarPropriedades("firefox");
    }

    @Test
    public void realizarCadastroTest() throws IOException {
        criarContaAction.fazerCadastro();
    }

}
