package com.cont;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class AddPlayerController
 */
@WebServlet("/AddPlayerController")
@MultipartConfig(maxFileSize= 16177215)
public class AddPlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver="com.mysql.cj.jdbc.Driver";
	String url ="jdbc:mysql://127.0.0.1:3306/VSBfootball";
	String unm="root";
	String pwd ="rootroot";
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("Name");
		String a = request.getParameter("Age");
		int age = Integer.parseInt(a);
		Part fp = request.getPart("profile");
		InputStream istrm = null;
		if(fp!=null) {
			System.out.println(fp.getName());
			System.out.println(fp.getSize());
			System.out.println(fp.getContentType());
			istrm = fp.getInputStream();
		}Connection  con=null;
		String msg=null;
			
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con =DriverManager.getConnection(url,unm,pwd);
			String sql = "insert into playerdata(name, age, profile) values(?, ?, ?)";
		    PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,name);
			pst.setInt(2,age);
		if(istrm!=null)
		{
			pst.setBlob(3,istrm);
		}
		
		int res =pst.executeUpdate();
		if(res > 0) {
			msg = "Player data Upload successsfully";
		}con.close();
	}catch(SQLException s) {
		s.printStackTrace();
	}
	request.setAttribute("msg",msg);
	getServletContext().getRequestDispatcher("/Message.html").forward(request,response);
}
			
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
