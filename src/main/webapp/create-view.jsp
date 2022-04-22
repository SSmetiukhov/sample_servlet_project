<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 03.11.2021
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
Please enter the following details
<form action="create-servlet">
    Emp name:   <input type="text" name="name"><br>
    Emp id:     <input type="number" name="id"><br>
    Emp phone:  <input type="text" name="phone"><br>
    Emp email:  <input type="text" name="email"><br>
    Emp salary: <input type="number" name="salary"><br>
    Emp Desig:  <input type="text" name="desig"><br>

    <input type = "submit">
</form>
<a href="index.jsp"> Main Menu </a>
</body>
</html>
