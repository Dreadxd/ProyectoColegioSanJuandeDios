<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">

<title>Generar Padron de Pago</title>
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
					<td><center><a id="textMenu">Gestionar Padron de Pago</a></center></td>
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

<center>
<div class="note" Style="width:1000px;margin-top:10px">
<center>
    <table Style="color:black">
    <caption Style="padding:5px">Filtrar Datos</caption>
    	<tr>
    		<td>Año Academico:</td>
    		<td><SELECT NAME="selAño" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<OPTION>2018</OPTION>
						<OPTION>2017</OPTION>
				</SELECT></td>
    	</tr>
    	<tr><td></td></tr>
    	<tr><td></td></tr>
    	<tr><td></td></tr>
    	<tr>
    		<td>Nivel:</td>
    		<td><SELECT NAME="selNivel" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<OPTION>Inicial</OPTION>
						<OPTION>Primaria</OPTION>
				</SELECT></td>
			<td></td>
			<td></td>
			<td></td>
			<td><input type="submit" value="Consultar Alumnos" class="buttonLogin" style="background-color:#a9d08e;"></td>
			<td><a Style="margin-left:80px">Dni/Alumnos:</a></td>
			<td><input type="text" name="txtNomApo" id="name" required></td>
			<td><a Style="margin-left:30px"><input type="submit" value="Buscar Alumno" class="buttonLogin" style="background-color:#a9d08e;"></a></td>
    	</tr>
    	<tr>
    		<td>Grado:</td>
    		<td><SELECT NAME="selGrado" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<OPTION>1º</OPTION> 
						<OPTION>2º</OPTION> 
						<OPTION>3º</OPTION> 
						<OPTION>4º</OPTION> 
				</SELECT></td>
    	</tr>
    	<tr>
    		<td>Seccion:</td>
    		<td><SELECT NAME="selSeccion" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<OPTION>A</OPTION>
						<OPTION>B</OPTION>
				</SELECT></td>
    	</tr>
    </table>
    </center>
</div>
</center>

<center>
<div class="note" Style="width:95%;margin-top:10px">
<center>
    <table Style="color:black">
    <caption Style="padding:5px">Detalle del Padron</caption>
    	<tr>
    		<td>Concepto de Pago:</td>
    		<td><SELECT NAME="selConceptoPago" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<OPTION>Matricula</OPTION>
						<OPTION>Pension Marzo</OPTION>
				</SELECT></td>
    		<td><a Style="margin-left:40px">Motivo:</a></td>
    		<td><SELECT NAME="selMotivo" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<OPTION>Ayuda Economica</OPTION>
						<OPTION>Promocion 5º secundaria</OPTION>
				</SELECT></td>
			<td><a Style="margin-left:40px">Descuento:</a></td>
			<td><input type="text" name="txtNomApo" id="name" required></td>
			<td><a Style="margin-left:50px"><input type="submit" value="Procesar Descuento" class="buttonLogin" style="background-color:#a9d08e;"></a></td>
			<td><a Style="margin-left:120px"><input type="submit" value="Enviar Cronograma" class="buttonLogin" style="background-color:#a9d08e;"></a></td>
    	</tr>
    </table> 
    </center>
</div>
</center>









<div class="footerAll">
	<p> Jr. Cajahuaman 823 Urb. El Tr&eacute;bol, Los Olivos, Cercado de Lima</p>
	<p>Telefonos: (01) 5338177</p>
</div>
</body>
</html>