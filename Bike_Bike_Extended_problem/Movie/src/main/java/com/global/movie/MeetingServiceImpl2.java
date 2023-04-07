package com.global.movie;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MeetingServiceImpl2 {

	Scanner sc = new Scanner(System.in);

	public void addMovie() throws SQLException {



		Connection connection = null;
		PreparedStatement ps = null;

		connection = MyConnection2.getConnection();

		

		String sql = "insert into Movie values (? ,?,?,? ,?)";

		ps = connection.prepareStatement(sql);

		System.out.println("Enter Movie id : ");
		String id = sc.next();
		ps.setString(1, id);

		System.out.println("Enter Movie Name :");
		String fname = sc.next();
		ps.setString(2, fname);

		System.out.println("Enter Movie Lang :");
		String lname = sc.next();
		ps.setString(3, lname);

		System.out.println("Enter movie releasedIn :");
		int year = sc.nextInt();
		ps.setInt(4, year);

		System.out.println("Enter movie revenueInDollars :");
		Long pId = sc.nextLong();
		ps.setLong(5, pId);

		ps.execute();

		System.out.println("Movie successfully added with movieId..." + id);

	}

	public void getMovies() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "Select * from Movie where year >= ?";
		ps1 = connection.prepareStatement(sql1);
		System.out.println("Enter movie releasedIn :");
		int year = sc.nextInt();
		ps1.setInt(1, year);
		ResultSet r = ps1.executeQuery();
		List<Movie> movieList = new ArrayList<>();
		while (r.next()) {
			movieList.add(new Movie(r.getInt(1),r.getString(2),r.getString(3),r.getInt(4),r.getDouble(5)));

//			System.out.println("  " + r.getString(1) + " \t " + r.getString(2) + " \t " + r.getString(3) + " \t "
//					+ r.getInt(4) + " \t " + r.getLong(5));
		}
		System.out.println(movieList);

	}

	public void updateMovie() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "Update Movie set movieName = ?  where movieID = ?";
		ps1 = connection.prepareStatement(sql1);
		System.out.println("Enter new movie :");
		String rev = sc.next();
		ps1.setString(1, rev);
		System.out.println("Enter movie id :");
		String id = sc.next();
		ps1.setString(2, id);


	 ps1.executeUpdate();




	}

	public void delete() throws SQLException {

		Connection connection = null;
		PreparedStatement ps1 = null;

		connection = MyConnection2.getConnection();

		String sql1 = "delete from Movie  where movieId = ?";
		ps1 = connection.prepareStatement(sql1);

		System.out.println("Enter movie id :");
		String id = sc.next();
		ps1.setString(1, id);


		ps1.executeUpdate();



	}

}