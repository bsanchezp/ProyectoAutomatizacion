package com.automation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // Locators
    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By homeTitle = By.className("title");
    private final By labelErrorLogin = By.xpath("//h3[@data-test='error']");


    // Constructor
    public LoginPage(){
        super();
    }

    // Actions
    public void enterUsername(String username){
        write(usernameInput, username);
    }

    public void login (String user, String pass){
        write(usernameInput, user);
        write(passwordInput, pass);
    }
    public void enterPassword(String password){
        write(passwordInput, password);
    }

    public void clickLogin(){
        click(loginButton);
    }

    // Validations
    public boolean isHomePageDisplayed(){
        return isDisplayed(homeTitle);
    }

    public String getMensajeError(){
        return getText(labelErrorLogin);
    }
    public String getHomeTitle(){
        return getText(homeTitle);
    }
}