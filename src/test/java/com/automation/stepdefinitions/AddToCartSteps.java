package com.automation.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import com.automation.pages.CartPage;
import com.automation.pages.InventoryPage;
import com.automation.pages.LoginPage;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToCartSteps {

    private final LoginPage loginPage = new LoginPage();
    private final InventoryPage inventoryPage = new InventoryPage();
    private final CartPage cartPage = new CartPage();

    @Cuando("agrego los siguientes productos al carrito:")
    public void agregoLosProductos(DataTable tabla) {
        List<String> productos = tabla.asList(String.class);
        for (String producto : productos) {
            inventoryPage.addProduct(producto);
            loginPage.waitSeconds(2);
        }
    }

    @Y("ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras() {
        inventoryPage.clickShoppingCart();
        loginPage.waitSeconds(3);
    }

    @Entonces("el contador del carrito debe ser {string}")
    public void elContadorDelCarritoDebeSer(String cantidadEsperada) {
        assertEquals(Integer.parseInt(cantidadEsperada),inventoryPage.getCartCounter());
        loginPage.waitSeconds(2);
    }

    @Y("el subtotal de los productos debe ser {string}")
    public void elSubtotalDeLosProductosDebeSer(String subTotalEsperado) {
        assertEquals(Double.parseDouble(subTotalEsperado),cartPage.getSubtotal(),0.01);
        loginPage.waitSeconds(2);
    }
}
