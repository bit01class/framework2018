package com.bit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.model.BbsDao;
import com.bit.model.entity.BbsVo;

public abstract class JdbcTemplate1 {
	
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement pstmt;

	public Connection getConnection() throws SQLException{
		String url="jdbc:mysql://10.10.10.40:3306/my?useUnicode=true&amp;characterEncoding=utf8";
		String user="class01";
		String password="1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public void close() throws SQLException{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}

	public int executeUpdate(String sql) throws SQLException{
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			setParameter(pstmt);
			return pstmt.executeUpdate();
		}finally{
			close();
		}
	}
	
	public abstract void setParameter(PreparedStatement pstmt) throws SQLException;
}















