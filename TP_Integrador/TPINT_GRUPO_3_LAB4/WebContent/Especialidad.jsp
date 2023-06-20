<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
     <style type="text/css">
	<jsp:include page="css/materialize.min.css"></jsp:include>
	</style>
      <link rel="stylesheet" href="~/css/materialize.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Especialidad</title>
</head>
<body>
 <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">Sistema de turnos</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="GestionAdmin.jsp"><i class="material-icons prefix">home</i></a></li>
        <li><a href="AMB_Pacientes.jsp"><i class="material-icons prefix">face</i></a></li>
        <li><a href="AMB_Medico.jsp"><i class="material-icons prefix">local_hospital</i></a></li>
        <li><a href="Login.jsp"><i class="material-icons prefix">exit_to_app</i></a></li>
      </ul>
    </div>
  </nav>
<div class="row">
  <div class="col s1"></div>
<h4>Especialidad</h4>
<hr />
</div>
<div class="row">
  <div>
     <form>
   <div ></div>
        <div class="input-field col s12">
            <i class="material-icons prefix">star_rate</i>
             <input placeholder="Descripci&oacute;n"  type="text">
           
            <div class="row">
                <div class="col s6 m6">
                    <button class="btn waves-effect waves-light orange accent-4" type="submit" name="action">
                        Guardar
                        <i class="material-icons right">send</i>
                    </button>
                </div>
                <div class="col s6 m6">
                    <a class="waves-effect waves-light btn grey darken-4"><i class="material-icons left">undo</i>Volver</a>
                </div>
            </div>
            </div>
            </form>
            </div>
            </div>
   <!--JavaScript at end of body for optimized loading-->
      <script type="text/javascript" src="~/js/materialize.min.js"></script>
</body>
</html>