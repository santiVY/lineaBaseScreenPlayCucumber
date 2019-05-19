
Feature: Gmail
  Como un usuario web
  Quiero usar Gmail
  Para enviar correos.

  @Caso1
  Scenario Outline: Send Email in Gmail 
    Given juanita abre su navegador en la pagina de Gmail
    When inicia sesion en Gmail <correo> y <contraseña>
    Then deberia ver un mensaje como Se han detectado problemas de seguridad

Examples:
	| correo 						| contraseña 			|
	|s*y***@gmail.com		| ******** 				|
  
