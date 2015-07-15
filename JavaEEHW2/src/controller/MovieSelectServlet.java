package controller;

import module.MovieAdvisor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Stacy on 7/15/15.
 */
public class MovieSelectServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        String mood = request.getParameter("type");
        MovieAdvisor movieAdvisor = new MovieAdvisor();
        List result = movieAdvisor.getMovies(mood);
        request.setAttribute("styles",result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }
}
