package com.practice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Stacy on 7/14/15.
 */
public class AcceptedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        response.setContentType("text/html");
        response.getWriter().print("<head></head><body>Access granted </body>");
        response.getWriter().close();
    }
}
