package com.cont;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name").trim();
		String a=request.getParameter("age").trim();
		String gender=request.getParameter("gender").trim();
		String address=request.getParameter("addr");
		
		
		
		int age=Integer.parseInt(a);
		ArrayList<String> list= new ArrayList<String>();
		if(name.length()==0)
			list.add("Enter value for namefield:");
		if(age<18)
			list.add("You are under age");
		if(gender==null)
			list.add("pls select gender");
		if(address.length()==0)
			list.add("Address field can't be empty");
		
		if(!list.isEmpty()) {
		    request.setAttribute("errors", list);
			RequestDispatcher rd=request.getRequestDispatcher("/Registration.jsp");
			rd.forward(request, response);}
			User u = new User(name, age , address);
			request.setAttribute("data", u);
			
			HttpSession session = request.getSession();
			session.setAttribute("data", u);
			
			Cookie ck = new Cookie("myck",name);
			response.addCookie(ck);
			//response.setAttribute("data",u);
			RequestDispatcher rd=request.getRequestDispatcher("/Success.jsp");
				rd.forward(request, response);
				//return;
			}
	
				
			}
		
	
