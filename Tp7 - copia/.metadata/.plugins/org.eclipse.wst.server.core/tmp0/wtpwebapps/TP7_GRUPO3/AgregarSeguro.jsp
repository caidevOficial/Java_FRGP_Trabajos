
<%@page import="dao.Segurodao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="ServletSeguro" method="get">

<%
 
	
// 	 int nuevoSeg = SDao.NuevoId();
	
	%>
	
	
<%-- 	idSeguro <%=nuevoSeg %> <br>  --%>
	Descripcion <input type="text" name="Descrip"> <br>
	Tipo Seguro <select name="Tipo"> <br>
				<option> Seguro de casas</option>
				
				</select>  <br>
	
	Costo Contratacion <input type="text" name="CostoCont">  <br>
	Costo maximo Asegurado <input type="text" name="CostoAseg">  <br>
	<input type="submit" name="BtnAgregarSeguro" value="Aceptar">
</form>


<%

 boolean SeAgrego = false;
 if(request.getAttribute("SeAgrego") != null)
 {  	 
	 SeAgrego = Boolean.parseBoolean(request.getAttribute("SeAgrego").toString());	 
  }

%>

<% 
	 if(SeAgrego==true)
	 
	 { %>
	 	Seguro agregado
	 
	 <% } %>

</body>
</html>