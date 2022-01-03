package com.xworkz.mysql.DTO.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.util.Util;
import com.xworkz.mysql.DTO.CountryDTO;
import com.xworkz.mysql.DTO.DAO.Interface.ConstanceInterface;
import com.xworkz.mysql.DTO.DAO.Interface.FestivalInterface;

public class CountryDAO {
	Connection connection = null;
	Connection shot=null;
	public boolean save(CountryDTO dto1) {
		shot=.cr
		try {
			// 1.loading and resistation driver
			
			// 2.created connection usig drivermaneger
			connection = DriverManager.getConnection(FestivalInterface.URL, FestivalInterface.USE_NAME,
					FestivalInterface.PASSWORD);
			// 3.prepare quary
			String mysql = "delete from country_details where id=" + dto1;
			// 4.created statement
			Statement statement = connection.createStatement();
			int rowaffected = statement.executeUpdate(mysql);
			if (rowaffected == 1)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public boolean delete(int id) {
		try {
			// 1.loading and resistation driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2.created connection usig drivermaneger
			connection = DriverManager.getConnection(ConstanceInterface.url, ConstanceInterface.userName,
					ConstanceInterface.password);
			// 3.prepare quary
			String mysql = "delete from county_details where id=" + id;
			// 4.created statement
			Statement statement = connection.createStatement();
			int rowaffected = statement.executeUpdate(mysql);
			if (rowaffected == 1)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}
}
