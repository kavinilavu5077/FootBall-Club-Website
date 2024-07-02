package com.cont;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MatchInfoController
 */
@WebServlet("/MatchInfoController")
public class MatchInfoController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private MatchDao matchDao;

    public MatchInfoController() {
        super();
        matchDao = new MatchDao();
    }

    // Handles GET requests to fetch and forward match information
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Match> matches = matchDao.getAllMatches(); // Fetch all matches from the database
        request.setAttribute("matches", matches); // Set matches as a request attribute
        RequestDispatcher rd = request.getRequestDispatcher("matchInfo.jsp"); // Forward to JSP
        rd.forward(request, response);
    }

    // Handles POST requests and delegates to doGet
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
