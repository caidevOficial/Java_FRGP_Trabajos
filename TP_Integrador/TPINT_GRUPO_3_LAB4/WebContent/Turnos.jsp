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
<title>Asignaci&oacute;n de turnos</title>
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
<h4>Turnos</h4>
<hr />
</div>
  <div class="row">
    <form class="col s12">
    
      <div class="row">
        <div class="input-field col s6">        
          <i class="material-icons prefix">account_box</i>
            <input placeholder="DNI"  type="text">
        </div>
        <div class = "col s6">
        </div>
      </div>
       <div class="row">
           <div class="input-field col s6">
    <select>
      <option value="" disabled selected>Elija su Especialidad</option>
      <option value="1">Cardiologo</option>
      <option value="2">Pediatra</option>
      <option value="3">Ginecologo</option>
      <option value="3">Odontologo</option>   
    </select>
    <label><i class="material-icons">local_hospital</i>Especialidad</label>
  </div>
   </div>
                       
<div class="row">
    <div class="input-field col s6">
    <select>
      <option value="" disabled selected>Seleccione un Medico</option>      
      <option value="1">Eclair</option>
      <option value="2">Jellybean</option>
      <option value="3">Lollipop</option>
      
    </select>
    <label >    <i class="material-icons">person</i>Medico</label>
  </div>
   </div>
   
   <div class="row">
    <div class="input-field col s6">
    <input  type="text" class="datepicker s6">
 </div>
  </div>
    
      
    </form>
  </div>
  <div class ="row">
		  <div class="input-field center-align ">
                <button class="btn waves-effect waves-light" type="submit" name="action">Asignar</button>
              </div>
  </div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	    <script type="text/javascript" src="~/js/materialize.min.js"></script>
	     <script>
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('select');
      var instances = M.FormSelect.init(elems);
    });
    
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('.datepicker');
        var options = {
          format: 'dd/mm/yyyy',
          autoClose: true
        };
        M.Datepicker.init(elems, options);
      });
  </script>
</body>
</html>