package customer1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer1.dao.CustomerDao;
import customer1.dao.CustomerDaoImpl;
import customer1.model.Customer;



public class CustomerUpdateController extends HttpServlet {
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
		doProcess(request, response);
	}
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Customer customer=dao.findById(Integer.parseInt(request.getParameter("id")));
		customer.setFirstName(request.getParameter("fName"));
		customer.setLastName(request.getParameter("lName"));
		customer.setEmail(request.getParameter("email"));
		dao.update(customer);
		RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
		view.forward(request, response);
	}

}
