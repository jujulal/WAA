<%@ page import="mum.lab.lab4.model.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="mum.lab.lab4.model.PersonDAO" %><%--
  Created by IntelliJ IDEA.
  User: Bibek
  Date: 11/20/2016
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Name List</h1>

 <%
    List<Person> p = (List<Person>)((PersonDAO)session.getAttribute("personDAO")).getPersonList();
    if(p != null) {
        out.print("<table border='1' cellspacing='0' ><th>Key</th><th>First Name</th><th>Last Name</th>");
        for (Person person : p) {
            out.print("<tr><td>" + person.getKey() + "</td>");
            out.print("<td>" + person.getFirstName() + "</td>");
            out.print("<td>" + person.getLastName() + "</td></tr>");
        }
        out.print("</table>");
    }
%>

</body>
</html>
