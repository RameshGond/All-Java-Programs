package com.xworkz.jdbc.resultset;

import static com.xworkz.jdbc.constants.Jdbc_Property.SECRET;
import static com.xworkz.jdbc.constants.Jdbc_Property.URL;
import static com.xworkz.jdbc.constants.Jdbc_Property.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ActorNew {

	public static void main(String[] args) {

		String sql = "SELECT * FROM BharathRatna";
		try (Connection connect = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement prepare = connect.prepareStatement(sql);
			ResultSet result = prepare.executeQuery();
			while (result.next()) {
				int cat1 = result.getInt(1);
				String cat2 = result.getString(2);
				String cat3 = result.getString(3);
				String cat4 = result.getString(4);
				String cat5 = result.getString(5);
				String cat6 = result.getString(6);
				String cat7 = result.getString(7);
				String cat8 = result.getString(8);
				String cat9 = result.getString(9);
				String cat10 = result.getString(10);
				String cat11 = result.getString(11);
				int cat12 = result.getInt(12);
				int cat13 = result.getInt(13);
				String cat14 = result.getString(14);
				int cat15 = result.getInt(15);
				int cat16 = result.getInt(16);
				int cat17 = result.getInt(17);
				String cat18 = result.getString(18);
				String cat19 = result.getString(19);
				int cat20 = result.getInt(20);
				String cat21 = result.getString(21);
				String cat22 = result.getString(22);
				String cat23 = result.getString(23);
				String cat24 = result.getString(24);
				String cat25 = result.getString(25);
				String cat26 = result.getString(26);
				int cat27 = result.getInt(27);
				String cat28 = result.getString(28);
				int cat29 = result.getInt(29);
				int cat30 = result.getInt(30);
				int cat31 = result.getInt(31);
				String cat32 = result.getString(32);
				String cat33 = result.getString(33);

				System.out.println(cat1 + " " + cat2 + " " + cat3 + " " + cat4 + " " + cat5 + " " + cat6 + " " + cat7
						+ " " + cat8 + " " + cat9 + " " + cat10 + " " + cat11 + " " + cat12 + " " + cat13 + " " + cat14
						+ " " + cat15 + " " + cat16 + " " + cat17 + " " + cat18 + " " + cat19 + " " + cat20 + " "
						+ cat21 + " " + cat22 + " " + cat23 + " " + cat24 + " " + cat25 + " " + cat26 + " " + cat27
						+ " " + cat28 + " " + cat29 + " " + cat30 + " " + cat31 + " " + cat32 + " " + cat33);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
