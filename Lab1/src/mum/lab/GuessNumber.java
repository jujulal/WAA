package mum.lab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * Created by Bibek on 11/1/2016.
 */
public class GuessNumber extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Guess a Number!</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<FORM method='POST' action='/guessnumber'>");
        out.println("Enter a Number: <INPUT TYPE='number' name='number'><BR/>");
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
        BigInteger randNumber;
        String tmpValue =  "" + Math.random();

        randNumber = new BigInteger(tmpValue.substring(tmpValue.indexOf('.')+1));

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Guess a Number!</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        BigInteger inputNumber = new BigInteger(request.getParameter("number"));
        if(randNumber.compareTo(inputNumber)==0){
            out.println("<h3>Correct, congratulations!</h3>");
        } else if(randNumber.compareTo(inputNumber)<0) {
            out.println("<h3>Too low, try again!</h3>");
        }else if(randNumber.compareTo(inputNumber)>0) {
            out.println("<h3>Too high, try again!</h3>");
        }
        out.println("<FORM method='POST' action='/guessnumber'>");
        out.println("Enter a Number: <INPUT TYPE='number' name='number'><BR/>");
        out.println("<INPUT TYPE='submit' VALUE='SUBMIT'>");
        out.println("</FORM>");
        out.println("<DIV>");
        out.println("</DIV>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
