<%--
  Created by IntelliJ IDEA.
  User: Bibek
  Date: 11/9/2016
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a number</title>
</head>
<body>
<a href="index.jsp">Home</a><br>
<h2>Guess a number</h2>
    <form action="randValuePage.jsp" method="get">
        Enter a guess number <input type="number" id="guessnumber" name="guessnumber">
        <input type="submit" id="btnGuess" name="btnGuess" value="Guess">
    </form>
</body>
</html>
