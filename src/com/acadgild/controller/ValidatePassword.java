/*
* Student: Eduardo Aguirre
* Session 9
* Assignment 1
* Servlet that gets the User Name and Password from the user.
* Validate the credentials User Name = John Password:Pirate
* If valid, call Welcome Servlet and displays a Welcome message 
* Else displays an error on the Login page
*/


package com.acadgild.controller;

//Import necessary Classes from the Java API library
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidatePassword
 */
@WebServlet("/ValidatePassword")
public class ValidatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName"); //Get and stores User Name
		String password = request.getParameter("password"); //Get and stores Password
		
		if(userName.equals("John")&& password.equals("Pirate")) //If User Name and Password are correct
		{
			RequestDispatcher reqdisp = request.getRequestDispatcher("Welcome"); //Dispatches Welcome Servlet
			reqdisp.forward(request, response);
		}
		else //If User Name and Password are incorrect
		{
			 out.println ("<font color='red'><b>You have entered an incorrect password</b></font>");
			 RequestDispatcher reqdisp = request.getRequestDispatcher("Login"); //Dispatches the Login Page
			 reqdisp.include(request, response); //Displays Error Message
			 
		}
		
	}

}
