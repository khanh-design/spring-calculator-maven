<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/28/2025
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>calculator</h3>
<form action="/home/save" method="post">
  <input type="text" id="num1" name="num1" value="12"/><br>
  <input type="text" id="num2" name="num2" value="12"/><br><br>
  <input type="submit" name="action" value="add"/>
  <input type="submit" name="action" value="sub"/>
  <input type="submit" name="action" value="mul"/>
  <input type="submit" name="action" value="dev"/>
</form>
</body>
</html>
