package com.bit.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.entity.BbsVo;

public abstract class JdbcTemplate {
	
	public Connection getConnection() throws SQLException{
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://10.10.10.40:3306/my?userUnicode=true&amp;characterEncoding=utf8";
		String user="class01";
		String password="1234";
		Connection conn=null;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public int executeUpdate(String sql) throws SQLException{
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			setParameters(pstmt);
			return pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
	
	public Object queryObject(String sql) throws SQLException{
		return queryList(sql).get(0);
	}
	
	
	public List queryList(String sql) throws SQLException{
		List list=new ArrayList();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			setParameters(pstmt);
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(mapper(rs));
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
	
	public abstract void setParameters(PreparedStatement pstmt) throws SQLException;
	public abstract Object mapper(ResultSet rs) throws SQLException;
}





















