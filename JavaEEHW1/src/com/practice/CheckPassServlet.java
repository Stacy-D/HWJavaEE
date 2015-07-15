package com.practice;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Stacy on 7/14/15.
 */
public class CheckPassServlet extends HttpServlet {
    private final static String LOGIN = "Super user";
    private final static String PASS = "veryStrongPassword";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        String wrLogin = request.getParameter("login");
        String wrPassword = request.getParameter("pass");
        if(LOGIN.equals(wrLogin) && PASS.equals(wrPassword)) {
            response.sendRedirect("/accepted");
        }
        else {
                response.getWriter().print("<head></head><body>Something went wrong</body>");
                response.getWriter().close();
        }

    }
}
