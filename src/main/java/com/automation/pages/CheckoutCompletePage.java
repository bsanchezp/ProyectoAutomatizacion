package com.automation.pages;

import org.openqa.selenium.By;

public class CheckoutCompletePage extends BasePage {

    // Localizadores
    private final By lblCompleteHeader = By.className("complete-header");
    private final By lblCompleteText = By.className("complete-text");
    private final By btnBackHome = By.id("back-to-products");
    private final By lblTitle = By.className("title");

    public CheckoutCompletePage() {
        super();
    }

    public String getConfirmationMessage() {
        return getText(lblCompleteHeader);
    }

    public String getConfirmationDescription() {
        return getText(lblCompleteText);
    }

    public void clickBackHome() {
        click(btnBackHome);
    }

    public String getTitle() {
        return getText(lblTitle);
    }

    public boolean isCheckoutCompleted() {
        return isDisplayed(lblCompleteHeader);
    }
}