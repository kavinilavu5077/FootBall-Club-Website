package com.cont;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MatchInfoServlet
 */
@WebServlet("/MatchInfoServlet")
public class MatchInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private MatchDao matchDao;

    public MatchInfoServlet() {
        super();
        matchDao = new MatchDao();
    }

    // Handles GET requests to display match information
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        List<Match> matches = matchDao.getAllMatches(); // Fetch all matches from the database

        out.println("<html><body>");
        out.println("<h1>Match Information</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Title</th><th>Place</th><th>Date</th></tr>");

        // Display each match in the table
        for (Match match : matches) {
            out.println("<tr>");
            out.println("<td>" + match.getTitle() + "</td>");
            out.println("<td>" + match.getPlace() + "</td>");
            out.println("<td>" + match.getDate() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }

    // Handles POST requests to add new match information
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response); // Delegate POST to GET
    }
}
