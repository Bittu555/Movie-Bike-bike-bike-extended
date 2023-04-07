package com.global.Bike;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.global.movie.MyConnection2;


public class BikeImpl {

	Scanner sc = new Scanner(System.in);

	public void BikeInsert() throws SQLException {
/*
 	private int bike_id;
	private String name;
	private String email;
	private String address;
	private String mobile_num;
	private String date_service;
	private int emp_id;
 */


		Connection connection = null;
		PreparedStatement ps = null;

		connection = MyConnection2.getConnection();

		

		String sql = "insert into Bike1 values (? ,?,?,?,?,?,?)";

		ps = connection.prepareStatement(sql);

		System.out.println("Enter Bike id : ");
		int id = sc.nextInt();
		ps.setInt(1, id);

		System.out.println("Enter Bike name :");
		String fname = sc.next();
		ps.setString(2, fname);

		System.out.println("Enter Email :");
		String seatNo = sc.next();
		ps.setString(3, seatNo);

		System.out.println("Enter address  :");
		String amt = sc.next();
		ps.setString(4, amt);

		System.out.println("Enter Mobile No :");
		String pId = sc.next();
		ps.setString(5, pId);
		
		System.out.println("Enter date_service :");
		String d = sc.next();
		ps.setString(6, d);
		
		System.out.println("Enter emp id : ");
		int id1 = sc.nextInt();
		ps.setInt(7, id1);
		
		

		ps.execute();

		System.out.println("Book successfully added with bike id : " + id);

	}

	public void getBikedetails() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "Select * from Bike1 where bike_id = ?";
		ps1 = connection.prepareStatement(sql1);
		System.out.println("Enter bike dATE SERVICE:");
		int year = sc.nextInt();
		ps1.setInt(1, year);
		ResultSet r = ps1.executeQuery();
		List<Bike1> bikeList = new ArrayList<>();
		while (r.next()) {
			bikeList.add(new Bike1(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6),r.getInt(7)));

			//System.out.println(""+r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4)+" "+r.getString(5)+" "+r.getString(6)+" "+r.getInt(7));
		}
		System.out.println(bikeList);

	}

	public void updateBike() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "Update Bike set name = ?  where bike_id = ?";
		ps1 = connection.prepareStatement(sql1);
		System.out.println("Enter new name :");
		String rev = sc.next();
		ps1.setString(1, rev);
		System.out.println("Enter bike id :");
		int id = sc.nextInt();
		ps1.setInt(2, id);


	 ps1.executeUpdate();




	}

	public void deleteBike() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "delete from Bike1  where bike_id = ?";
		ps1 = connection.prepareStatement(sql1);

		System.out.println("Enter bike id :");
		int id = sc.nextInt();
		ps1.setInt(1, id);


		ps1.executeUpdate();
		System.out.println("Book successfully detete with bike id : " + id);



	}

}

