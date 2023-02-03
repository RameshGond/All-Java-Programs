 
package com.xworkz.flight_booking.dao.booking;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.xworkz.flight_booking.dto.booking.FlightBookingDTO;
import static com.xworkz.flight_booking.constants.JdbcProperties.*;

@Component
public class FlightBookingDAOImpl implements FlightBookingDAO {

	@Override
	public boolean save(FlightBookingDTO dto) {

		String sql = "INSERT INTO flightbooking value(?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getPassengerName());
			statement.setBoolean(3, dto.isInternational());
			statement.setString(4, dto.getPassportNo());
			statement.setString(5, dto.getAirline());
			statement.setString(6, dto.getBoarding());
			statement.setString(7, dto.getDestination());
			statement.setDouble(8, dto.getTicketPrice());
			statement.setDate(9, Date.valueOf(dto.getTravelDateAndTime().toLocalDate()));
			statement.setDouble(10, dto.getGstPercentage());
			statement.setDouble(11, dto.getTotalPrice());

			int row = statement.executeUpdate();
			System.out.println(row);
			return row > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
