package com.global.serviceAdviser;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.global.Bike.Bike1;
import com.global.movie.MyConnection2;


public class ServiceImpl {

	Scanner sc = new Scanner(System.in);

	public void adviserInsert() throws SQLException {
/*
private int emp_id;
private String emp_name;
private String address;
private String phone;
private String email_id;
 */


		Connection connection = null;
		PreparedStatement ps = null;

		connection = MyConnection2.getConnection();

		

		String sql = "insert into ServiceAdviser values (? ,?,?,?,?)";

		ps = connection.prepareStatement(sql);

		System.out.println("Enter erviceAdviser id : ");
		int id = sc.nextInt();
		ps.setInt(1, id);

		System.out.println("Enter erviceAdviser name :");
		String fname = sc.next();
		ps.setString(2, fname);

		System.out.println("Enter address :");
		String seatNo = sc.next();
		ps.setString(3, seatNo);

		System.out.println("Enter phone  :");
		String amt = sc.next();
		ps.setString(4, amt);

		System.out.println("Enter email_id:");
		String pId = sc.next();
		ps.setString(5, pId);
		
		

		ps.execute();

		System.out.println("Book successfully added withservice Adviser with id : " + id);

	}

	public void adviserdetails() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "Select * from ServiceAdviser where emp_id >= ?";
		ps1 = connection.prepareStatement(sql1);
		System.out.println("Enter bike id :");
		int year = sc.nextInt();
		ps1.setInt(1, year);
		ResultSet r = ps1.executeQuery();
		List<ServiceAdviser> bikeList = new ArrayList<>();
		while (r.next()) {
			bikeList.add(new ServiceAdviser(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5)));

//			System.out.println("  " + r.getString(1) + " \t " + r.getString(2) + " \t " + r.getString(3) + " \t "
//					+ r.getInt(4) + " \t " + r.getLong(5));
		}
		System.out.println(bikeList);

	}

//	public void updateBike() throws SQLException {
//
//		Connection connection = null;
//		PreparedStatement ps1 = null;
//
//		connection = MyConnection2.getConnection();
//
//		String sql1 = "Update Bike set name = ?  where bike_id = ?";
//		ps1 = connection.prepareStatement(sql1);
//		System.out.println("Enter new name :");
//		String rev = sc.next();
//		ps1.setString(1, rev);
//		System.out.println("Enter bike id :");
//		int id = sc.nextInt();
//		ps1.setInt(2, id);
//
//
//	 ps1.executeUpdate();
//
//
//
//
//	}

//	public void deleteBike() throws SQLException {
//
//		Connection connection = null;
//		PreparedStatement ps1 = null;
//
//		connection = MyConnection2.getConnection();
//
//		String sql1 = "delete from Bike1  where bike_id = ?";
//		ps1 = connection.prepareStatement(sql1);
//
//		System.out.println("Enter bike id :");
//		int id = sc.nextInt();
//		ps1.setInt(1, id);
//
//
//		ps1.executeUpdate();
//		System.out.println("Book successfully detete with bike id : " + id);
//
//
//
//	}

}


