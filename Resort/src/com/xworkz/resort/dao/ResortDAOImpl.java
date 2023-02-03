package com.xworkz.resort.dao;

import static com.xworkz.resort.constants.JdbcProperties.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	@Override
	public boolean save(ResortDTO dto) {
		String sql = "INSERT INTO resort VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			System.out.println(connection);

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getOwnerName());
			statement.setString(4, dto.getLocation());
			statement.setDouble(5, dto.getPrice());
			statement.setDouble(6, dto.getRating());
			statement.setTime(7, Time.valueOf(dto.getCheckInTime()));
			statement.setTime(8, Time.valueOf(dto.getCheckOutTime()));
			statement.setInt(9, dto.getNoOfCooks());
			statement.setString(10, dto.getReceptionistName());
			statement.setInt(11, dto.getCottages());
			statement.setInt(12, dto.getSecurityGuards());
			statement.setBoolean(13, dto.getSwimmingPool());
			statement.setInt(14, dto.getNoOfCCTV());
			statement.setInt(15, dto.getNoOfDogs());
			statement.setInt(16, dto.getNoOfJeeps());
			statement.setInt(17, dto.getNoOfBikes());
			statement.setBoolean(18, dto.getOnlineBooking());
			statement.setString(19, dto.getState());
			statement.setString(20, dto.getCountry());
			statement.setDouble(21, dto.getInvestment());
			statement.setInt(22, dto.getNoOfInvesters());
			statement.setDouble(23, dto.getNetWorth());
			statement.setBoolean(24, dto.getInternet());
			statement.setInt(25, dto.getTotalArea());
			statement.setInt(26, dto.getNoOfTrees());
			statement.setBoolean(27, dto.getBarCounter());
			statement.setBoolean(28, dto.getVegFood());
			statement.setBoolean(29, dto.getNonVegFood());
			statement.setString(30, dto.getTreeName());
			statement.setInt(31, dto.getNoOfActivities());
			statement.setBoolean(32, dto.getIndoorActivities());
			statement.setBoolean(33, dto.getOutdoorActivities());
			statement.setString(34, dto.getActivitiesName());
			statement.setString(35, dto.getGstNo());
			statement.setBoolean(36, dto.getAcRooms());
			statement.setBoolean(37, dto.getFireChamp());
			statement.setBoolean(38, dto.getAdvanceBooking());
			statement.setBoolean(39, dto.getBookingCanclled());
			statement.setDate(40, Date.valueOf(dto.getCreateDate()));
			statement.setString(41, dto.getCreateBy());
			statement.setDate(42, Date.valueOf(dto.getUpdateDate()));
			statement.setString(43, dto.getUpdatedBy());

			int row = statement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updatePriceByName(String name, double price) {
		String sql = "update resort set price=? where name=?";
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, price);
			statement.setString(2, name);
			int row = statement.executeUpdate();
			System.out.println(row);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatePriceAndRatingByName(String name, int rating, double price) {
		String sql = "update resort set price =?,rating=? where name=?";
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, price);
			statement.setDouble(2, rating);
			statement.setString(3, name);

			int row = statement.executeUpdate();
			System.out.println(row);

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void updateReceptionistNameById(String receptionistName, int id) {
		String sql = "update resort set receptionistName =? where id=?";
		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, receptionistName);
			statement.setInt(2, id);
			int row = statement.executeUpdate();
			System.out.println(row);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResortDTO getById(int id) {
		String sql = "select * from resort where id=?";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				ResortDTO dto = new ResortDTO();
				extracted(resultSet, dto);

				return dto;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void extracted(ResultSet resultSet, ResortDTO dto) throws SQLException {
		dto.setId(resultSet.getInt(1));
		dto.setName(resultSet.getString(2));
		dto.setOwnerName(resultSet.getString(3));
		dto.setLocation(resultSet.getString(4));
		dto.setPrice(resultSet.getDouble(5));
		dto.setRating(resultSet.getInt(6));

		Time checkInTime = resultSet.getTime(7);
		dto.setCheckInTime(checkInTime.toLocalTime());
		Time checkOutTime = resultSet.getTime(8);
		dto.setCheckOutTime(checkOutTime.toLocalTime());

		dto.setNoOfCooks(resultSet.getInt(9));
		dto.setReceptionistName(resultSet.getString(10));
		dto.setCottages(resultSet.getInt(11));
		dto.setSecurityGuards(resultSet.getInt(12));
		dto.setSwimmingPool(resultSet.getBoolean(13));
		dto.setNoOfCCTV(resultSet.getInt(14));
		dto.setNoOfDogs(resultSet.getInt(15));
		dto.setNoOfJeeps(resultSet.getInt(16));
		dto.setNoOfBikes(resultSet.getInt(17));
		dto.setOnlineBooking(resultSet.getBoolean(18));
		dto.setState(resultSet.getString(19));
		dto.setCountry(resultSet.getString(20));
		dto.setInvestment(resultSet.getDouble(21));
		dto.setNoOfInvesters(resultSet.getInt(22));
		dto.setNetWorth(resultSet.getDouble(23));
		dto.setInternet(resultSet.getBoolean(24));
		dto.setTotalArea(resultSet.getInt(25));
		dto.setNoOfTrees(resultSet.getInt(26));
		dto.setBarCounter(resultSet.getBoolean(27));
		dto.setVegFood(resultSet.getBoolean(28));
		dto.setNonVegFood(resultSet.getBoolean(29));
		dto.setTreeName(resultSet.getString(30));
		dto.setNoOfActivities(resultSet.getInt(31));
		dto.setIndoorActivities(resultSet.getBoolean(32));
		dto.setOutdoorActivities(resultSet.getBoolean(33));
		dto.setActivitiesName(resultSet.getString(34));
		dto.setGstNo(resultSet.getString(35));
		dto.setAcRooms(resultSet.getBoolean(36));
		dto.setFireChamp(resultSet.getBoolean(37));
		dto.setAdvanceBooking(resultSet.getBoolean(38));
		dto.setBookingCanclled(resultSet.getBoolean(39));

		Date createDate = resultSet.getDate(40);
		dto.setCreateDate(createDate.toLocalDate());

		dto.setCreateBy(resultSet.getString(41));

		Date updateDate = resultSet.getDate(42);
		dto.setUpdateDate(updateDate.toLocalDate());

		dto.setUpdatedBy(resultSet.getString(43));
	}

	@Override
	public ResortDTO getByName(String name) {
		String sql = "select * from resort where name=?";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				ResortDTO dto = new ResortDTO();
				extracted(resultSet, dto);

				return dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ResortDTO getByNameAndLocation(String name, String location) {
		String sql = "select * from resort where name=? and location=?";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, location);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				ResortDTO dto = new ResortDTO();
				extracted(resultSet, dto);

				return dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResortDTO getByNameAndLocationAndOwnerName(String name, String location, String ownerName) {
		String sql = "select * from resort where name=? and location=? and ownerName=?";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, location);
			statement.setString(3, ownerName);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				ResortDTO dto = new ResortDTO();
				extracted(resultSet, dto);

				return dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LocalTime getCheckInTimeByName(String name) {
		String sql = "select checkInTime from resort where name=?";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, name);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {

				Time entryTime = resultSet.getTime(1);
				LocalTime time = entryTime.toLocalTime();
				return time;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTotalRows() {
		String sql = "select count(*) from resort";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int row = resultSet.getInt(1);
				System.out.println(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ResortDTO getByMaxPrice() {
		String sql = "select*from resort where price=(select max(price) from resort)";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				ResortDTO dto = new ResortDTO();
				extracted(resultSet, dto);

				return dto;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResortDTO getByMinPrice() {
		String sql = "select*from resort where price=(select min(price) from resort)";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				ResortDTO dto = new ResortDTO();
				extracted(resultSet, dto);

				return dto;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void save(Collection<ResortDTO> dtos) {
		Connection tempconnection = null;
		String sql = "INSERT INTO resort VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(URL.getValues(), USERNAME.getValues(),
				SECRET.getValues())) {
			connection.setAutoCommit(false);
			tempconnection = connection;

			PreparedStatement statement = connection.prepareStatement(sql);
			Iterator<ResortDTO> itr = dtos.iterator();
			while (itr.hasNext()) {
				ResortDTO dto = itr.next();
				statement.setInt(1, dto.getId());
				statement.setString(2, dto.getName());
				statement.setString(3, dto.getOwnerName());
				statement.setString(4, dto.getLocation());
				statement.setDouble(5, dto.getPrice());
				statement.setDouble(6, dto.getRating());
				statement.setTime(7, Time.valueOf(dto.getCheckInTime()));
				statement.setTime(8, Time.valueOf(dto.getCheckOutTime()));
				statement.setInt(9, dto.getNoOfCooks());
				statement.setString(10, dto.getReceptionistName());
				statement.setInt(11, dto.getCottages());
				statement.setInt(12, dto.getSecurityGuards());
				statement.setBoolean(13, dto.getSwimmingPool());
				statement.setInt(14, dto.getNoOfCCTV());
				statement.setInt(15, dto.getNoOfDogs());
				statement.setInt(16, dto.getNoOfJeeps());
				statement.setInt(17, dto.getNoOfBikes());
				statement.setBoolean(18, dto.getOnlineBooking());
				statement.setString(19, dto.getState());
				statement.setString(20, dto.getCountry());
				statement.setDouble(21, dto.getInvestment());
				statement.setInt(22, dto.getNoOfInvesters());
				statement.setDouble(23, dto.getNetWorth());
				statement.setBoolean(24, dto.getInternet());
				statement.setInt(25, dto.getTotalArea());
				statement.setInt(26, dto.getNoOfTrees());
				statement.setBoolean(27, dto.getBarCounter());
				statement.setBoolean(28, dto.getVegFood());
				statement.setBoolean(29, dto.getNonVegFood());
				statement.setString(30, dto.getTreeName());
				statement.setInt(31, dto.getNoOfActivities());
				statement.setBoolean(32, dto.getIndoorActivities());
				statement.setBoolean(33, dto.getOutdoorActivities());
				statement.setString(34, dto.getActivitiesName());
				statement.setString(35, dto.getGstNo());
				statement.setBoolean(36, dto.getAcRooms());
				statement.setBoolean(37, dto.getFireChamp());
				statement.setBoolean(38, dto.getAdvanceBooking());
				statement.setBoolean(39, dto.getBookingCanclled());
				statement.setDate(40, Date.valueOf(dto.getCreateDate()));
				statement.setString(41, dto.getCreateBy());
				statement.setDate(42, Date.valueOf(dto.getUpdateDate()));
				statement.setString(43, dto.getUpdatedBy());

				int row = statement.executeUpdate();
				connection.commit();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempconnection.rollback();

			} catch (Exception e2) {
				e.printStackTrace();
			}
		}

	}

}
