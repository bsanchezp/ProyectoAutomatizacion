# language: es
@Smoke
Característica: Hacer el Checkout y finalizar la compra

  @Checkout
  Esquema del escenario: Finalizar una compra exitosamente

    Dado que inicio sesión con el usuario "<usuario>" y contraseña "<password>"
    Cuando agrego los siguientes productos al carrito:
      | <producto1> |
      | <producto2> |
      | <producto3> |
    Y ingreso al carrito de compras
    Y presiono el botón Checkout
    Y completo mis datos:
      | firstName | lastName | postalCode |
      | <nombre>  | <apellido> | <codigo> |
    Y presiono Continue
    Y presiono Finish
    Entonces debería visualizar el mensaje "<mensaje>"
    Ejemplos:
      | usuario       | password     | producto1           | producto2             | producto3         | nombre  | apellido | codigo | mensaje                   |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sauce Labs Bike Light | Sauce Labs Onesie | Beatriz | Sanchez  | 14001  | Thank you for your order! |