package com.dadon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = "Bonjour :)";
		request.setAttribute("variable", message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/dadon.jsp").forward(request,  response);
	}
}
