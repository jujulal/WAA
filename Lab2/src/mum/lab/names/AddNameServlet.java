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
        //PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        Person person = new Person(
                new Integer(request.getParameter("key")),
                request.getParameter("firstName"),
                request.getParameter("lastName")
        );
        personList.add(person);
        session.setAttribute("personList", personList);
        //response.sendRedirect("index.html");
        //doGet(request, response);
    }
}
