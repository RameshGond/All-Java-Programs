package com.xworkz.jdbc.resultset;

import static com.xworkz.jdbc.constants.Jdbc_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IPLTeamNew {

	public static void main(String[] args) {
		String sql = "SELECT id,name,captainName,noOfPlayers,homeState FROM IPLTeam";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int ipl1 = result.getInt("id");
				String ipl2 = result.getString("name");
				String ipl3 = result.getString("captainName");
				int ipl4 = result.getInt("noOfPlayers");
				String ipl5 = result.getString("homeState");
				System.out.println(ipl1 + " " + ipl2 + " " + ipl3 + " " + ipl4 + " " + ipl5);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
