<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 04.11.2021
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Condition</title>
</head>
<body>

<form action="delete-servlet">
    Where ${param.where}: <input type="text" name=${param.where}><br>
    <input type = "submit"><br>
</form>

<a href="index.jsp"> Main Menu </a>

</body>
</html>
