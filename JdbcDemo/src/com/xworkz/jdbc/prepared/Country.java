package com.xworkz.jdbc.prepared;

import static com.xworkz.jdbc.constants.Jdbc_Property.SECRET;
import static com.xworkz.jdbc.constants.Jdbc_Property.URL;
import static com.xworkz.jdbc.constants.Jdbc_Property.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Country {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {

			PreparedStatement prepar = connection.prepareStatement(
					"insert into Country values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");
			prepar.setInt(1, 1);
			prepar.setString(2, "china");
			prepar.setString(3, "Keqiang");
			prepar.setInt(4, 38);
			prepar.setInt(5, 15007);
			prepar.setInt(6, 952136);
			prepar.setString(7, "Red Flag");
			prepar.setString(8, "Giant Panda");
			prepar.setString(9, "Red-Crow");
			prepar.setString(10, "Rasgulla");
			prepar.setString(11, "Dragen Fruit");
			prepar.setString(12, "Pumpkin");
			prepar.setString(13, "200000");
			prepar.setString(14, "125478");
			prepar.setInt(15, 5);
			prepar.setString(16, "Renminbi");
			prepar.setString(17, "Jai ho");
			prepar.setString(18, "English");
			prepar.setInt(19, 858796);
			prepar.setInt(20, 9896548);
			prepar.setInt(21, 385463);
			prepar.setInt(22, 01);
			prepar.setInt(23, 348796);
			prepar.setInt(24, 55789461);
			prepar.setString(25, "Cricket");
			prepar.setInt(26, 9894569);
			prepar.setInt(27, 8894561);
			prepar.setInt(28, 2789461);
			prepar.setInt(29, 7796549);
			prepar.setInt(30, 5879645);
			prepar.setInt(31, 357896);

			int rowAffected = prepar.executeUpdate();
			System.out.println(rowAffected);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
