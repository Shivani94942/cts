package com.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/* private StringBuffer data; */

	@Override
	public void init() throws ServletException {

		super.init();
		/* data = new StringBuffer(); */
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(request.getParameter("productId") + "</br>");
		out.println(request.getParameter("productName") + "</br>");
		out.println(request.getParameter("productDescription") + "</br>");
		/*
		 * data.append(request.getParameter("productId").toString());
		 * data.append(request.getParameter("productName").toString());
		 * data.append(request.getParameter("productDescription").toString());
		 * out.println(data);
		 */

	}
}
