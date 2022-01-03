package com.xworkz.mysql.DTO.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mysql.DTO.IceCreamDTO;
import com.xworkz.mysql.DTO.DAO.Interface.IceCreamInterface;

public class IceCreamDAO {
	Connection connection = null;

	public boolean save(IceCreamDTO iceCreamDTO) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(IceCreamInterface.URL, IceCreamInterface.USER_NAME,
					IceCreamInterface.PASSWORD);
			String sql = "insert into c_details values(" + iceCreamDTO.getCreamid() + "," + iceCreamDTO.getcPrice()
					+ ",'" + iceCreamDTO.getcName() + "','" + iceCreamDTO.getcFlavour() + "')";
			Statement statement = connection.createStatement();
			int rowAffected = statement.executeUpdate(sql);
			System.out.println("row affected :" + rowAffected);
			if (rowAffected == 1)
				return true;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					if (connection.isClosed()) {

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean delete(int creamid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(IceCreamInterface.URL, IceCreamInterface.USER_NAME,
					IceCreamInterface.PASSWORD);
			String sql = "delete from club_details where id=" + creamid;
			Statement statement = connection.createStatement();
			int rowdelete = statement.executeUpdate(sql);
			if (rowdelete == 1)
				return true;
		} catch (ClassNotFoundException | SQLException e) {
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
