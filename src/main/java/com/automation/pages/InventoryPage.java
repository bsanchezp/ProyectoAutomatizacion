package com.automation.pages;

import org.openqa.selenium.By;

public class InventoryPage extends BasePage {

    // Localizadores
    private final By lblTitle = By.className("title");
    private final By btnShoppingCart = By.id("shopping_cart_container");
    private final By lblShoppingCartCount = By.className("shopping_cart_badge");
    //private final By btnAddCart = By.xpath("");

    public InventoryPage() {
        super();
    }

    // Agrega un producto al carrito buscando por su nombre.
    public void addProduct(String productName) {
        By btnAddToCart = By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button");
        click(btnAddToCart);
    }

    // Devuelve la cantidad mostrada en el badge del carrito.
    public int getCartCounter() {
        if (!isDisplayed(lblShoppingCartCount)) {
            return 0;
        }
        return Integer.parseInt(
                getText(lblShoppingCartCount)
        );
    }

    // Hace clic sobre el carrito.
    public void clickShoppingCart() {
        click(btnShoppingCart);
    }

    // Valida que estamos en Inventory.
    public boolean isInventoryDisplayed() {
        return isDisplayed(lblTitle);
    }

     // Devuelve el título.
    public String getInventoryTitle() {
        return getText(lblTitle);
    }
}