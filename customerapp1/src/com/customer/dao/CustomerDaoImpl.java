package com.customer.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	public CustomerDaoImpl() {
		this.connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Customer> allCustomers() {

		List<Customer> customers = new ArrayList<>();
		try {
			PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM product");
			pstmt.executeQuery();

			ResultSet rs = pstmt.getResultSet();

			while (rs.next()) {
				int id = rs.getInt("id");
				String customer_name = rs.getString("name");
				String address = rs.getString("address");
				String phone = rs.getString("phone_number");
				Date dob = rs.getDate("dob");

				Customer c = new Customer(id, customer_name, address, phone, dob);

				customers.add(c);
			}

		} catch (SQLException ex) {
			throw new DataAccessException(ex.toString());
		}

		return customers;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(
					"insert into customer(name, address, mobile, email, dob) values(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhoneNumber());
			pstmt.setDate(5, new java.sql.Date(customer.getDob().getTime()));

			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				customer.setId(rs.getInt(1));
			}

		} catch (SQLException ex) {
			throw new DataAccessException(ex.getCause().toString());
		}

		return customer;
	}

}