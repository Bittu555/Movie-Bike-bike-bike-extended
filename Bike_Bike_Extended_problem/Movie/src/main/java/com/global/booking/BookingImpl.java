package com.global.booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.global.movie.MyConnection2;


public class BookingImpl {

	Scanner sc = new Scanner(System.in);

	public void Booking() throws SQLException {
/*
 private int bookingId;
private String booking_Date;
private int seatNo;
private float amt;
private int customerID;
private int movieID;
 */


		Connection connection = null;
		PreparedStatement ps = null;

		connection = MyConnection2.getConnection();

		

		String sql = "insert into Booking values (? ,?,?,?,?,?)";

		ps = connection.prepareStatement(sql);

		System.out.println("Enter Booking id : ");
		int id = sc.nextInt();
		ps.setInt(1, id);

		System.out.println("Enter Booking date :");
		String fname = sc.next();
		ps.setString(2, fname);

		System.out.println("Enter Seat number :");
		int seatNo = sc.nextInt();
		ps.setInt(3, seatNo);

		System.out.println("Enter amount  :");
		float amt = sc.nextInt();
		ps.setFloat(4, amt);

		System.out.println("Enter Customer id :");
		int pId = sc.nextInt();
		ps.setInt(5, pId);
		
		System.out.println("Enter Movie id :");
		int mId = sc.nextInt();
		ps.setInt(6, mId);

		ps.execute();

		System.out.println("Booking successfully with movie id : " + mId);

	}

//	public void getMovies() throws SQLException {
//
//		Connection connection = null;
//		PreparedStatement ps1 = null;
//
//		connection = MyConnection2.getConnection();
//
//		String sql1 = "Select * from Movie where releasedIn >= ?";
//		ps1 = connection.prepareStatement(sql1);
//		System.out.println("Enter movie releasedIn :");
//		int year = sc.nextInt();
//		ps1.setInt(1, year);
//		ResultSet r = ps1.executeQuery();
//		List<Movie> movieList = new ArrayList<>();
//		while (r.next()) {
//			movieList.add(new Movie(r.getString(1),r.getString(2),r.getString(3),r.getInt(4),r.getLong(5)));
//
////			System.out.println("  " + r.getString(1) + " \t " + r.getString(2) + " \t " + r.getString(3) + " \t "
////					+ r.getInt(4) + " \t " + r.getLong(5));
//		}
//		System.out.println(movieList);
//
//	}
//
//	public void updateRevenue() throws SQLException {
//
//		Connection connection = null;
//		PreparedStatement ps1 = null;
//
//		connection = MyConnection2.getConnection();
//
//		String sql1 = "Update booking set revenueInDollars = ?  where movieId = ?";
//		ps1 = connection.prepareStatement(sql1);
//		System.out.println("Enter new revenue :");
//		long rev = sc.nextLong();
//		ps1.setLong(1, rev);
//		System.out.println("Enter movie id :");
//		String id = sc.next();
//		ps1.setString(2, id);
//
//
//	 ps1.executeUpdate();
//
//
//
//
//	}
//
	public void deleteBooking() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "delete from Booking  where bookingId = ?";
		ps1 = connection.prepareStatement(sql1);

		System.out.println("Enter movie id :");
		int id = sc.nextInt();
		ps1.setInt(1, id);


		ps1.executeUpdate();



	}

}
