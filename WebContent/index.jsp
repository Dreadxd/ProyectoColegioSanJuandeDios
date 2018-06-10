<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">

<title>I.E.P San Juan de Dios</title>

</head>
<body>


<form>
	<br>
	<br>
	<br>
	<table id="centroLogin">
		<tr>
			<td><img src="imagen/logo.png" alt="" width="90" height="95" HSPACE="20"></td>
			<td><h2>I.E.P San Juan de Dios</h2></td>
		</tr>
	</table>
</form>
	
<form id="formularioLogin" method="post" action="ServletAutenticacion">
	<table id="centro">
		<tr><td><br></td></tr>
		<tr><td><br></td></tr>
		<tr>
			<td><h3>USUARIO:</h3></td>
			<td><input type="text" name="txtUser" placeholder="Usuario" id="name" required data-validation-required-message="Por favor ingrese su nombre." maxlength="8"></td>
			<br>
		</tr>
		<tr><td><br></td></tr>
		<tr>
			<td><h3>CONTRASE&ntilde;A:</h3></td>
			<td><input type="password" name="txtPass" placeholder="Contrase&ntilde;a" required data-validation-required-message="Por favor ingrese su contraseña."  maxlength="8" /></td>
		</tr>
		<tr><td><br></td></tr>
	</table>
	<center>
		<input type="submit" value="ACEPTAR" class="buttonLogin">
	</center>
</form>
	<%if(request.getAttribute("error")!=null) %>
		${error}
	<% %>

<div class="footer">
	<br>
	<p> Jr. Cajahuaman 823 Urb. El Tr&eacute;bol, Los Olivos, Cercado de Lima</p>
	<p>Telefonos: (01) 5338177</p>
	<br>
	<p>&copy; 2018  Todos los derechos reservados <a id="derechos">by Javier</a></p>
	<br>
</div>

</body>
</html>