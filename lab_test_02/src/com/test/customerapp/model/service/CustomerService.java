package com.test.customerapp.model.service;
import java.util.Optional;

import com.test.customerapp.model.dao.Customer;
import com.test.customerapp.model.exceptions.DataAccessException;

public interface CustomerService {
	
	public void addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id) throws DataAccessException;
}
