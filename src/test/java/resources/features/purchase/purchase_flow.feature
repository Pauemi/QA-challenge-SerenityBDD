@e2e
Feature: Flujo de compra en SauceDemo

  Como cliente
  Deseo completar una compra en saucedemo.com
  Para confirmar el pedido correctamente

  Scenario: Compra exitosa con dos productos
    Given que el usuario abre la página de SauceDemo
    When inicia sesión con usuario "standard_user" y contraseña "secret_sauce"
    And agrega al carrito "Sauce Labs Backpack" y "Sauce Labs Bike Light"
    And visualiza el carrito
    And completa el checkout con nombre "Emilia", apellido "Camino" y código postal "170301"
    And finaliza la compra
    Then debería ver el mensaje "THANK YOU FOR YOUR ORDER"
