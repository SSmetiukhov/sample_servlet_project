<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 04.11.2021
  Time: 00:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Read</title>
</head>
<body>

<form action="read-servlet" id="form">
    <p id=form-prompt>READ SORT OPTIONS</p>
    <input type="radio" id="id" name="id" value="id">
    <label for="id">ID</label><br>
    <input type="radio" id="name" name="id" value="name">
    <label for="name">Name</label><br>
    <input type="radio" id="email" name="id" value="email">
    <label for="email">Email</label><br>
    <input type="radio" id="salary" name="id" value="salary">
    <label for="salary">Salary</label><br>
    <input type="radio" id="phone" name="id" value="phone">
    <label for="phone">phone</label><br>
    <input type="radio" id="desig" name="id" value="desig">
    <label for="desig">desig</label><br>
    <input type = "submit">
</form>

<a href="index.jsp"> Main Menu </a>
</body>
</html>
