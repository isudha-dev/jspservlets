<%--
  Created by IntelliJ IDEA.
  User: smaurya
  Date: 24/03/23
  Time: 4:37 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <form action="httpServletRequestExample" method="post">
        <input type="text" name="userName" id="userName"/> <!-- name: getParameter, id: used in frontend to get the element -->
        <select name="countryName">
            <option>India</option>
            <option>Nepal</option>
        </select>
        <input type="submit" name="submit" value="Submit"/>

    </form>
  </body>
</html>
