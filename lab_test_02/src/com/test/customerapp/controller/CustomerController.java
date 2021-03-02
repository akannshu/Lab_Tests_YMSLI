package com.customerapp.controller;


import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import com.customerapp.model.entity.Customer;
import com.customerapp.model.service.CustomerService;
import com.customerapp.model.service.CustomerServiceImpl;

public class CustomerController {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();

		
//		Customer customer=new Customer("ankita", "delhi", "987654321", new Date(2012,02,23));	
//		customerService.addCustomer(customer);
//		Customer customer=new Customer("amit", "kapur", "990654321", new Date(2002,02,22));	
//		customerService.addCustomer(customer);
		
		Optional<Customer> customerOpt=customerService.getCustomerById(4);
		try {
		String customerName=customerOpt.map(emp->emp.getName()).orElse("name not found");
		System.out.println(customerName);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
