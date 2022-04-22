<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>


<form action="routing-servlet" id="form">
    <p id=form-prompt>CRUD OPTIONS</p>
    <input type="radio" id="create" name="id" value=1>
    <label for="create">CREATE</label><br>
    <input type="radio" id="read" name="id" value=2>
    <label for="read">READ</label><br>
    <input type="radio" id="update" name="id" value=3>
    <label for="update">UPDATE</label><br>
    <input type="radio" id="delete" name="id" value="4">
    <label for="delete">DELETE</label><br>
    <input type = "submit">

</form>



</body>
</html>