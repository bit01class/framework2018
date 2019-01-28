package com.bit.spr.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOracle {
	private static Connection conn;
	
	private MyOracle() {
	}
	
	public static Connection getConnection() throws SQLException{
		if(conn==null)createConn();
		if(conn.isClosed())createConn();
		return conn;
	}
	
	private static void createConn() throws SQLException{
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(url, user, password);
	}
}









