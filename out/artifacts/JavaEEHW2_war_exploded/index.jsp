<%--
  Created by IntelliJ IDEA.
  User: Stacy
  Date: 7/15/15
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Movie advisor</title>
  </head>
  <body>
  <form method="POST" action="SelectMovie.do">
  Chose your mood today <br>
  Categories:
  <select name="type" size = 1>
    <option value="depressing">Depressing</option>
    <option value="romantic">Romantic</option>
    <option value="challenging">Challenging</option>
    <option value="happy">Happy</option>
  </select>
    <br>
    <center>
      <input type="Submit">
    </center>
  </form>
  </body>
</html>
