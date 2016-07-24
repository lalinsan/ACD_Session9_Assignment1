/*
* Student: Eduardo Aguirre
* Session 9
* Assignment 1
* Servlet that displays a Welcome Message when he User Name and Password are correct.
*/


package com.acadgild.controller;

//Import necessary Classes from the Java API library
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); //Displays when the Login credentials are correct
		out.println("<h2>Welcome to our App</h2>");
		out.println ("You have successful logged in"); 
		
	}

}
