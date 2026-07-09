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
src
├── main
│   └── java
│       └── com.automation
│           ├── driver
│           ├── pages
│           └── utils
│
├── test
│   ├── java
│   │   └── com.automation
│   │       ├── hooks
│   │       ├── runners
│   │       └── stepdefinitions
│   │
│   └── resources
│       ├── features
│       └── junit-platform.properties
│
├── pom.xml
└── README.md
```

---

## 🎯 Objetivos del proyecto

* Implementar pruebas automatizadas utilizando buenas prácticas.
* Mantener una arquitectura limpia, reutilizable y escalable.
* Facilitar el mantenimiento mediante el patrón **Page Object Model (POM)**.
* Permitir la ejecución de escenarios BDD utilizando Cucumber.
* Integrar el framework con herramientas de Integración Continua (CI/CD).

---

## 👨‍💻 Autor

* Proyecto desarrollado por @Beatriz Sanchez
*  GitHub: https://github.com/bsanchezp
