package com.xworkz.ott.configuration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.configuration.dto.OttDTO;

@Component
public class OttDAOImpl implements OttDAO {
	
	@Autowired
	private DataSource dataSource;

	@Override
	public boolean save(OttDTO ottDto) {
		System.out.println("from OttDAOImpl");
		System.out.println(ottDto);
		
		String jdbc = "INSERT INTO OTT VALUE (?,?,?,?,?,?,?);";

		//try (Connection connection = dataSource.getConnection()) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_BTM_march_07", "root", "password")) {

			PreparedStatement preparedStatement = connection.prepareStatement(jdbc);

			preparedStatement.setString(1, ottDto.getOttName());
			preparedStatement.setString(2, ottDto.getRegion());
			preparedStatement.setString(3, ottDto.getSubscriptionPlan());
			preparedStatement.setInt(4, ottDto.getMembers());
			preparedStatement.setInt(5, ottDto.getSince());
			preparedStatement.setString(6, ottDto.getLanguage());
			preparedStatement.setBoolean(7, ottDto.isActive());

			int rowsAffected = preparedStatement.executeUpdate();

			return rowsAffected == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
