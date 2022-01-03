package com.xworkz.mysql.DTO.DAO.Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CountryInterface {
	String URL = "jdbc:mysql://localhost:3306/festival";
	String USE_NAME = "root";
	String PASSWORD = "Abhi@5010";

	String conne="Insert into Club_details values(
	Connection connection= DriverManager.getConnection(FestivalInterface.URL, FestivalInterface.USE_NAME,
			FestivalInterface.PASSWORD);

	if(connection!=null)
	{
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}}
