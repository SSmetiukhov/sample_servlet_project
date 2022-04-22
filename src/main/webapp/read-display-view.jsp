<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 04.11.2021
  Time: 01:57
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Read Display</title>
    <style>
        th, tr, td, table {
            border: 1px solid blue;
        }
    </style>
</head>

<body>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>phone<th>
        <th>salary</th>
        <th>desig</th>
    </tr>

    <c:forEach items="${key_list}" var="emp" >
        <tr>
            <td>${emp.id}</td><td>${emp.name}</td><td>${emp.email}</td><td>${emp.phone}</td><td>${emp.salary}</td><td>${emp.desig}</td>
        </tr>
    </c:forEach>
</table>

<a href="read-view.jsp"> back </a>

</body>
</html>
