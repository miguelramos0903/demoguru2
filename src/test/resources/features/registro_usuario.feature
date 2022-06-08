# language: es
Característica: El cliente Newstour tiene la necesidad de automatizar el registro de usuarios de su portal web.

  @TestCase1
  Esquema del escenario: Registro de usuarios en el portal web guru99
    Dado que yo quiero registrar un nuevo usuario en el portal web
    Cuando ingreso los datos requeridos en el formulario
      | <cp> | <firstname> | <lastName> | <phone> | <email> | <address> | <city> | <state> | <postalCode> | <country> | <userName> | <password> | <confirmPassword> |
    Entonces verifico el <resultadoEsperado> de l registro de usuario
    Ejemplos:
      | cp | firstname | lastName | phone      | email             | address         | city     | state     | postalCode | country  | userName     | password    | confirmPassword | resultadoEsperado                     |
      | 1  | carlos    | suarez   | 3180000000 | prueba@correo.com | calle 10 casa 1 | Medellin | Antioquia | 10001      | COLOMBIA | usuarionuevo | clave123456 | clave123456     | Note: Your user name is usuarionuevo. |