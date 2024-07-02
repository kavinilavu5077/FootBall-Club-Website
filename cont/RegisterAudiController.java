package com.cont;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterAudiController")
public class RegisterAudiController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username").trim();
        String age = request.getParameter("age").trim();
        String gender = request.getParameter("gender").trim();
        String place = request.getParameter("place").trim();
        String ageCategory = request.getParameter("ageCategory").trim();

        ArrayList<String> errors = new ArrayList<>();
        
        if(name == null || name.length() == 0) {
            errors.add("Enter correct username");
        }
        try {
            int ages = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            errors.add("Age should be a number");
        }
        if(gender == null || gender.length() == 0) {
            errors.add("Click option for gender");
        }
        if(place == null || place.length() == 0) {
            errors.add("Enter the place");
        }
        if(ageCategory == null || ageCategory.length() == 0) {
            errors.add("Click option for age category");
        }

        if (!errors.isEmpty()) {
            request.setAttribute("errors", errors);
            RequestDispatcher rd = request.getRequestDispatcher("RegisterAudiServlet"); // Assuming you are forwarding to register.jsp
            rd.forward(request, response);
        } else {
            
            RequestDispatcher rd = request.getRequestDispatcher("/success.html"); // Assuming you are forwarding to success.jsp
            rd.forward(request, response);
        }
    }
}

