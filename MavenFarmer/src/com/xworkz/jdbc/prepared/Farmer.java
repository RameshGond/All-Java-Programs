package com.xworkz.jdbc.prepared;

import static com.xworkz.jdbc.constants.Farmer_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Farmer {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement("insert into Farmer values(?,?,?,?,?,?,?)");
			statement.setInt(1, 5);
			statement.setString(2, "Ranju");
			statement.setString(3, "Odisa");
			statement.setInt(4, 12000);
			statement.setString(5, "BBSR");
			statement.setInt(6, 7);
			statement.setString(7, "UK");

			int rowAffected = statement.executeUpdate();
			System.out.println(rowAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
