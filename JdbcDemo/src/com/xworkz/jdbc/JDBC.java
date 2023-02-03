package com.xworkz.jdbc;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {

		String driverClassName = "com.mysql.cj.jdbc.Driver";
		try {
			System.out.println(Inet4Address.getLocalHost().getHostAddress());
			Class.forName(driverClassName);
			System.out.println("diver class name");
			String url = "jdbc:mysql://localhost:3306";
			String username = "root";
			String password = "xworkz@123";
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
