package test;

import action.RealizarCompraAction;
import base.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RealizarCompraTest extends Base {

    private RealizarCompraAction realizarCompraAction;

    @BeforeTest
    public void setUp() throws IOException {
        realizarCompraAction = new RealizarCompraAction();
        //Configuration.browser = iniciarPropriedades("firefox");
    }

    @Test
    public void fazerCompra() throws IOException {
        realizarCompraAction.realizarCompra();
    }
}
