package com.xworkz.jdbc.resultset;

import static com.xworkz.jdbc.constants.Farmer_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FarmerNew1 {

	public static void main(String[] args) {
		String sql1 = "select ID,Name from farmer";
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connection.prepareStatement(sql1);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int love1 = result.getInt("ID");
				String love2 = result.getString("Name");

				System.out.println(love1 + " " + love2);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
