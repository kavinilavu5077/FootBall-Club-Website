package com.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterMatchServlet
 */
@WebServlet("/RegisterMatchServlet")
public class RegisterMatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Registration form</h2>");
		out.println("<div style='width: 50%; margin: 0 auto; padding: 20px; border: 1px solid #ccc; border-radius: 5px; background-color: #f9f9f9; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);'>");
		out.println("<form action='', method='post'><br>");
		out.println("<label for='username'>Name:</label>");
		out.println("<input name='username' type='text' style='padding: 8px; border: 1px solid #ccc; border-radius: 4px;'><br><br>");

		out.println("<label for='age'>Age:</label>");
		out.println("<input name='age' type='number' style='padding: 8px; border: 1px solid #ccc; border-radius: 4px;'><br><br>");

		out.println("<label for='place'>Place:</label>");
		out.println("<input name='place' type='text' style='padding: 8px; border: 1px solid #ccc; border-radius: 4px;'><br><br>");
		out.println("Gender: ");
        out.println("<input name='gender' type='radio' value='male'> Male ");
        out.println("<input name='gender' type='radio' value='female'> Female <br><br>");
        out.println("Age Category: <br><br>");
        out.println("<select name='ageCategory'><br><br>");
        out.println("<option value='below18'>Below 18</option>");
        out.println("<option value='above18'>Above 18</option>");
        out.println("<option value='below12'>Below 12</option>");
        out.println("<option value='above12'>Above 12</option>");
        out.println("</select><br><br>");
        out.println("<center/><input type='submit' value='Register'><br>");
        out.println("</div>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
