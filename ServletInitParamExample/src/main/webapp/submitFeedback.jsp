<%--
  Created by IntelliJ IDEA.
  User: smaurya
  Date: 23/03/23
  Time: 10:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Feedback Page</title>
  </head>
  <body>
    <h1>Submit your feedback</h1>
    <form action="FeedbackServlet" method="post">
        <textarea rows="5" name="feedbackParam"></textarea>
        <input type="submit" value="Submit Feedback"/>
    </form>
  </body>
</html>
