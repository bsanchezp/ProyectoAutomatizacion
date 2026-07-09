package com.automation.stepdefinitions;


import com.automation.pages.LoginPage;
import static com.automation.driver.DriverFactory.*;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginSteps {


    private final LoginPage loginPage;


    public LoginSteps(){
        loginPage = new LoginPage();
    }


    @Dado("que estoy en la página de inicio de sesión")
    public void estoyEnPaginaLogin(){

    }


    @Cuando("ingreso un usuario y contraseña válidos")
    public void ingresoCredencialesValidas(){
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }


    @Cuando("presiono el botón de inicio de sesión")
    public void presionoBotonLogin(){
        loginPage.clickLogin();
        loginPage.waitSeconds(3);
    }


    @Entonces("debería visualizar la página principal")
    public void validarPaginaPrincipal(){
        assertTrue(loginPage.isHomePageDisplayed(),"La página principal no fue mostrada después del login");

    }
}