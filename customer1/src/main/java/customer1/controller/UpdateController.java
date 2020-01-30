package customer1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer1.dao.CustomerDao;
import customer1.dao.CustomerDaoImpl;
import customer1.model.Customer;


public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private CustomerDao dao;
	   

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		dao=new CustomerDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c=dao.findById(Integer.parseInt(request.getParameter("customerId")));
		request.setAttribute("customer", c);
		RequestDispatcher view=request.getRequestDispatcher("update-customer.jsp");
		view.forward(request, response);
	}


}
