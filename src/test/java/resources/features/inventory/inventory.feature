@inventory
Característica: Gestión de inventario

Antecedentes:
Dado que el usuario abre la página de inicio
Y inicia sesión con usuario "standard_user" y contraseña "secret_sauce"

Escenario: Agregar dos productos al carrito
Cuando agrega al carrito la mochila y la luz de bicicleta
Entonces el icono del carrito debería mostrar "2"
