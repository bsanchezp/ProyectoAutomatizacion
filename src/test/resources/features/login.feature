# language: es
@Smoke
Característica: Inicio de sesion y validacion del flujo de SauceDemo

  @Login
  Escenario: Inicio de sesión exitoso con credenciales validas
    Dado que estoy en la página de inicio de sesión
    Cuando ingreso un usuario y contraseña válidos
    Y presiono el botón de inicio de sesión
    Entonces debería visualizar la página principal

  @Login_user_incorrect
  Esquema del escenario: Inicio de sesión con usuario incorrecto
    Dado que estoy en la página de inicio de sesión
    Cuando ingreso un usuario invalido
    Y ingreso una contraseña valida
    Y presiono el botón de inicio de sesión
    Entonces debería visualizar el mensaje de error "<mensajeError>"
  Ejemplos:
    | mensajeError                                                              |
    | Epic sadface: Username and password do not match any user in this service |
