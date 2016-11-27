package mum.lab.lab4.controller;

import mum.lab.lab4.model.Person;
import mum.lab.lab4.model.PersonDAO;
import sun.plugin.com.Dispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Bibek on 11/16/2016.
 */
public class NamesController extends HttpServlet {
    public PersonDAO personDAO;

    public void init(){
        personDAO = new PersonDAO();
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();
        session.setAttribute("personDAO", personDAO);

        request.getRequestDispatcher("showNames.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        HttpSession session = request.getSession(false);

        int x=Integer.parseInt(request.getParameter("key"));
        Person person = new Person(x,request.getParameter("firstName"),request.getParameter("lastName"));

       personDAO.add(person);
    }


}
