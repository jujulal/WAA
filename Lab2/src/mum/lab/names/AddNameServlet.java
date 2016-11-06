package mum.lab.names;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bibek on 11/2/2016.
 */
public class AddNameServlet extends HttpServlet {

    List<Person> personList;
    public void init() {
     personList = new ArrayList<Person>();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<HTML><HEAD>");
        out.print("<TITLE>Lab2 - AddNameServlet</TITLE>");
        out.print("</HEAD><BODY>");
        out.print("<div><h3>List of Names</h3>");
        List<Person> personList = (List<Person>)request.getSession().getAttribute("personList");
        if(personList != null) {
            for (Person p : personList) {
                out.print("Key: " + p.getKey() + " FirstName: " + p.getFirstName() + " LastName: " + p.getLastName() + "<br>");
            }
        } else{
            personList = new ArrayList<>();
        }
        HttpSession session = request.getSession();
        session.setAttribute("personList", personList);
        out.print("</div>");
        out.print("<div><FORM method='post' action='/addName'>");
        out.print("Key: <INPUT type='text' name='key'> ");
        out.print("First Name: <INPUT type='text' name='firstName'> ");
        out.print("Last Name: <INPUT type='text' name='lastName'> ");
        out.print("<INPUT type='submit' name='submit' value='Add'> ");
        out.print("</FORM></div>");
        out.print("</BODY></HTML>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        Person person = new Person(
                new Integer(request.getParameter("key")),
                request.getParameter("firstName"),
                request.getParameter("lastName")
        );
        personList.add(person);
        session.setAttribute("personList", personList);

        doGet(request, response);
    }
}
