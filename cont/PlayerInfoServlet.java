package com.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PlayerInfoServlet
 */
@WebServlet("/PlayerInfoServlet")

public class PlayerInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		  out.println("<html>");
		    out.println("<body>");
			out.println("<h2> Enter your Information</h2>");
			out.println("<form action='AddPlayerController' method='post' enctype='multipart/form-data'>");
			out.println("Name <input type='text' name='Name'> <br> <br>");
			out.println("Age <input type='text' name='Age'> <br> <br>");
			out.println("File <input type='file' name='profile'> <br> <br>");
			//out.println("Gender <input type='gender' name='gender'> <br> <br>");
			out.println("<input type='submit' value='Submit'>");
			out.println("</form> ");
			out.println("</body> </html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
