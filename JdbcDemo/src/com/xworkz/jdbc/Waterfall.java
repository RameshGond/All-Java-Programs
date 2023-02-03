package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Waterfall {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Xworkz_BTM";
		String username = "root";
		String password = "xworkz@123";
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("connection");

			String rt = "INSERT INTO Waterfall_Info VALUES(2,'Ggana_Chuki',100,'Bhatkal','Karnataka',8,6,259,200,9,5,'White','Sarabti River')";
			String rt2 = "INSERT INTO Waterfall_Info VALUES(3,'TK',150,'Bengaluru','Karnataka',8,6,300,200,9,1,'Red','Ganga River')";
			String rt3 = "INSERT INTO Waterfall_Info VALUES(4,'Megha',250,'Birur','Karnataka',8,6,600,200,9,3,'Black','Sarwasti River')";
			String rt4 = "INSERT INTO Waterfall_Info VALUES(5,'Jog',200,'Bhatkal','Karnataka',8,6,500,200,9,4,'Pink','Yamuna River')";

			Statement statement = connection.createStatement();

			int ref = statement.executeUpdate(rt);
			int ref2 = statement.executeUpdate(rt2);
			int ref3 = statement.executeUpdate(rt3);
			int ref4 = statement.executeUpdate(rt4);

			System.out.println(ref);
			System.out.println(ref2);
			System.out.println(ref3);
			System.out.println(ref4);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
