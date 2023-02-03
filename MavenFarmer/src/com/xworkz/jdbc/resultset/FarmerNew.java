package com.xworkz.jdbc.resultset;

import static com.xworkz.jdbc.constants.Farmer_Property.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FarmerNew {

	public static void main(String[] args) {
		String sql="select * from farmer";
		try ( Connection connection=DriverManager.getConnection(URL.getValues(), USERNAME.getValues(), SECRET.getValues())){
			PreparedStatement statement=connection.prepareStatement(sql);
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				int fan1=result.getInt(1);
				String fan2=result.getString(2);
				String fan3=result.getString(3);
				String fan4=result.getString(4);
				String fan5=result.getString(5);
				
				
				System.out.println(fan1+" "+fan2+" "+fan3+" "+fan4+" "+fan5);
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

}
