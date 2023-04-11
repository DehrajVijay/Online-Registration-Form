package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome!!</h2>");
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String select_course = request.getParameter("select_course");
		String cond = request.getParameter("condition");
		// we can also store the data in database with the help of JDBC.
		if (cond != null) {
			if (cond.equals("checked")) {
				out.print("<h2>Name :" + name + "</h2>");
				out.print("<h2>Password :" + password + "</h2>");
				out.print("<h2>Email :" + email + "</h2>");
				out.print("<h2>Gender:" + gender + "</h2>");
				out.print("<h2>Course :" + select_course + "</h2>");
			} else {

			}

		} else
			out.print("<h2>You did not accept the tearms and conditions.</h2>");
	}
}