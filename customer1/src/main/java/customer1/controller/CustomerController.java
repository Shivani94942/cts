package customer1.controller;

import java.io.IOException;

import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer1.dao.CustomerDao;
import customer1.dao.CustomerDaoImpl;
import customer1.model.Customer;



public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CustomerDao dao;
   
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao=new CustomerDaoImpl();
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		try {
			
		String str[]=UUID.randomUUID().toString().split("-");
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		Customer c=dao.createCustomer(new Customer(str[0],fName, lName, email));
		
		if(c!=null)
		{
				/*
				 * List<Customer> customers=dao.getAllCustomers();
				 * request.setAttribute("SUCCESS", customers);
				 */
			RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
			view.forward(request, response);
		}
			/*
			 * else { RequestDispatcher view=request.getRequestDispatcher("error.html");
			 * view.forward(request, response); }
			 */
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
