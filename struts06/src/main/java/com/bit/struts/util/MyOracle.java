package com.bit.struts.util;

import java.sql.*;

public class MyOracle {
	private static Connection conn;
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="scott";
	private static String password="tiger";

	private MyOracle() {
	}
	
	public static Connection getConnection() throws SQLException{
		if(conn==null){newConnection();}
		if(conn.isClosed()){newConnection();}
		conn.setAutoCommit(false);
		return conn;
	}
	private static void newConnection() throws SQLException{
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(url, user, password);
	}
}
