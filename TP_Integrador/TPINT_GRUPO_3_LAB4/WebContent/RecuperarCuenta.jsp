<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    <style>
        .registro {
            width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #f1f1f1;
        }
        
        .registro h1 {
            font-size: 25px;
            margin-top: 30px;
            margin-bottom: 30px;
            text-align: center;
        }
        
        .registro table {
            width: 100%;
        }
        
        .registro label {
            display: inline-block;
            width: 180px;
            font-weight: bold;
        }
        
        .registro input[type="text"],
        .registro input[type="password"] {
            width: 200px;
            padding: 5px;
        }
        
        .registro input[type="submit"] {
            display: block;
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="registro">
        <form method="post" action="Login.jsp">
            <h1>Mi Cuenta</h1>
            <table>
                <tr>
                    <td><label>Nombre de Usuario:</label></td>
                    <td><input name="txtUser" type="user" size="20"></td>
                </tr>
                <tr>
                    <td><label>Nuevo Nombre de Usuario:</label></td>
                    <td><input name="txtUserNuevo" type="user" oninput="this.value = this.value.replace(/[^a-zA-Z0-9]/,'')" size="20"></td>
                </tr>
                <tr>
                    <td><label>Nueva Contraseña:</label></td>
                    <td><input type="password" name="txtPassNueva" placeholder="Password"></td>
                </tr>
                <tr>
                    <td><label>Confirmar Nueva Contraseña:</label></td>
                    <td><input type="password" name="txtPassNueva2" placeholder="Password"></td>
                </tr>
            </table>
            <input name="btnModificarUser" type="submit" value="Modificar Usuario">
        </form>
    </div>
</body>
</html>