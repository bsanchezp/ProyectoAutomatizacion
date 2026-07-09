package com.automation.pages;

import org.openqa.selenium.By;

public class CheckoutOverviewPage extends BasePage {

    // Localizadores
    private final By btnFinish = By.id("finish");
    private final By btnCancel = By.id("cancel");
    private final By lblTitle = By.className("title");
    private final By lblPaymentInformation = By.xpath("//div[contains(text(),'Payment Information')]");
    private final By lblShippingInformation = By.xpath("//div[contains(text(),'Shipping Information')]");

    private final By lblPriceTotal = By.className("summary_total_label");
    public CheckoutOverviewPage() {
        super();
    }

    public void clickFinish() {
        click(btnFinish);
    }

    public void clickCancel() {
        click(btnCancel);
    }

    public String getTitle() {
        return getText(lblTitle);
    }

    public String getTotalPrice() {
        return getText(lblPriceTotal);
    }

    public boolean isPaymentInformationDisplayed() {
        return isDisplayed(lblPaymentInformation);
    }

    public boolean isShippingInformationDisplayed() {
        return isDisplayed(lblShippingInformation);
    }

    public boolean isCheckoutOverviewDisplayed() {
        return isDisplayed(lblTitle);
    }
}