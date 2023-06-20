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
<title>Medico</title>
  <style>
    .custom-subheader {
      margin-top: 20px; /* Ajusta el valor seg�n necesites */
    }
  </style>
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
<h4>Medico</h4>
<hr />
</div>
  <div class="row">
    <form class="col s12">
      <div class="row">
        <div class="input-field col s6">
         <i class="material-icons prefix">person</i>
          <input placeholder="Nombre"  id="Nombre" type="text" class="validate">
        </div>
        <div class="input-field col s6">
         <i class="material-icons prefix">person</i>
          <input placeholder="Apellido" id="Apellido" type="text" class="validate">
        </div>
      </div>
      <div class="row">
        <div class="input-field col s6">        
          <i class="material-icons prefix">account_box</i>
            <input placeholder="DNI"  type="text">
        </div>
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
      
      
      
      <div>
       <div class="container col s12" >
    <span class="subheader left-align valign-wrapper" style=" margin-top: 20px;"><i class="material-icons">favorite</i>Elija Sexo: </span>
 	 </div>
      </div>
     <br>
     <br>
      <p>
      <label>
        <input name="group1" type="radio" class="with-gap" checked />
        <span>Masculino</span>
      </label>
    </p>
    <p>
      <label>
        <input name="group1" type="radio" class="with-gap"/>
        <span>Femenino</span>
      </label>
    </p>
    <p>
        <div class="input-field col s12">        
        <i class="material-icons prefix">home</i>
        <input placeholder="Domicilio"  type="text">
        </div>
                

         <div class="input-field col s6">
    <select>
      <option value="" disabled selected>Elija su Nacionalidad</option>
      <option value="1">Argentina</option>
      <option value="2">Peru</option>
      <option value="3">Bolivia</option>
       <option value="3">Brazil</option>
      
    </select>
    <label >    <i class="material-icons">map</i>Pa&iacute;s</label>
  </div>
  
    <div class="input-field col s6">
    <select>
      <option value="" disabled selected>Elija su provincia</option>
      <option value="1">Buenos Aires</option>
      <option value="2">Cordoba</option>
      <option value="3">Neuquen</option>
       <option value="4">Rio Negro</option>
      
    </select>
    <label><i class="material-icons">place</i>Provincias</label>
  </div>
        
          <div class="input-field col s6">
    <select>
      <option value="" disabled selected>Elija su Localidad</option>
      <option value="1">San Fernando</option>
      <option value="2">San Isidro</option>
      <option value="3">Olivos</option>
      <option value="4">Martinez</option>   
    </select>
    <label><i class="material-icons">place</i>Localidad</label>
  </div>
        
         <div class="row">
        <div class="input-field col s6">        
          <i class="material-icons prefix">phone</i>
            <input placeholder="Telefono"  type="text">
        </div>
      </div>
      
       <div class="row">
        <div class="input-field col s12">
          <input id="email" type="email" class="validate">
          <label >Email</label>
        </div>
      </div>
      
    </form>
  </div>
  <div class ="row">
		  <div class="input-field center-align ">
                <button class="btn waves-effect waves-light" type="submit" name="action">Agregar</button>
              </div>
  </div>
	 	
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	    <script type="text/javascript" src="~/js/materialize.min.js"></script>
	   <script>
    document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('select');
      var instances = M.FormSelect.init(elems);
    });
  </script>
</body>
</html>