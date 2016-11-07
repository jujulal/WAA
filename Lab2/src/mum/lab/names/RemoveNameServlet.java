package mum.lab.names;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Bibek on 11/7/2016.
 */
public class RemoveNameServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        List<Person> personList = (List<Person>)request.getSession().getAttribute("personList");
        boolean state = false;

        for(Person p: personList){
            String key = new String("" + p.getKey());
            if(key.equals(request.getParameter("keyDelete"))){
                personList.remove(p);
                out.print("Record deleted Successfully");
                state=true;
            }
        }

        if(state =false){ out.print("Record not found!");}

        session.setAttribute("personList", personList);
    }
}
