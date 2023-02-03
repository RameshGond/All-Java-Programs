package com.xworkz.spring.dao.bbmpward;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.bbmpward.BBMPWardDTO;

@Component
public class BBMPWardDAOImpl implements BBMPWardDAO {
	@Autowired
	private DataSource dataSource;

	@Override
	public boolean save(BBMPWardDTO dto) {

		String sql = "INSERT INTO BBMPWard VALUES (?,?,?,?,?,?,?,?)";

		try (Connection connection = dataSource.getConnection()) {

			PreparedStatement prepare = connection.prepareStatement(sql);
			prepare.setInt(1, dto.getId());
			prepare.setInt(2, dto.getWardNo());
			prepare.setString(3, dto.getWardName());
			prepare.setString(4, dto.getCorporatorName());
			prepare.setString(5, dto.getMla());
			prepare.setDouble(6, dto.getBudget());
			prepare.setDouble(7, dto.getSpent());
			prepare.setDouble(8, dto.getRemaining());

			int row = prepare.executeUpdate();
			System.out.println(row);
			return row > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
