package com.customer.service;

import java.util.List;

import com.customer.dao.Customer;

public interface CustomerService {
	public List<Customer> allCustomers();

	public Customer addCustomer(Customer customer);
}