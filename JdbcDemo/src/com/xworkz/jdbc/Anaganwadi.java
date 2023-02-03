package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Anaganwadi {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM";
		String username = "root";
		String password = "xworkz@123";
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("driver class added");

			String satya = "INSERT INTO Anaganwadi VALUES(5,'Bihar',18,0,'Subash')";
			Statement statement = connection.createStatement();
			int patel = statement.executeUpdate(satya);
			System.out.println(patel);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
