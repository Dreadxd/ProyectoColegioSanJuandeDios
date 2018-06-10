<%@page import="modelo.entidad.BeanSeccionLlenado"%>
<%@page import="modelo.entidad.BeanGradoLlenado"%>
<%@page import="modelo.entidad.BeanTipoCursoLlenado"%>
<%@page import="modelo.entidad.BeanCursoLlenado"%>
<%@page import="modelo.entidad.BeanDocente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.entidad.BeanNivelLlenado"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">

<title>Gestionar Carga Curricular</title>
</head>
<body style="background-color:#ffffff;">
<%
	ArrayList<BeanNivelLlenado> listaNivel= (ArrayList<BeanNivelLlenado>)request.getAttribute("listaNivel");
%>
<%
	ArrayList<BeanGradoLlenado> listaGrado= (ArrayList<BeanGradoLlenado>)request.getAttribute("listaGrado");
%>
<%
	ArrayList<BeanSeccionLlenado> listaSeccion= (ArrayList<BeanSeccionLlenado>)request.getAttribute("listaSeccion");
%>
<%
	ArrayList<BeanTipoCursoLlenado> listaTipoCurso= (ArrayList<BeanTipoCursoLlenado>)request.getAttribute("listaTipoCurso");
%>
<%
	ArrayList<BeanCursoLlenado> listaCurso= (ArrayList<BeanCursoLlenado>)request.getAttribute("listaCurso");
%>
<%
	ArrayList<BeanDocente> listaDocentes= (ArrayList<BeanDocente>)request.getAttribute("listaDocentes");
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
					<td><center><a id="textMenu">Gestionar Carga Curricular</a></center></td>
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
<form action="" method="post" name="gest">
<div>
<center>
	<table style="margin-top:10px">
		<tr>
			<td><a id="texto">Nivel :</a></td>
			<td>
				<SELECT NAME="selNivel" SIZE=1 style="width:120px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<%for(BeanNivelLlenado nivel: listaNivel){%>
						<option value="<%=nivel.getIdNivel() %>"><%= nivel.getNivel()%></option>
						<%} %>
				</SELECT>
			</td>
			<td><a id="texto" style="margin-left:30px;margin-right:20px">Tipo Curso :</a></td>
			<td><SELECT NAME="selTipoCurso" SIZE=1 style="width:120px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<%for(BeanTipoCursoLlenado tipoCurso: listaTipoCurso){%>
						<option value="<%=tipoCurso.getIdTipoCurso() %>"><%= tipoCurso.getTipoCurso()%></option>
						<%} %>
				</SELECT></td>
		</tr>
		<tr>
			<td><a id="texto">Grado :</a></td>
			<td>
				<SELECT NAME="selGrado" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<%for(BeanGradoLlenado grado: listaGrado){%>
						<option value="<%=grado.getIdgrado() %>"><%= grado.getGrado()%></option>
						<%} %> 
				</SELECT>
			</td>
			<td><a id="texto" style="margin-left:30px;margin-right:20px">Curso :</a></td>
			<td><SELECT NAME="selCurso" SIZE=1 style="width:120px;text-align:center;"> 
						<center>
						<OPTION>Seleccione</OPTION>
						<%for(BeanCursoLlenado curso: listaCurso){%>
						<option value="<%=curso.getIdCurso() %>"><%= curso.getCurso()%></option>
						<%} %> 
						</center>
				</SELECT></td>
			<td><td><a style="margin-left:30px"><input type="submit" value="Agregar" class="buttonLogin" style="background-color:#a9d08e;"></a></td></td>
		</tr>
		<tr>
			<td><a id="texto" style="margin-right:30px">Seccion :</a></td>
			<td><SELECT NAME="selSeccion" SIZE=1 style="width:100px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<%for(BeanSeccionLlenado seccion: listaSeccion){%>
						<option value="<%=seccion.getIdSecci() %>"><%= seccion.getSeccion()%></option>
						<%} %>
				</SELECT></td>
			<td><a id="texto" style="margin-left:30px;margin-right:20px">Docente :</a></td>
			<td><SELECT NAME="selDocente" SIZE=1 style="width:120px;text-align:center;">
						<OPTION>Seleccione</OPTION>
						<%for(BeanDocente docentes: listaDocentes){%>
						<option value="<%=docentes.getDniDocente() %>"><%= docentes.getNomDoc()+" "+docentes.getApeDoc()%></option>
						<%} %>
				</SELECT></td>
			<td><td><a style="margin-left:30px"><input type="submit" value="Actualizar" class="buttonLogin" style="background-color:#a9d08e;"></a></td></td>
		</tr>
	</table>
</center>
</div>
</form>

<img src="imagen/Eliminar.png" alt="" width="25" height="25" HSPACE="20" align="left" style="margin-right:450px">


<input type="submit" value="Imprimir" class="buttonLogin" style="margin-button:10px;background-color:#a9d08e;">
<div class="footerAll">
	<p> Jr. Cajahuaman 823 Urb. El Tr&eacute;bol, Los Olivos, Cercado de Lima</p>
	<p>Telefonos: (01) 5338177</p>
</div>
</body>
</html>