<%--
  Created by IntelliJ IDEA.
  User: Bibek
  Date: 11/9/2016
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Guess a number</title>
</head>
<body>
<%
    Integer num =new Integer(request.getParameter("guessnumber"));
    Integer gen = (int)(Math.random()*10);
    if( num.equals(gen)){
        out.print("<h3>Matched, Congratulation!</h3>");
        out.print("<div>Your guess number " + num + " mached with system!</div>");
    } else {
        out.print("<h3>Sorry, Try again!</h3>");
        out.print("<div>Your guess number: " + num + "<br>System generated number: " + gen);
    }

    out.print("<h3><a href='guessanumber.jsp'>Retry again </a></h3>");
%>

</body>
</html>