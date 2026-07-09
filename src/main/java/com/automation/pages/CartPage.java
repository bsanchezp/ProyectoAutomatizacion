package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    // Localizadores
    private final By lblTitle = By.className("title");
    private final By lblInventoryPrices = By.className("inventory_item_price");
    private final By btnCheckout = By.id("checkout");

    public CartPage() {
        super();
    }

    // Click en el boton del checkout
    public void clickCheckout() {
        click(btnCheckout);
    }

    // Valida que estamos en el carrito.
    public boolean isCartDisplayed() {
        return isDisplayed(lblTitle);
    }

    // Devuelve el título del carrito
    public String getCartTitle() {
        return getText(lblTitle);
    }

    // Calcula el subtotal de todos los productos.
    public double getSubtotal() {
        //List<WebElement> prices = getDriver().findElements(lblInventoryPrices);
        List<WebElement> prices = findAll(lblInventoryPrices);
        double subtotal = 0;
        for (WebElement price : prices) {
            String value = price.getText();
            value = value.replace("$", "");
            subtotal += Double.parseDouble(value);
        }
        return subtotal;
    }
}