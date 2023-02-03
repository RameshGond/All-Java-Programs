package com.xworkz.jdbc.prepared;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Movie {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {

			PreparedStatement prepar = connection.prepareStatement(
					"insert into Movie values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepar.setInt(1, 10);
			prepar.setString(2, "F & F");
			prepar.setString(3, "arjun");
			prepar.setString(4, "rachita");
			prepar.setString(5, "nahesh");
			prepar.setString(6, "English");
			prepar.setString(7, "yappi");
			prepar.setInt(8, 61);
			prepar.setInt(9, 60);
			prepar.setString(10, "Modi");
			prepar.setString(11, "Loin");
			prepar.setString(12, "Lilly");
			prepar.setInt(13, 22);
			prepar.setInt(14, 54);
			prepar.setInt(15, 45);
			prepar.setInt(16, 50);
			prepar.setInt(17, 262000);
			prepar.setInt(18, 599);
			prepar.setInt(19, 15);
			prepar.setInt(20, 80);
			prepar.setInt(21, 201);
			prepar.setInt(22, 999);
			prepar.setInt(23, 88);
			prepar.setInt(24, 7500);
			prepar.setInt(25, 1224);
			prepar.setInt(26, 400);
			prepar.setInt(27, 200000);
			prepar.setInt(28, 32);
			prepar.setInt(29, 6500);
			prepar.setInt(30, 80);
			prepar.setInt(31, 10000000);
			prepar.setString(32, "Rupes");
			prepar.setInt(33, 399);

			int rowAffected = prepar.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
