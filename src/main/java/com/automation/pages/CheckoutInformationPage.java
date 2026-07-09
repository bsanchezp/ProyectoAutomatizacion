package com.automation.pages;

import org.openqa.selenium.By;

public class CheckoutInformationPage extends BasePage {

    // Localizadores
    private final By txtFirstName = By.id("first-name");
    private final By txtLastName = By.id("last-name");
    private final By txtPostalCode = By.id("postal-code");
    private final By btnContinue = By.id("continue");
    private final By lblTitle = By.className("title");

    public CheckoutInformationPage() {
        super();
    }

    public void enterFirstName(String firstName) {
        write(txtFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        write(txtLastName, lastName);
    }

    public void enterPostalCode(String postalCode) {
        write(txtPostalCode, postalCode);
    }

    public void clickContinue() {
        click(btnContinue);
    }

    //Completa todo el formulario.
    public void fillInformation(String firstName,String lastName,String postalCode) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);

    }

    public String getTitle() {
        return getText(lblTitle);
    }

    public boolean isCheckoutInformationDisplayed() {
        return isDisplayed(lblTitle);
    }
}