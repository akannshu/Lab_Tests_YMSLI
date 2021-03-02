package com.customer.controller;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.dao.Customer;
import com.customer.dao.DataAccessException;
import com.customer.service.CustomerService;
import com.customer.service.CustomerServiceImpl;

public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService=new CustomerServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String dobString = request.getParameter("dob");

		SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");

		Date dob = null;
		try {
			dob = formate.parse(dobString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Customer customer = new Customer(name, address, mobile, dob);
		try{
			customer =customerService.addCustomer(customer);
		}catch(DataAccessException ex) {
			ex.printStackTrace();
		}
		request.setAttribute("customer", customer);

		
		response.sendRedirect("success.jsp");
		

	}

}