<%//@page import="dao.Segurodao"%>
<%//@ page import="dao.Segurodao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Seguro</title>
</head>
<body>

<a href="Inicio.jsp">Inicio</a> <a href="AgregarSeguro.jsp">Agregar Seguro</a> <a href="ListarSeguros.jsp">Listar Seguros</a>

<form action="ServletSeguro" method="get">

<%
 
// Segurodao SDao = new Segurodao();
// int nuevoSeg = SDao.NuevoId();

%>

<%-- idSeguro <%=nuevoSeg %> <br> --%>
Descripcion <input type="text" name="Descrip"> <br>
Tipo Seguro <select name="Tipo"> <br>
			<option> Seguro de casas</option>
			
			</select>  <br>

Costo Contrataci�n <input type="text" name="CostoCont">  <br>
Costo max�mo Asegurado <input type="text" name="CostoAseg">  <br>
<input type="submit" name="BtnAgregarSeguro" value="Aceptar">
</form>

</body>
</html>