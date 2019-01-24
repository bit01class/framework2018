package com.bit.strut.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDb {
	private static Connection conn;

	private MySqlDb() throws SQLException {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://10.10.10.40:3306/my?useUnicode=true&amp;characterEncoding=utf8";
		String user="class01";
		String password="1234";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(url, user, password);
	}
	
	public static Connection getConnection() throws SQLException{
		if(conn==null || conn.isClosed())new MySqlDb();
		return conn;
	}
}








