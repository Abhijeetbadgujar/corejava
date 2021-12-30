package com.xworkz.mysql.DTO.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mysql.DTO.ClubDTO;
import com.xworkz.mysql.DTO.DAO.Interface.ConstanceInterface;

public class ClubDAO {
	Connection connection = null;

	public boolean save(ClubDTO clubDTO) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(ConstanceInterface.url, ConstanceInterface.userName,
					ConstanceInterface.password);
			if (!connection.isClosed()) {
				System.out.println("after loading and resister device");
			}
			System.out.println("connection is open");
			String sql = "Insert into Club_details values(" + clubDTO.getId() + ",'" + clubDTO.getName() + "',"
					+ clubDTO.getNoOfBouncers() + "," + clubDTO.getFees() + ")";
			Statement statement = connection.createStatement();
			System.out.println("invoked the create statement:" + statement);
			int rowAffceted = statement.executeUpdate(sql);
			System.out.println("total rows affected:" + rowAffceted);
			if (rowAffceted == 1)
				return true;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e2) {
			e2.printStackTrace();
		} finally {

			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					// TODO: handle exceptione
				}
			}
		}
		return false;
	}

	public boolean delete(int id) {
		try {
			//1.loading and resistation driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.created connection usig drivermaneger
			connection = DriverManager.getConnection(ConstanceInterface.url, ConstanceInterface.userName,
					ConstanceInterface.password);
			// 3.prepare quary
			String mysql = "delete from club_details where id=" + id;
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
			if (connection!= null) {
				try {
					connection.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

}
