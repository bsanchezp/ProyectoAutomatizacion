# language: es
Característica: Funcionalidad de inicio de sesión
  Como usuario registrado
  Quiero iniciar sesión en la aplicación
  Para poder acceder a mi cuenta

  Antecedentes:
    Dado que estoy en la página de inicio de sesión

  Escenario: Inicio de sesión exitoso con credenciales válidas
    Cuando ingreso un usuario y contraseña válidos
    Y presiono el botón de inicio de sesión
    Entonces debería visualizar la página principal
