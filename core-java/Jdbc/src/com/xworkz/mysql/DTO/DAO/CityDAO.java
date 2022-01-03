package com.xworkz.mysql.DTO.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mysql.DTO.CityDTO;
import com.xworkz.mysql.DTO.DAO.Interface.CityInterface;

public class CityDAO {
	Connection connection=null;
	public boolean save(CityDTO cityDTO)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(CityInterface.URL,CityInterface.USER_NAME,CityInterface.PASSWORD);
			String sql="insert into cityDetails values("+cityDTO.getCid()+",'"+cityDTO.getcName()+"','"+cityDTO.getFamousFor()+"',"+cityDTO.getcPopulation()+")";
			Statement statement=connection.createStatement();
			int affected=statement.executeUpdate(sql);
			System.out.println(affected);
			if(affected==1)return true;
		} catch (SQLException e ) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return false;
	}
}
