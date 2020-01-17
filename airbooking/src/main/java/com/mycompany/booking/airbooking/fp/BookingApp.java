package com.mycompany.booking.airbooking.fp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;





public class BookingApp {
		
		private static FlightService service;
		static {
			service = new FlightServiceImpl();
		}

		public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
			int choice = 0;
			String userId,password,flightNumber;
			int noofseats;
			List<Passenger> list = null;
			Passenger passenger = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("1. Book a flight");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				
				
				switch(choice)
				{
				case 1:
					System.out.println("enter user id :");
					userId = br.readLine().toString();			
					list = service.findById(userId);
					if(list.isEmpty())
					{
						System.out.println("No such user id found.");
						System.out.println("create the passenger id and password.");
						String arr[]=UUID.randomUUID().toString().split("-");
						System.out.println("the auto generated user id: "+arr[0]);
						System.out.println("create the password :");
						String passw=br.readLine().toString();
						Passenger passenger1=service.createPassenger(arr[0],passw);
						System.out.println("the passenger created"+passenger1);
						break;
						
					}
					else
					{
						System.out.println("user id found");
						System.out.println("enter your password :");
						String passw1=br.readLine().toString();
						if(service)
						
					}
				}
			}while(choice!=0);
		}
}