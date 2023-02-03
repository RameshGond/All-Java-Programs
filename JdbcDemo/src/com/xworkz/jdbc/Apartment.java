package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Apartment {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM";
		String username = "root";
		String password = "xworkz@123";
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println(connection);

			String rat = "INSERT INTO Apartment VALUES(2,'Sri Ram','Bengaluru','BTM',25,5,129,5,275,10000,9113728064,2)";
			String rat2 = "INSERT INTO Apartment VALUES(3,'Sai','Patna','Danapur',27,6,130,7,275,15000,5113728068,1)";
			String rat3 = "INSERT INTO Apartment VALUES(4,'Ramesh','Orissa','BBSR',30,2,151,2,275,16000,9113728065,3)";
			String rat4 = "INSERT INTO Apartment VALUES(5,'Srinath','AP','Layout',15,4,161,1,275,11000,61137280645,4)";

			Statement statement = connection.createStatement();

			int ref = statement.executeUpdate(rat);
			int ref2 = statement.executeUpdate(rat2);
			int ref3 = statement.executeUpdate(rat3);
			int ref4 = statement.executeUpdate(rat4);

			System.out.println(ref);
			System.out.println(ref2);
			System.out.println(ref3);
			System.out.println(ref4);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
