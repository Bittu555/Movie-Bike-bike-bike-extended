
package com.global.customer;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.global.movie.MyConnection2;


public class CustomerImpl {

	Scanner sc = new Scanner(System.in);

	public void addCustomer() throws SQLException {



		Connection connection = null;
		PreparedStatement ps = null;

		connection = MyConnection2.getConnection();

		

		String sql = "insert into Customer values (? ,?,?,?)";

		ps = connection.prepareStatement(sql);

		System.out.println("Enter customer id : ");
		int id = sc.nextInt();
		ps.setInt(1, id);

		System.out.println("Enter customer Name :");
		String fname = sc.next();
		ps.setString(2, fname);
		
		System.out.println("Enter customer age :");
		int age = sc.nextInt();
		ps.setInt(3, age);
		
		System.out.println("Enter customer address :");
		String address = sc.next();
		ps.setString(4, address);

		

		ps.execute();

		System.out.println("customer successfully added with customerId..." + id);

	}

	

	public void updateCustomer() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "Update Customer set customerName = ?  where customerId = ?";
		ps1 = connection.prepareStatement(sql1);
		System.out.println("Enter new customer Name :");
		String rev = sc.next();
		ps1.setString(1, rev);
		System.out.println("Enter customer id :");
		int id = sc.nextInt();
		ps1.setInt(2, id);


	 ps1.executeUpdate();




	}

	public void deleteCustomer() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "delete from Customer  where customerId = ?";
		ps1 = connection.prepareStatement(sql1);

		System.out.println("Enter customer id :");
		int id = sc.nextInt();
		ps1.setInt(1, id);


		ps1.executeUpdate();
		System.out.println("customer details successfully deleted with customerId..." + id);



	}

}