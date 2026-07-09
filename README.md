# 🚀 Proyecto de Automatización Web con Selenium BDD

## 📖 Descripción

Este proyecto es un framework de automatización de pruebas web desarrollado con **Java**, **Selenium WebDriver**, **Cucumber BDD** y **Maven**, siguiendo el patrón de diseño **Page Object Model (POM)**.

Su objetivo es proporcionar una arquitectura escalable, mantenible y reutilizable para la automatización de pruebas funcionales, aplicando buenas prácticas de desarrollo y automatización.

---

## 🛠 Tecnologías utilizadas

| Tecnología                       | Descripción                                                                                                        |
| -------------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| ☕ **Java 21 (JDK 21.0.11)**      | Lenguaje de programación utilizado para el desarrollo del framework.                                               |
| 📦 **Maven**                     | Gestión de dependencias, compilación y ejecución del proyecto.                                                     |
| 🌐 **Selenium WebDriver 4**      | Automatización de navegadores web utilizando Selenium Manager (sin necesidad de descargar WebDrivers manualmente). |
| 🥒 **Cucumber BDD**              | Framework para desarrollar escenarios de prueba utilizando la metodología Behavior Driven Development (BDD).       |
| 📝 **Gherkin (Español - UTF-8)** | Lenguaje utilizado para escribir los escenarios de prueba de forma legible para usuarios técnicos y funcionales.   |
| ✅ **JUnit 5**                    | Framework encargado de la ejecución de los escenarios y las validaciones (Assertions).                             |
| 🏗 **Page Object Model (POM)**   | Patrón de diseño utilizado para separar la lógica de negocio de la interacción con la interfaz de usuario.         |
| ⏳ **WebDriverWait**              | Implementación de esperas explícitas para mejorar la estabilidad de las pruebas.                                   |
| 📷 **Captura de Evidencias**     | Generación automática de capturas de pantalla cuando un escenario falla.                                           |
| 📊 **Reporte HTML de Cucumber**  | Generación automática de reportes de ejecución en formato HTML.                                                    |

---
### Selenium WebDriver

Se utilizó Selenium WebDriver como herramienta principal de automatización por ser el estándar de la industria para pruebas funcionales de aplicaciones web.

Además, desde la versión 4.6 incorpora **Selenium Manager**, permitiendo administrar automáticamente el WebDriver sin necesidad de descargar ChromeDriver manualmente.

**Beneficios**

- Compatible con múltiples navegadores.
- Gran comunidad y documentación.
- Integración sencilla con Java y Maven.
- Administración automática del WebDriver.

--

## ✨ Características del framework

* Arquitectura basada en **Page Object Model (POM)**.
* Automatización de pruebas utilizando **BDD**.
* Escenarios escritos en **Gherkin en español** con soporte **UTF-8**.
* Gestión automática del navegador mediante **Selenium Manager**.
* Esperas explícitas utilizando **WebDriverWait**.
* Hooks de Cucumber para la inicialización y cierre del navegador.
* Captura automática de evidencias en escenarios fallidos.
* Reportes HTML de ejecución.
* Código organizado por capas para facilitar el mantenimiento.
* Framework preparado para escalar e integrarse con herramientas de **CI/CD**.

---

## 📂 Estructura del proyecto

```text
ProyectoAutomatizacionWeb
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.automation
│   │   │       ├── driver
│   │   │       ├── pages
│   │   │       └── utils
│   │   │
│   │   └── resources
│   │       ├── config.properties
│   │       ├── qa.properties
│   │       ├── dev.properties
│   │       └── prod.properties
│   │
│   └── test
│       ├── java
│       │   └── com.automation
│       │       ├── hooks
│       │       ├── runners
│       │       └── stepdefinitions
│       │
│       └── resources
│           ├── features
│           └── junit-platform.properties
│
├── pom.xml
├── README.md
└── .gitignore
```
## Descripción de las carpetas

| Carpeta | Descripción |
|----------|-------------|
| **driver** | Contiene la inicialización y administración del WebDriver mediante Selenium Manager. |
| **pages** | Implementa el patrón Page Object Model (POM), encapsulando los localizadores y acciones de cada página. |
| **utils** | Contiene clases utilitarias para la lectura de archivos de configuración, gestión de ambientes y otras funciones comunes. |
| **hooks** | Configura las acciones que se ejecutan antes y después de cada escenario, como la inicialización y cierre del navegador, así como la captura de evidencias. |
| **runners** | Contiene la clase encargada de ejecutar los escenarios de Cucumber mediante JUnit 5. |
| **stepdefinitions** | Implementa los pasos definidos en los archivos Feature escritos en Gherkin. |
| **features** | Almacena los escenarios de prueba escritos en lenguaje Gherkin siguiendo el enfoque BDD. |
| **resources** | Contiene los archivos de configuración (`.properties`) para los diferentes ambientes de ejecución (QA, DEV y PROD). |
---
# Ejecución del proyecto

## Ejecutar todos los escenarios

```bash
mvn clean test
```

---

## Ejecutar por Tag

Ejemplo:

```bash
mvn clean test -Dcucumber.filter.tags="@Smoke"
```

o

```bash
mvn clean test -Dcucumber.filter.tags="@Checkout"
```

También es posible ejecutar directamente desde IntelliJ IDEA utilizando el TestRunner.

---

# Configuración de ambientes

El framework soporta múltiples ambientes mediante archivos `.properties`.

Actualmente se encuentran configurados:

```
qa.properties
dev.properties
uat.properties
prod.properties
```

Cada archivo contiene la configuración específica del ambiente.

Ejemplo:

```properties
base.url=https://www.saucedemo.com/
browser=chrome
timeout=10
headless=false
```

---

# Cambiar de ambiente

Por defecto, el proyecto utiliza el ambiente **QA**.

Para ejecutar sobre otro ambiente se debe enviar la propiedad `env`.

Ejemplo:

### QA

```bash
mvn clean test -Denv=qa
```

### DEV

```bash
mvn clean test -Denv=dev
```

### UAT

```bash
mvn clean test -Denv=uat
```

### PROD

```bash
mvn clean test -Denv=prod
```

La clase `Environment` obtiene automáticamente el valor de `env` y `ConfigReader` carga el archivo correspondiente.

---

# Funcionalidades implementadas

- Inicio de sesión exitoso.
- Validación de credenciales inválidas.
- Agregar productos al carrito.
- Validación del contador del carrito.
- Validación del subtotal.
- Checkout completo.
- Confirmación de compra.
- Escenarios parametrizados mediante **Scenario Outline**.
- Captura automática de evidencias (Screenshots).
- Soporte para ejecución por Tags.
- Soporte para múltiples ambientes.

---

## 👨‍💻 Autor

* Proyecto desarrollado por @Beatriz Sanchez
*  GitHub: https://github.com/bsanchezp
