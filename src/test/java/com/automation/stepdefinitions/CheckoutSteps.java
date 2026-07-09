package com.automation.stepdefinitions;

import com.automation.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckoutSteps {

    private final LoginPage loginPage = new LoginPage();
    private final InventoryPage inventoryPage = new InventoryPage();
    private final CartPage cartPage = new CartPage();
    private final CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
    private final CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
    private final CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

    @Y("presiono el botón Checkout")
    public void presionoElBotonCheckout() {
        cartPage.clickCheckout();
    }

    @Y("completo mis datos:")
    public void completoMisDatos(DataTable dataTable) {
        // Obtener los datos del DataTable
        Map<String, String> datos = dataTable.asMaps(String.class, String.class).get(0);
        checkoutInformationPage.fillInformation(
                datos.get("firstName"),
                datos.get("lastName"),
                datos.get("postalCode")
        );
    }

    @Y("presiono Continue")
    public void presionoContinue() {
        checkoutInformationPage.clickContinue();
    }

    @Y("presiono Finish")
    public void presionoFinish() {
        checkoutOverviewPage.clickFinish();
    }

    @Entonces("debería visualizar el mensaje {string}")
    public void deberiaVisualizarElMensaje(String mensajeEsperado) {
        assertEquals(mensajeEsperado,checkoutCompletePage.getConfirmationMessage(),"El mensaje de confirmación no es el esperado."
        );
    }
}
