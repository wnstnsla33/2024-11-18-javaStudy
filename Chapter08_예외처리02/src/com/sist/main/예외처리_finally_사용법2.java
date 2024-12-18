package com.sist.main;

import java.sql.*;

public class 예외처리_finally_사용법2 {
	public static void main(String[] args) {
		Connection conn = null;

		PreparedStatement ps = null;

		ResultSet rs = null;

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"hr","happy");
			String sql = "SELECT empno ,ename,job From emp";
			ps= conn.prepareStatement(sql);
			rs =ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "
						+ rs.getString(2)+ " "+
						rs.getString(3));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} // TODO: handle exception
		finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			}catch (SQLException e2) {
				}
			}
		}
	}


