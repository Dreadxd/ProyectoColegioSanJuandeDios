
<%@page import="modelo.entidad.BeanTaller"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">

<title>Gestionar Matricula</title>
</head>
<body style="background-color:#ffffff;">

<%
	ArrayList<BeanTaller> listaTaller= (ArrayList<BeanTaller>)request.getAttribute("listaTaller");
%>
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
					<td><center><a id="textMenu">Gestionar Matricula</a></center></td>
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
<a style="margin-left:50px;color:black">Codigo Matricula: </a><a style="margin-left:20px;color:black">99999999</a><a style="color:black; margin-left:850px"><script type="text/javascript">
var d = new Date();
document.write('Fecha: '+d.getDate(),'/'+(1+d.getMonth()),'/'+d.getFullYear(),'       Hora: '+d.getHours(),': '+(00+d.getMinutes()));
</script></a>


<table>
	<tr>
		<td>
			<div class="note" Style="width:400px;margin-left:50px;margin-right:50px">
    <table Style="color:black">
    <caption Style="padding:5px">Datos Alumnos</caption>
    	<tr>
    		<td>DNI:</td>
    		<td><input type="text" name="txtDni" placeholder="Dni del alumno" id="name" required maxlength="8"></td>
    		<td><input type="submit" value="Buscar" class="buttonLogin" style="background-color:#a9d08e;"></td>
    	</tr>
    	<tr><td></td></tr>
    	<tr><td></td></tr>
    	<tr><td></td></tr>
    	<tr>
    		<td>Nombre Alumno:</td>
    		<td><input type="text" name="txtNomAlu" id="name" required disabled ></td>
    	</tr>
    	<tr>
    		<td>Apellido Alumno:</td>
    		<td><input type="text" name="txtApeAlu" id="name" required disabled ></td>
    	</tr>
    	<tr>
    		<td>Nombre Apoderado:</td>
    		<td><input type="text" name="txtNomApo" id="name" required disabled ></td>
    	</tr>
    </table>
</div>
		</td>
		<td>
			<div class="note" Style="width:400px">
    <table Style="color:black">
    <caption Style="padding:5px">Datos Matricula</caption>
    	<tr>
    		<td>Nivel:</td>
    		<td><SELECT NAME="selNivel2" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						
				</SELECT></td>
    	</tr>
    	<tr>
    		<td>Grado:</td>
    		<td><SELECT NAME="selGrado2" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						
				</SELECT></td>
    	</tr>
    	<tr>
    		<td>Seccion:</td>
    		<td><SELECT NAME="selSeccion2" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						
				</SELECT></td>
    	</tr>
    	<tr><td></td></tr>
    	<tr><td></td></tr>
    	<tr><td></td></tr>
    	<tr>
    		<td>Taller:</td>
    		<td><SELECT NAME="selTaller" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<%for(BeanTaller taller: listaTaller){%>
						<option value="<%=taller.getIdTaller() %>"><%= taller.getTaller()%></option>
						<%} %>
				</SELECT></td>
    	</tr>
    </table>
</div>
		</td>
	</tr>
</table>

<a style="margin-left:1050px"><input type="submit" value="Grabar Matricula" class="buttonLogin" style="background-color:#a9d08e;"></a>










<div class="footerAll">
	<p> Jr. Cajahuaman 823 Urb. El Tr&eacute;bol, Los Olivos, Cercado de Lima</p>
	<p>Telefonos: (01) 5338177</p>
</div>
</body>
</html>