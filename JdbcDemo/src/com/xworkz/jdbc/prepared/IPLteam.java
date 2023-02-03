package com.xworkz.jdbc.prepared;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IPLteam {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement pre = connection.prepareStatement(
					"insert into IPLteam values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			pre.setInt(1, 10);
			pre.setString(2, "DD");
			pre.setString(3, "sarswati");
			pre.setString(4, "pant");
			pre.setString(5, "nehra");
			pre.setString(6, "chopra");
			pre.setString(7, "cock");
			pre.setInt(8, 11);
			pre.setInt(9, 4);
			pre.setInt(10, 3);
			pre.setInt(11, 8);
			pre.setInt(12, 11);
			pre.setInt(13, 10);
			pre.setString(14, "Mumbai");
			pre.setString(15, "bang");
			pre.setString(16, "chinnaswami");
			pre.setInt(17, 100);
			pre.setString(18, "suhas");
			pre.setInt(19, 4);
			pre.setInt(20, 60);
			pre.setInt(21, 6);
			pre.setString(22, "twohundred");
			pre.setInt(23, 2);
			pre.setInt(24, 10);
			pre.setInt(25, 20);
			pre.setInt(26, 18);
			pre.setInt(27, 20);
			pre.setInt(28, 33);
			pre.setString(29, "threehndred");
			pre.setString(30, "four");
			pre.setString(31, "five");
			pre.setInt(32, 40);
			pre.setInt(33, 500);

			int rowAffected = pre.executeUpdate();
			System.out.println(rowAffected);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
