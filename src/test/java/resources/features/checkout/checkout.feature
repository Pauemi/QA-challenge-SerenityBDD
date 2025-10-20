@checkout
Característica: Checkout

Antecedentes:
Dado que el usuario abre la página de inicio
Y inicia sesión con usuario "standard_user" y contraseña "secret_sauce"
Y agrega al carrito la mochila y la luz de bicicleta
Y visualiza el carrito

Escenario: Completar el formulario y finalizar
Cuando completa el formulario de compra con nombre "Emilia", apellido "Gonzalez" y código postal "170301"
Y finaliza la compra
Entonces debería ver el mensaje "THANK YOU FOR YOUR ORDER"
