package com.xworkz.jdbc.resultset;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryNew {

	public static void main(String[] args) {
		String sql = "SELECT ID,Name,PM_Name,No_Of_State,Animal FROM Country";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int dog1 = result.getInt(1);
				String dog2 = result.getString("Name");
				String dog3 = result.getString("PM_Name");
				int dog4 = result.getInt("No_Of_State");
				String dog5 = result.getString("Animal");
				System.out.println(dog1 + " " + dog2 + " " + dog3 + " " + dog4 + " " + dog5);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
