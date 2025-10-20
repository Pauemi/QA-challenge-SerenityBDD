@login @smoke
Característica: Autenticación (Login)

Antecedentes:
Dado que el usuario abre la página de inicio

Escenario: Login válido
Cuando inicia sesión con usuario "standard_user" y contraseña "secret_sauce"
Entonces debería ver el inventario de productos

Esquema del escenario: Login inválido
Cuando inicia sesión con usuario "<usuario>" y contraseña "<password>"
Entonces debería ver el mensaje de error "<mensaje>"
Ejemplos:
| usuario        | password      | mensaje                                 |
| locked_out_user| secret_sauce  | Sorry, this user has been locked out.   |
| standard_user  | wrong         | Username and password do not match      |
