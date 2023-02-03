package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Paying_Guest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM";
		String username = "root";
		String password = "xworkz@123";
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println(connection);

			String dog = "INSERT INTO Paying_Guest values ('Modi','Narendra','Modi','modi@gmail.com',201,9113728091,'Odipi',603215,'USA','Bihar',25,'PrimeMinister','Male',50006578,101,1)";
			String dog2 = "INSERT INTO Paying_Guest values ('Virat','Virat','Kohli','kohli@gmail.com',301,9113728092,'Gangotri',203216,'America','Bihar',25,'Player','Male',90006578,101,3)";
			String dog3 = "INSERT INTO Paying_Guest values ('Rohit','Rohit','Sharma','sharma@gmail.com',401,9113728000,'HSR',003214,'China','Bihar',25,'Cricketer','Male',70006578,101,3)";
			String dog4 = "INSERT INTO Paying_Guest values ('Dhoni','Mahendra','Dhoni','dhoni@gmail.com',501,9113728023,'BN',903217,'SA','Bihar',25,'Bowler','Male',70006578,101,1)";

			Statement statement = connection.createStatement();

			int ref = statement.executeUpdate(dog);
			int ref2 = statement.executeUpdate(dog2);
			int ref3 = statement.executeUpdate(dog3);
			int ref4 = statement.executeUpdate(dog4);

			System.out.println(ref);
			System.out.println(ref2);
			System.out.println(ref3);
			System.out.println(ref4);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
