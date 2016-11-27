package mum.lab.lab4.controller;

import mum.lab.lab4.model.Person;
import mum.lab.lab4.model.PersonDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Bibek on 11/27/2016.
 */
public class DeleteController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession(false);

        PersonDAO personDAO = (PersonDAO) session.getAttribute("personDAO");

        personDAO.delete(request.getParameter("key"));

    }

}
