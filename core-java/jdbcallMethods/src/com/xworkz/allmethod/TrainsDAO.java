package com.xworkz.allmethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class TrainsDAO {

	
	Connection mysql=null;
	public boolean save(TrainsDTO dto) {
		
		try {
			Class.forName(TrainsInterface.DRIVER);
			mysql = DBUtil.createConnection();

			System.out.println("connection is open");
			String sql = "insert into train_details values(?,?,?,?,?,?,?)";
			PreparedStatement ref = mysql.prepareStatement(sql);
			ref.setObject(11, dto.getTid());
			ref.setObject(22, dto.getTrainNo());
			ref.setObject(33, dto.getSeatNo());
			ref.setObject(44, dto.getPrice());
			ref.setObject(55, dto.getNameboarding());
			ref.setObject(66, dto.getDestination());
			ref.setObject(77, dto.getTrainClass());
			int rowsAffected = ref.executeUpdate();
			System.out.println(sql);
			System.out.println("Formatted output : " + rowsAffected);
			if (rowsAffected == 1) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection(mysql);
		}
		return false;
	}
/*	public boolean delete(int tid) {
		try {
			Class.forName(TrainsInterface.DRIVER);
			mysql=DBUtil.createConnection();
			
			String sql="delete from train_details where tid=?";
			try {
				PreparedStatement ref1=mysql.prepareStatement(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
  public boolean deleteByTrainNoAndTrainId(String TrainNo,int tid)
	{
		 mysql=DBUtil.createConnection();
			try {
			
				String sql="delete from train_detailss where train_No=? and train_Id=?";
				PreparedStatement ref3=mysql.prepareStatement(sql);
				ref3.setObject(1, TrainNo);
				ref3.setObject(2, tid);
				int rowsAffected=ref3.executeUpdate();
				System.out.println("Formatted output : "+rowsAffected);
				if(rowsAffected==1) {
					return true;
				}
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				DBUtil.closeConnection(mysql);
			}	
			return false;
	}
	public TrainsDTO getByTrainNo(String trainNo)
	{
     mysql=DBUtil.createConnection();
		TrainsDTO dtoo=null;
		try {
			
			
			String sql="select * from train_detailss where train_no=?";
			PreparedStatement ref4=mysql.prepareStatement(sql);
			ref4.setObject(1, trainNo);
			ResultSet result=ref4.executeQuery();
			while(result.next())
			{
				int tid=result.getInt(1);
				System.out.println("train_id- "+tid);
				String trainno=result.getString(2);
				System.out.println("train_No - "+trainno);
				return dtoo;
			}
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
		return null;
	}
	*/


//}

}

