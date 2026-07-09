package com.automation.stepdefinitions;


import com.automation.pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.automation.driver.DriverFactory.*;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginSteps {


    private final LoginPage loginPage;


    public LoginSteps(){
        loginPage = new LoginPage();
    }


    @Dado("que estoy en la página de inicio de sesión")
    public void estoyEnPaginaLogin(){

    }

    @Dado("que inicio sesión con el usuario {string} y contraseña {string}")
    public void login(String usuario, String password){
        loginPage.login(usuario,password);
        loginPage.clickLogin();
        loginPage.waitSeconds(4);
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

    @Cuando("ingreso un usuario invalido")
    public void ingresoUnUsuarioInvalido() {
        loginPage.enterUsername("standard_user_fail");
    }

    @Y("ingreso una contraseña valida")
    public void ingresoUnaContrasenaValida() {
        loginPage.enterPassword("secret_sauce");
    }

    @Entonces("debería visualizar el mensaje de error {string}")
    public void validarMensajeErrorLogin(String mensajeError) {
        assertEquals(loginPage.getMensajeError(),mensajeError);
    }

    @Y("el password esta vacio")
    public void passwordVacio() {
        loginPage.enterPassword("");
    }
}