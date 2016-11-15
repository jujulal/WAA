<%--
  Created by IntelliJ IDEA.
  User: Bibek
  Date: 11/7/2016
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Lab 3 - WAA</title>
  </head>
  <body>
  <h2>Hello World</h2>

  <h3>Click Here for "<a href="guessanumber.jsp"> Guess a number.jsp</a>"</h3>

  <c:forEach var="i" begin="1" end="10">
    <h3><c:out value="${i}"/></h3>
  </c:forEach>
  </body>
</html>
