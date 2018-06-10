<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">

<title>Registrar Archivo Telecredito</title>
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
					<td><center><a id="textMenu">Registrar Archivo Telecredito</a></center></td>
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

<div>
<center>
	<table style="margin-top:10px">
		<tr>
			<td><a id="texto">Fecha :</a></td>
			<td><a Style="color:black"><script type="text/javascript">
				var d = new Date();
				document.write(''+d.getDate(),'/'+(1+d.getMonth()),'/'+d.getFullYear());
				</script></a>
			</td>
			<td></td>
		</tr>
		<tr>
			<td><a id="texto">Banco :</a></td>
			<td><SELECT NAME="selCombo" SIZE=1> 
						<OPTION>Banco de Credito</OPTION> 
				</SELECT>
			</td>
			<td></td>
		</tr>
		<tr>
			<td><a id="texto" style="margin-right:30px">Archivo de Pagos :</a></td>
			<td><input id="input-id" type="file" class="file" data-preview-file-type="text"  accept=".txt" style="width: 420px;border: 1px solid; "></td>
			<td><input type="submit" value="Cargar" class="buttonLogin" style="background-color:#a9d08e;"></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td><input type="submit" value="Procesar" class="buttonLogin" style="background-color:#a9d08e;"></td>
		</tr>
	</table>
</center>
</div>




<div class="footerAll">
	<p> Jr. Cajahuaman 823 Urb. El Tr&eacute;bol, Los Olivos, Cercado de Lima</p>
	<p>Telefonos: (01) 5338177</p>
</div>
</body>
</html>