package com.global;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.global.Bike.BikeImpl;
import com.global.booking.BookingImpl;
import com.global.customer.CustomerImpl;
import com.global.movie.MeetingServiceImpl2;
import com.global.serviceAdviser.ServiceImpl;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(MovieApplication.class, args);
		
		Scanner scanner = new Scanner(System.in);
		 BikeImpl m = new BikeImpl();
		 ServiceImpl s=new ServiceImpl();
		
		System.out.println("Enter 1 to add bike");
		System.out.println("Enter 2 to get bike details");
		System.out.println("Enter 3 to update bike");
		System.out.println("Enter 4 to delete bike details");
		System.out.println("###########################");
		
		System.out.println("Enter 5 to ServiceAdviser Details");
		System.out.println("Enter 6 to get bike details having bike");
		
		

		while (true) {
			int take = scanner.nextInt();
			switch (take) {
				case 1:

					m.BikeInsert();
					break;
				case 2:

					m.getBikedetails();
					break;
				case 3:

					m.updateBike();
					break;
				case 4:

					m.deleteBike();
					break;
				
				case 5:

					s.adviserInsert();
					break;
				
				case 6:

					s.adviserdetails();
					break;
				
			}
			


		}
	}

}

/*
 
 MeetingServiceImpl2 m = new MeetingServiceImpl2();
		CustomerImpl cu=new CustomerImpl();
		BookingImpl book=new BookingImpl();
 
 System.out.println("enter 5 for add customer details");
		System.out.println("enter 6 for update customer details");
		System.out.println("enter 7 for delete customer details");
		System.out.println("###########################");
		System.out.println("enter 8 Booking details of customer ");
 */
