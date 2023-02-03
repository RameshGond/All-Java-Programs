package com.xworkz.jdbc.prepared;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actor {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {

			PreparedStatement statement = connection.prepareStatement(
					"insert into Actor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			statement.setInt(1, 10);
			statement.setString(2, "kajol");
			statement.setString(3, "female");
			statement.setInt(4, 1979);
			statement.setInt(5, 73);
			statement.setInt(6, 6);
			statement.setInt(7, 84);
			statement.setString(8, "danapur");
			statement.setBoolean(9, true);
			statement.setInt(10, 5);
			statement.setInt(11, 33);
			statement.setInt(12, 7);
			statement.setString(13, "lovly");
			statement.setString(14, "Pallakki");
			statement.setInt(15, 2009);
			statement.setInt(16, 6);
			statement.setInt(17, 10000000);
			statement.setInt(18, 100);
			statement.setBoolean(19, true);
			statement.setString(20, "Godhi Banna");
			statement.setInt(21, 5);
			statement.setInt(22, 10);
			statement.setInt(23, 6);
			statement.setBoolean(24, true);
			statement.setInt(25, 5);
			statement.setInt(26, 4);
			statement.setInt(27, 100);
			statement.setInt(28, 13);
			statement.setString(29, "Yes");
			statement.setString(30, "Hero");
			statement.setString(31, "KotthimiriSoppu");
			statement.setBoolean(32, true);
			statement.setString(33, "Degree");

			int rowAffected = statement.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
