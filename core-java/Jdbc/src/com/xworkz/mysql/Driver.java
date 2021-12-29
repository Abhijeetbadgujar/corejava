package com.xworkz.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Driver {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/club";
		String userName="root";
		String password="Abhi@5010";
		Connection connection=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection(url, userName, password);
				if(!connection.isClosed()) {
					System.out.println("after loading and resistation");
				}
				System.out.println("connection is open");
				String sql="Insert into club_details values(2,'Bangalore Golf','High Grounds,Bangalore',4,1300)";
				Statement statement=connection.createStatement();
				int rowsAffected=statement.executeUpdate(sql);
				System.out.println("Total rows affected :"+rowsAffected );
				
				String sql1="Insert into club_details values(3,'Bangalore Turf','Race Course Road',7,1700)";
				Statement statement1=connection.createStatement();
				int rowsAffected1=statement1.executeUpdate(sql1);
				System.out.println("Total rows affected :"+rowsAffected1 );
				
				String sql2="Insert into club_details values(4,'Catholic','Chikkapet',6,900)";
				Statement statement2=connection.createStatement();
				int rowsAffected2=statement2.executeUpdate(sql2);
				System.out.println("Total rows affected :"+rowsAffected2 );
				
				String sql3="Insert into club_details values(5,'Century club','CubbonPark',10,2100)";
				Statement statement3=connection.createStatement();
				int rowsAffected3=statement3.executeUpdate(sql3);
				System.out.println("Total rows affected :"+rowsAffected3 );
			}
			
			
				catch (ClassNotFoundException e ) {
					e.printStackTrace();
				}
			 catch (SQLException e) {
				System.out.println("after conneting");
				e.printStackTrace();
			} 
			finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();

			} 
			
			}
}
	}
	


