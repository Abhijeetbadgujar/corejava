package com.xworkz.mysql.DTO.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mysql.DTO.FestivalDTO;
import com.xworkz.mysql.DTO.DAO.Interface.ConstanceInterface;
import com.xworkz.mysql.DTO.DAO.Interface.FestivalInterface;

public class FestivalDAO {
	Connection connection = null;

	public boolean save(FestivalDTO festivalDTO) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(FestivalInterface.URL, FestivalInterface.USE_NAME,
					FestivalInterface.PASSWORD);
			String sql = "insert into fes_details('" + festivalDTO.getName() + "'," + festivalDTO.getDate() + ",'"
					+ festivalDTO.getSpecility() + "','" + festivalDTO.getDayDuration() + "')";
			System.out.println("connection is open");
			Statement statement = connection.createStatement();
			int affected = statement.executeUpdate(sql);
			System.out.println("affected output");
			System.out.println("row affected :" + affected);
			if (affected == 1)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean delete(String name) {
		try {
			// 1.loading and resistation driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2.created connection usig drivermaneger
			connection = DriverManager.getConnection(FestivalInterface.URL, FestivalInterface.USE_NAME,
					FestivalInterface.PASSWORD);
			// 3.prepare quary
			String mysql = "delete from fes_details where name=" + name;
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
