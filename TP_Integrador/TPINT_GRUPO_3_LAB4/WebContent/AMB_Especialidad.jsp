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
<title>Listado de Especialidades</title>
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
<form action="">
<div class = "row">
<div class = "col s4"></div>
 <table class = "col s4">
        <thead>
          <tr>
              <th>Especialidad</th>
                   <th>Modificar</th>
                    <th>Eliminar</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Cardiologo</td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">edit</i></button></td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">delete</i></button></td>
          </tr>
          <tr>
            <td>Pediatra</td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">edit</i></button></td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">delete</i></button></td>
          </tr>
          <tr>
            <td>Ginecologo</td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">edit</i></button></td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">delete</i></button></td>
          </tr>
            <tr>
            <td>Odontologo</td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">edit</i></button></td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">delete</i></button></td>
          </tr>
        </tbody>
      </table>
</div>

</form>
</body>
</html>