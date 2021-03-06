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
 * Created by Bibek on 11/5/2016.
 */
public class AllNamesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        List<Person> personList = (List<Person>)request.getSession().getAttribute("personList");
        if(personList != null) {
            out.print("<table border='1' padding='0' margin='0'><th>Key</th><th>FirstName</th><th>LastName</th>");
            for (Person p : personList) {
                out.print("<tr><td>" + p.getKey() + "</td><td>" + p.getFirstName() + "</td><td>" + p.getLastName() + "</td></tr>");
            }
        } else{
            personList = new ArrayList<>();
        }
        HttpSession session = request.getSession();
        session.setAttribute("personList", personList);
    }
}
