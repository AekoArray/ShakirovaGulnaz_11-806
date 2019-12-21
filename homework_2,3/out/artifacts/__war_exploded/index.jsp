<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 25.09.2019
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sign in</title>
</head>
<body>
<form method="Post" action="handler.php">
  <p><strong>Логин:</strong>
    <input maxlength="25" size="40" name="login"></p>
  <p><strong>Пароль:</strong>
    <input type="password" maxlength="25" size="40" name="password"></p>
  <input type = "submit" value= "send">
</form>
</body>
</html>
