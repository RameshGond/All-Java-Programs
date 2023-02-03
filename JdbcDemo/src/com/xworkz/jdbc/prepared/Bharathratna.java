package com.xworkz.jdbc.prepared;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bharathratna {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {

			PreparedStatement prepar = connection.prepareStatement(
					"insert into BharathRatna values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			prepar.setInt(1, 10);
			prepar.setString(2, "prathik");
			prepar.setString(3, "laxmi");
			prepar.setString(4, "radhe");
			prepar.setString(5, "nikhil");
			prepar.setString(6, "sumiya");
			prepar.setString(7, "BSC");
			prepar.setInt(8, 61);
			prepar.setInt(9, 60);
			prepar.setString(10, "Modi");
			prepar.setString(11, "Lion");
			prepar.setInt(12, 3);
			prepar.setInt(13, 22);
			prepar.setInt(14, 34);
			prepar.setInt(15, 45);
			prepar.setInt(16, 50);
			prepar.setInt(17, 62000);
			prepar.setInt(18, 599);
			prepar.setInt(19, 45);
			prepar.setInt(20, 80);
			prepar.setInt(21, 201);
			prepar.setInt(22, 999);
			prepar.setInt(23, 98);
			prepar.setInt(24, 8500);
			prepar.setInt(25, 1224);
			prepar.setInt(26, 400);
			prepar.setInt(27, 100000);
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
