# language: es
@Smoke
Característica: Añadir productos al carrito y validar productos y subtotal

  @AddCarrito
  Esquema del escenario: Agregar tres productos al carrito y validar el subtotal
    Dado que inicio sesión con el usuario "<usuario>" y contraseña "<password>"
    Cuando agrego los siguientes productos al carrito:
      | <producto1> |
      | <producto2> |
      | <producto3> |
    Y ingreso al carrito de compras
    Entonces el contador del carrito debe ser "<cantidad>"
    Y el subtotal de los productos debe ser "<subtotal>"
    Ejemplos:
      | usuario       | password     | producto1           | producto2             | producto3         | cantidad | subtotal |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sauce Labs Bike Light | Sauce Labs Onesie | 3        | 47.97    |