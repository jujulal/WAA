package mum.lab;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Bibek on 10/30/2016.
 * URL for this homework '/logon'
 */
public class LogonServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Login Page</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<FORM method='POST' action='/logon'>");

            //out.println("<DIV>"+ request.getParameter("msg") +"</DIV>");

        out.println("UserName: <INPUT TYPE='text' name='username'><BR/>");
        out.println("Password: <INPUT TYPE='password' name='password'>");
        out.println("<INPUT TYPE='submit' VALUE='SUBMIT'>");
        out.println("</FORM>");
        out.println("<DIV>");
        out.println("</DIV>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Login Page</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        if(request.getParameter("username").equals("user") &&
                request.getParameter("password").equals("pass")) {
            out.println("Welcome User");
            out.println("<a href='/guessnumber'>GuessNumber</a>");

        } else {
            String msg = "Invalid username or password!";
            out.println("<DIV>" + msg + "</DIV>");
            out.println("<FORM method='POST' action='/logon'>");
            out.println("UserName: <INPUT TYPE='text' name='username'><BR/>");
            out.println("Password: <INPUT TYPE='password' name='password'>");
            out.println("<INPUT TYPE='submit' VALUE='SUBMIT'>");
            out.println("</FORM>");
        }
        out.println("<DIV>");
        out.println("</DIV>");
        out.println("</BODY>");
        out.println("</HTML>");
        out.close();
    }
}
