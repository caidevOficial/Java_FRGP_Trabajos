<%@page import="Entidad.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
       <!--<link type="text/css" rel="stylesheet" href="~/css/materialize.min.css"  media="screen,projection"/> -->
     <style type="text/css">
	<jsp:include page="css/materialize.min.css"></jsp:include>
	</style>
      <link rel="stylesheet" href="~/css/materialize.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<%
	if(request.getParameter("Exit")!= null)
	{
		request.getSession().removeAttribute("Usuario");
	}
%>
<form action="ServletUsuario" method="post">
<div class="container">
    <div class="row">
      <div class="col s12 m6 offset-m3">
        <div class="card">
          <div class="card-content">
            <span class="card-title">Inicio de Sesión</span>
            <form>
              <div class="input-field">
                <input id="User" type="text" placeholder="Usuario" class="validate" name="User">
              </div>
              <div class="input-field">
                <input id="password" type="password" placeholder="Contraseña" class="validate" name="password">
              </div>
              <div class="input-field">
                <button class="btn waves-effect waves-light" type="submit" name="btn_Login">Iniciar Sesión</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</form>

    <!--JavaScript at end of body for optimized loading-->
      <script type="text/javascript" src="~/js/materialize.min.js"></script>
</body>
</html>