
<% // <%@page import="com.mysql.cj.Session"%> 
<%@page import="Entidad.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
        <!--Import materialize.css-->
       <!--<link type="text/css" rel="stylesheet" href="~/css/materialize.min.css"  media="screen,projection"/> -->
        <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
     <style type="text/css">
	<jsp:include page="css/materialize.min.css"></jsp:include>
	</style>
      <link rel="stylesheet" href="~/css/materialize.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion</title>
</head>
<body>
<% Usuario user = (Usuario) session.getAttribute("Usuario"); %>

 <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">GESTION ADMINISTRACION</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
      	<li><%= user.toString() %></li>
        <li><a href="GestionAdmin.jsp"><i class="material-icons prefix">home</i></a></li>
        <li><a href="ServletPaciente?Listar" name="Listar"><i class="material-icons prefix">face</i></a></li>
        <li><a href="AMB_Medico.jsp"><i class="material-icons prefix">local_hospital</i></a></li>
        <form>
        <li><a href="Login.jsp" name="Exit" method="post"><i class="material-icons prefix">exit_to_app</i></a></li>
        </form>
      </ul>
    </div>
  </nav>
  
<div class="row">
    <div class="col s12 m4">
        <div class="card">
            <div class="card-image center orange ">
                <i class="material-icons large white-text">star_rate</i>
                <a class="btn-floating halfway-fab waves-effect waves-light red" href="Especialidad.jsp"><i class="material-icons">add</i></a>
            </div>
            <div class="card-content ">
                <span class="card-title">Especialidades: </span>
                <p>
                    Aqui podras dar de Alta las Especialidades, Modificarlas y Borrarlas.
                    A la espera de ser asignada a un Medico
                </p>
            </div>
            <div class="card-action blue-grey darken-3">
            <a href="ServletEspecialidad?Listar" name="Listar" >Ver Mas</a>

            </div>
        </div>
    </div>
    
       <div class="col s12 m4">
        <div class="card">
            <div class="card-image center blue darken-1">
                <i class="material-icons large white-text">face</i>
                <a class="btn-floating halfway-fab waves-effect waves-light red" href="Medico.jsp" ><i class="material-icons">add</i></a>
            </div>
            <div class="card-content ">
                <span class="card-title">Medicos: </span>
                <p>
                    Aqui podras dar de Alta nuevos Medicos, Modificarles sus datos y
                    Relacionarlos con sus Especialidad
                </p>
            </div>
            <div class="card-action blue-grey darken-3">
                <a href="AMB_Medico.jsp">Ver Mas</a>

            </div>
        </div>
    </div>
    
     <div class="col s12 m4">
        <div class="card">
            <div class="card-image center green accent-4">
                <i class="material-icons large white-text">assignment_ind</i>
                <a class="btn-floating halfway-fab waves-effect waves-light red" href="ServletGeneral?ListarPais" name="Listar"><i class="material-icons">add</i></a>
            </div>
            <div class="card-content ">
                <span class="card-title">Pacientes: </span>
                <p>
                    Aqui podras dar de Alta nuevos Pacientes, Modificarles sus datos y
                    Borrarlos de la Base de Datos
                </p>
            </div>
            <div class="card-action blue-grey darken-3">
                <a href="ServletPaciente?Listar" name="Listar">Ver Mas</a>

            </div>
        </div>
    </div>
    
     <div class="col s12 m4">
        <div class="card">
            <div class="card-image center brown accent-4">
                <i class="material-icons large white-text">alarm</i>
              
            </div>
            <div class="card-content ">
                <span class="card-title">Turnos: </span>
                <p>
                    Aqui podras visualizar, asignar nuevos turnos o eliminar 
                </p>
            </div>
            <div class="card-action blue-grey darken-3">
                <a href="Turnos.jsp">Asignar Turnos</a>

            </div>
        </div>
    </div>
    
</div><!-- row Principal -->
    
   <!--JavaScript at end of body for optimized loading-->
      <script type="text/javascript" src="~/js/materialize.min.js"></script>
</body>
</html>