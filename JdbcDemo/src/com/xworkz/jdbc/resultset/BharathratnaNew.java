package com.xworkz.jdbc.resultset;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BharathratnaNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "SELECT id,name,president,yearOFBirth,placeOfBirth FROM BharathRatna";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int pipe1 = result.getInt("id");
				String pipe2 = result.getString("name");
				String pipe3 = result.getString("president");
				int pipe4 = result.getInt("yearOFBirth");
				String pipe5 = result.getString("placeOfBirth");
				System.out.println(pipe1 + " " + pipe2 + " " + pipe3 + " " + pipe4 + " " + pipe5);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
