package com.xworkz.jdbc.resultset;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieNew {

	public static void main(String[] args) {
		String sql = "SELECT id,name,actor,budget,music FROM Movie";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int love1 = result.getInt("id");
				String love2 = result.getString("name");
				String love3 = result.getString("actor");
				int love4 = result.getInt("budget");
				String love5 = result.getString("music");
				System.out.println(love1 + " " + love2 + " " + love3 + " " + love4 + " " + love5);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
