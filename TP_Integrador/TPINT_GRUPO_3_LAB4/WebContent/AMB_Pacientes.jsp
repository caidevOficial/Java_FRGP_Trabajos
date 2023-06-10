<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="GestionAdmin.jsp">Inicio</a> <a href="AsignacionTurnos.jsp">Asignacion Turnos</a> <a href="Listado_Pacientes.jsp">Listado Pacientes</a>
 <a href="Listado_Medicos.jsp">Listado Medicos</a>

<form action="">
	DNI <input type="text" name="DNI">  <br>
	
	Nombre <input type="text" name="Nombre">  <br>
	
	Apellido <input type="text" name="Apellido">  <br>
	
	Sexo <br>
				<input type="radio" name="Sexo" value="Masculino" > Masculino <br>
	  	 		<input type="radio" name="Sexo" value="Femenino"> Femenino <br>
		 
	Nacionalidad <select name="Nacionalidad">
				 <option> Argentina</option>
				 <option> Peru </option>
				 <option> Bolivia</option>
				 <option> Brazil</option>
				 </select>  <br>
				  
	Direccion <input type="text"  name="Direccion">  <br>
	
	Provincia <select name="Provincia" >
				 <option> Buenos Aires</option>
				 <option> Cordoba </option>
				 <option> Neuquen</option>
				 <option> Rio Negro</option>
				 </select>  <br>
				  
	Localidad <select name="Localidad">
				 <option> San Fernando</option>
				 <option> Tigre </option>
				 <option> San Isidro</option>
				 <option> Olivos</option>
				 <option> Martinez</option>
				 </select>  <br>
				 
	E-Mail <input type="text" name="Email"> <br>
	
	Telefono <input type="text" name="Telefono"> <br>
	 
	 <button> Agregar Paciente</button>
	</form>
</body>
</html>