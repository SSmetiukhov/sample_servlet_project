<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 04.11.2021
  Time: 00:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>

<form action="update-view-insert.jsp" id="form">
    <p id=form-prompt>Select update tuple and condition tuple</p>
    <fieldset id="id">
        <input type="radio" id="idd" name="id" value="id">
        <label for="idd">ID</label><br>
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
    </fieldset>
    <fieldset id="where">
        <input type="radio" id="id1" name="where" value="id">
        <label for="id1">ID</label><br>
        <input type="radio" id="name1" name="where" value="name">
        <label for="name1">Name</label><br>
        <input type="radio" id="email1" name="where" value="email">
        <label for="email1">Email</label><br>
        <input type="radio" id="salary1" name="where" value="salary">
        <label for="salary1">Salary</label><br>
        <input type="radio" id="phone1" name="where" value="phone">
        <label for="phone1">phone</label><br>
        <input type="radio" id="desig1" name="where" value="desig">
        <label for="desig1">desig</label><br>
    </fieldset>
    <input type = "submit">
</form>

<a href="index.jsp"> Main Menu </a>

</body>
</html>
