
<%@page import="dao.Segurodao"%>
<%@page import="dao.TipoSeguroDao"%>
<%@page import="entidad.TipoSeguro"%>
<%@page import="java.util.ArrayList"%>
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
	
	 Segurodao SDao = new Segurodao();
	 int nuevoSeg = SDao.NuevoId();
	 
	 TipoSeguroDao Tsdao = new TipoSeguroDao(); 
	 ArrayList<TipoSeguro> Tseguros = new ArrayList<TipoSeguro>();
	  
	 Tseguros = Tsdao.readAll();
	
	%>
	
	
	idSeguro <%=nuevoSeg %> <br> 
	Descripcion <input type="text" name="Descrip"> <br>
	Tipo Seguro <select name="Tipo"><% for (TipoSeguro Ts : Tseguros) {%>
				 <option value="<%= Ts.getId() %>"> <%= Ts.toString() %></option>
				 <%} %>
					</select>  <br>
	Costo Contratación <input type="text" name="CostoCont" pattern="^[0-9]+(.[0-9]+)?$">  <br>
	Costo maxímo Asegurado <input type="text" name="CostoAseg" pattern="^[0-9]+(.[0-9]+)?$">  <br>
	<input type="submit" name="BtnAgregarSeguro" value="Aceptar">
</form>


<%

if(request.getAttribute("DatosIncorrecots") != null)
{%>
	Datos cargados incorrectamente. <br>
	Verifique que los costos sean numeros, y usar . en lugar de ,
<% }

	boolean SeAgregoSeguro = false;
	if(request.getAttribute("SeguroAgregado") != null)
	{
		
		SeAgregoSeguro = Boolean.parseBoolean(request.getAttribute("SeguroAgregado").toString());
		
	}

%>

<%
	
	if(SeAgregoSeguro == true)
	{%>
		
	Seguro Agregado
		
	<% } 
	%>

</body>
</html>