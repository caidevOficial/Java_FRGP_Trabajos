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
<title>Listado de Medicos</title>
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
 <table>
        <thead>
          <tr>
              <th>Nombre</th>
              <th>Apellido</th>
              <th>Especialidad</th>
                <th>Horario Desde</th>
                  <th>Horario Hasta</th>
                   <th>Modificar</th>
                    <th>Eliminar</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Alvin</td>
            <td>Eclair</td>
            <td>Cardiologo</td>
             <td>10 A.M</td>
              <td>18 P.M</td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">edit</i></button></td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">delete</i></button></td>
          </tr>
          <tr>
            <td>Alan</td>
                        <td>Jellybean</td>
             <td>Pediatra</td>
             <td>12 A.M</td>
              <td>20 P.M</td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">edit</i></button></td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">delete</i></button></td>
          </tr>
          <tr>
            <td>Jonathan</td>
            <td>Lollipop</td>
            <td>Ginecologo</td>
             <td>08 A.M</td>
              <td>16 P.M</td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">edit</i></button></td>
               <td> <button class="btn waves-effect waves-light" type="submit" name="action"><i class="material-icons prefix">delete</i></button></td>
          </tr>
        </tbody>
      </table>

</form>
</body>
</html>