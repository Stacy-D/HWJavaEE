<%--
  Created by IntelliJ IDEA.
  User: Stacy
  Date: 7/15/15
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import= "java.util.*"%>
<html>
<head>
    <title></title>
</head>
<body>
<p>
<h1 align="center">Movies to watch</h1>
<%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.print("<br>try: " + it.next());
  }
%>
</body>
</html>
