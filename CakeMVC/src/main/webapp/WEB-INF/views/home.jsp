<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Stacy
  Date: 3/25/16
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
Hello restaurant </br>
<c:forEach var="dish" items="${dishes}">
  ${dish.name} </br>
</c:forEach>

</body>
</html>
