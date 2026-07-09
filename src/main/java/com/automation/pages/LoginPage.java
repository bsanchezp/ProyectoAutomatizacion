package com.automation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // Locators
    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By homeTitle = By.className("title");


    // Constructor
    public LoginPage(){
        super();
    }

    // Actions
    public void enterUsername(String username){
        write(usernameInput, username);
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

    public String getHomeTitle(){
        return getText(homeTitle);
    }
}