# 🧪 Serenity Screenplay - QA Challenge SauceDemo

Proyecto automatizado de pruebas **E2E** desarrollado con **Serenity BDD**, **Screenplay Pattern** y **JUnit 5**, que valida el flujo de compra completo en [SauceDemo](https://www.saucedemo.com/).

---

## ⚙️ Prerrequisitos

- **Sistema operativo:** macOS, Windows 10/11 o Linux
- **IDE:** IntelliJ IDEA 2023.1+
- **Maven:** 3.8.6+ (en variable de entorno `PATH`)
- **JDK:** 17 (en variable de entorno `JAVA_HOME`)
- **Google Chrome:** versión actualizada 

## 📦 Instalación

Desde la raíz del proyecto:

mvn clean install -DskipTests

## ▶️ Ejecución de pruebas

Ejecución normal:

mvn clean verify


Ejecución en modo headless:

mvn clean verify -Dchrome.switches="--headless=new"


## Flujo validado:

- Inicio de sesión 
- Agregar productos 
- Checkout 
- Finalizar compra 
- Confirmación de pedido

## 📊 Reporte Serenity

Ubicación:

target/site/serenity/index.html


Apertura automática:

open target/site/serenity/index.html

## 🧠 Información adicional

SDK: Java 17

Frameworks: Serenity BDD, Selenium WebDriver, JUnit 5

Configuración base: src/test/resources/serenity.conf

Navegador: Chrome

## 👩‍💻 Autor
Paula Emilia Camino
