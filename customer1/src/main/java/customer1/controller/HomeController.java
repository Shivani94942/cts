package customer1.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer1.dao.CustomerDao;
import customer1.dao.CustomerDaoImpl;
import customer1.model.Customer;


public class HomeController extends HttpServlet {
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
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
			List<Customer> customers = dao.getAllCustomers();
			request.setAttribute("customers", customers);
			RequestDispatcher view = request.getRequestDispatcher("list-customers.jsp");
			view.forward(request, response);
		
		}
	}