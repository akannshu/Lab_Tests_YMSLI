package com.test.customerapp.controller;


import java.util.Optional;

import com.test.customerapp.model.dao.Customer;
import com.test.customerapp.model.service.CustomerService;
import com.test.customerapp.model.service.CustomerServiceImpl;

public class CustomerController {

	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();

		
//		Customer customer1=new Customer("rahul", "delhi", "987873264", new Date(2010,12,13));	
//		Customer customer2=new Customer("raj", "chennai", "5645645656", new Date(2012,12,21));	
//		customerService.addCustomer(custome1r);
		// customerService.addCustomer(customer2);
		
		Optional<Customer> customer = customerService.getCustomerById(2);
		try {
		String customerName=customer.map(emp->emp.getName()).orElse("not found");
		System.out.println(customerName);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}