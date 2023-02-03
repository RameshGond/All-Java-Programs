package com.xworkz.gadget.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.gadget.constants.JdbcProperties.*;

import com.xworkz.gadget.dto.GadgetDTO;

public class GadgetDAOImpl implements GadgetDAO {

	@Override
	public boolean save(GadgetDTO dto) {

		String sql = "insert  into gadget values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue())){
			
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, dto.getId());
			preparedstatement.setString(2, dto.getName());
			preparedstatement.setString(3, dto.getType());
			preparedstatement.setDouble(4, dto.getPrice());
			preparedstatement.setString(5, dto.getManufacturer());
			preparedstatement.setDate(6, Date.valueOf(dto.getManufactureDate()));
			preparedstatement.setInt(7, dto.getWarrantyPeriod());
			preparedstatement.setInt(8, dto.getRating());
			preparedstatement.setBoolean(9, dto.getIsi());
			preparedstatement.setInt(10, dto.getSerialNo());
			preparedstatement.setString(11, dto.getCreatedBy());
			preparedstatement.setDate(12, Date.valueOf(dto.getCreatedDate()));
			preparedstatement.setString(13, dto.getUpdatedBy());
			preparedstatement.setDate(14, Date.valueOf(dto.getUpdatedDate()));

			int row = preparedstatement.executeUpdate();
			System.out.println(row);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public GadgetDTO findById(int id) {
		String sql = "select * from gadget where id=?";
		
		try(Connection connection=DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue())){
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet result = preparedStatement.executeQuery();
			while (result.next()) {
				GadgetDTO dto = new GadgetDTO();
				dto.setId(result.getInt(1));
				dto.setName(result.getString(2));
				dto.setType(result.getString(3));
				dto.setPrice(result.getDouble(4));
				dto.setManufacturer(result.getString(5));
				Date manDate = result.getDate(6);
				dto.setManufactureDate(manDate.toLocalDate());
				dto.setWarrantyPeriod(result.getInt(7));
				dto.setRating(result.getInt(8));
				dto.setIsi(result.getBoolean(9));
				dto.setSerialNo(result.getInt(10));
				dto.setCreatedBy(result.getString(11));
				Date createdDate = result.getDate(12);
				dto.setCreatedDate(createdDate.toLocalDate());
				dto.setUpdatedBy(result.getString(13));
				Date updatedDate = result.getDate(14);
				dto.setUpdatedDate(updatedDate.toLocalDate());

				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
