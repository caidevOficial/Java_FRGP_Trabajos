<%@page import="dao.TipoSeguroDao"%>
<%@page import="entidad.TipoSeguro"%>
<%@page import="entidad.Seguro"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Seguros</title>
</head>
<body>

<a href="Inicio.jsp">Inicio</a> <a href="AgregarSeguro.jsp">Agregar Seguro</a> <a href="ListarSeguros.jsp">Listar Seguros</a>



<%
	 TipoSeguroDao Tsdao = new TipoSeguroDao(); 
	 ArrayList<TipoSeguro> Tseguros = new ArrayList<TipoSeguro>();
	  
	 Tseguros = Tsdao.readAll();
	 
	%>
<form action="ServletSeguro">
	Tipo Seguro <select name="FiltroTipo">
				<option>Todos</option>
				<% for (TipoSeguro Ts : Tseguros) {%>
				 <option> <%= Ts.toString() %></option>
				 <%} %>
					</select> <input type="submit" name="BtnFiltrar" value="Filtrar"> <br>
					
					<% if(request.getAttribute("ListaSeguros") != null)
					{ 
					ArrayList<Seguro> ListaSeg = (ArrayList<Seguro>) request.getAttribute("ListaSeguros");
					if (ListaSeg.size() > 0)
						{
					%>
					<table border="1"> 
					<tr> <th>ID SEGURO</th> <th>DESCRIPCION SEGURO</th> <th>DESCRIPCION TIPO SEGURO</th> <th>COSTO CONTRATACION</th> <th>COSTO MAXIMO ASEGURADO</th> </tr>
					<% for (Seguro sg : ListaSeg){%> 
					<tr> <td> <%= sg.getId() %></td> <td><%= sg.getDescripcion() %></td> <td><%= Tsdao.BuscaDescripcion(sg.getTipo()) %></td> <td> <%= sg.getCosContra() %></td> <td><%= sg.getCosAseg() %></td> </tr>
					<%} %>
					</table>
					
					<%} }%>
</form>
</body>
</html>