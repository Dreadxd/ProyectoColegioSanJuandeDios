<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">

<title>Mantener Alumnos</title>
</head>
<body style="background-color:#ffffff;">
<div style="background-color:#fcfd1b;">
<table>
	<tr>
		<td>
			<table>
				<tr>
					<td><img src="imagen/logo.png" alt="" width="50" height="55" HSPACE="20" align="left" style="margin-right:450px"></td>
				</tr>
			</table>
		</td>
		<td>
			<table width="250" border="0">
				<tr>
					<td><center><h3>I.E.P San Juan de Dios</h3></center></td>
				</tr>
				<tr>
					<td><center><a id="textMenu">Mantener Alumnos</a></center></td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</div>

<div class="textboxMenu">
	<center>
			<table>
			<tr>
				<td><a href="GestionarCarga.jsp"><img src="imagen/menuGestionarCargaCurricular.png" alt="" HSPACE="3"></a></td>
				<td><a href="GestionarMatricula.jsp"><img src="imagen/menuGestionarMatricula.png" alt="" HSPACE="3"></a></td>
				<td><a href="GestionarPadronPago.jsp"><img src="imagen/menuGestionarPadronPago.png" alt="" HSPACE="3"></a></td>
				<td><a href="RegistrarArchivoTelecredito.jsp"><img src="imagen/menuArchivoTelecredito.png" alt="" HSPACE="3"></a></td>
				<td><a href="MantenerTarifario.jsp"><img src="imagen/menuTarifarios.png" alt="" HSPACE="3"></a></td>
				<td><a href="MantenerAlumnos.jsp"><img src="imagen/menuAlumnos.png" alt="" HSPACE="3"></a></td>
				<td><a href="MantenerDocentes.jsp"><img src="imagen/menuDocentes.png" alt="" HSPACE="3"></a></td>
				<td><a href="MantenerCursos.jsp"><img src="imagen/menuCursos.png" alt="" HSPACE="3"></a></td>
				<td><a href="Mantenimientos.jsp"><img src="imagen/menuMantenimiento.png" alt="" HSPACE="3"></a></td>
				<td><a href="ConsultarListas.jsp"><img src="imagen/menuConsultarListas.png" alt=""></a></td>
			</tr>
			</table>
	</center>
</div>



<div class="note" Style="margin:5px">
    <table Style="color:black">
    <caption >Datos Alumnos</caption>
    	<tr>
    		<td>DNI:</td>
    		<td><input type="text" name="txtDni" placeholder="Dni del alumno" id="name" required maxlength="8"></td>
    		<td></td>
    	</tr>
    	<tr></tr>
    	<tr></tr>
    	<tr></tr>
    	<tr>
    		<td>Nombre Alumno:</td>
    		<td><input type="text" name="txtNomAlu" placeholder="Nombres del alumno" id="name" required></td>
    		<td>Apellido Paterno Alumno:</td>
    		<td><input type="text" name="txtApePatAlu" placeholder="Apellido Paterno del alumno" id="name" required></td>
    		<td>Apellido Materno Alumno:</td>
    		<td><input type="text" name="txtApeMatAlu" placeholder="Apellido Materno del alumno" id="name" required></td>
    		<td rowspan="3">
    			<table>
    				<tr>
						<td><a style="margin-left:30px;margin-button:20px"><input type="submit" value="Agregar" class="buttonLogin" style="margin-button:10px;background-color:#a9d08e;"></a></td>
					</tr><tr>
						<td><a style="margin-left:30px"><input type="submit" value="Modificar" class="buttonLogin" style="margin-button:10px;background-color:#a9d08e;"></a></td>
					</tr><tr>
						<td><a style="margin-left:30px"><input type="submit" value="Eliminar" class="buttonLogin" style="margin-button:10px;background-color:#e4322d;"></a></td>
					</tr>
    			</table>
    		</td>
    	</tr>
    	<tr>
    		<td>Nombre Apoderado:</td>
    		<td><input type="text" name="txtNomApo" placeholder="Nombres del apoderado" id="name" required></td>
    		<td>Fecha Nacimiento:</td>
    		<td><input id="date" type="date"></td>
    	</tr>
    	<tr>
    		<td>Direccion:</td>
    		<td colspan="3"><a Style="width:400px"><input type="text" name="txtDir" placeholder="Direccion" id="name" required></a></td>
    		<td>Distrito:</td>
    		<td><SELECT NAME="selDistrito" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<OPTION>San Martin de Porres</OPTION>
						<OPTION>Los Olivos</OPTION>
				</SELECT></td>
    	</tr>
    	<tr>
    		<td>Correo:</td>
    		<td><input type="text" name="txtEmail" placeholder="Correo" id="name" required></td>
    		<td>Telefono:</td>
    		<td><input type="text" name="txtPhone" placeholder="Telefono" id="name" required></td>
    		<td>Celular:</td>
    		<td><input type="text" name="txtCel" placeholder="Celular" id="name" required></td>
    	</tr>
    </table>
</div>




<div class="footerAll">
	<p> Jr. Cajahuaman 823 Urb. El Tr&eacute;bol, Los Olivos, Cercado de Lima</p>
	<p>Telefonos: (01) 5338177</p>
</div>
</body>
</html>