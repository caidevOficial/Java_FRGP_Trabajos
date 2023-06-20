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

<form action="">
<div class="container">
    <div class="row">
      <div class="col s12 m6 offset-m3">
        <div class="card">
          <div class="card-content">
            <span class="card-title">Inicio de Sesi&oacute;n</span>
            <form>
              <div class="input-field">
                <input id="User" type="text" class="validate">
                <label for="email">Usuario</label>
              </div>
              <div class="input-field">
                <input id="password" type="password" class="validate">
                <label for="password">Contrase�a</label>
              </div>
              <div class="input-field">
                <button class="btn waves-effect waves-light" type="submit" name="action">Iniciar Sesi&oacute;n</button>
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