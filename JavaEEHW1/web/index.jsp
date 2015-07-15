<%--
  Created by IntelliJ IDEA.
  User: Stacy
  Date: 7/14/15
  Time: 6:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Authorization</title>
  </head>
  <body>
<form action="/check" method="post">
  Login:    <input type="text" name="login"/>
  <br>
  Password: <input type="password" name="pass"/>
  <br>
  <input type="submit" value="Login to your account"/>
</form>
  </body>
</html>
