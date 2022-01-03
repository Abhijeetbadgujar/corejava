package com.xworkz.allmethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*public class DBUtil {
	
	  static Connection connection=null;
	public static Connection createConnection() {
		 try {
			connection= DriverManager.getConnection(TrainsInterface.URL,TrainsInterface.USER_NAME,TrainsInterface.PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	public static void closeConnection(Connection mysql) {
		if(connection!=null)
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	 
}*/

public class DBUtil {
	
	public static Connection createConnection()
	{
		Connection connection;
		try {
			connection = DriverManager.getConnection(TrainsInterface.URL,TrainsInterface.USER_NAME, TrainsInterface.PASSWORD);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection)
	{
		if(connection!=null)
			try {
				
					connection.close();
					System.out.println("Closed the resource");
				
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
}