package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM";
		String username = "root";
		String password = "xworkz@123";
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println(connection);

			String sql = "INSERT INTO Customer VALUES(2,'Adi','Saidpur','P.S','D.C','Alaska','USA',703263,811372809,23,3,90,'Black','AB+',7,'B-Com','adi.xworkz@gmail.com')";
			String sql2 = "INSERT INTO Customer VALUES(3,'Ritam','Gopaichak','Patna','Patna','Jharkhand','India',803214,621372809,27,5,60,'White','B+',4,'BSC','ritam.xworkz@gmail.com')";
			String sql3 = "INSERT INTO Customer VALUES(4,'Sweta','Tajnipur','Tajnipur','Danapur','Benglore','America',403219,955372809,29,4,75,'White','AB-',3,'B-Tech','sweta.xworkz@gmail.com')";
			String sql4 = "INSERT INTO Customer VALUES(5,'Shankar','Muhadipur','Bind','Belchhi','Odissa','India',603221,911372855,23,3,80,'Fair','O-',8,'B-Com','shankar.xworkz@gmail.com')";

			Statement statement = connection.createStatement();

			int ref = statement.executeUpdate(sql);
			int ref2 = statement.executeUpdate(sql2);
			int ref3 = statement.executeUpdate(sql3);
			int ref4 = statement.executeUpdate(sql4);

			System.out.println(ref);
			System.out.println(ref2);
			System.out.println(ref3);
			System.out.println(ref4);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
