package com.bit.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate<T> {
	
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
	
	public int executeUpdate(String sql, Object[] objs) throws SQLException{
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++){
				pstmt.setObject(i+1, objs[i]);
			}
			return pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
	
	public T queryObject(String sql) throws SQLException{
		return queryObject(sql, new Object[]{});
	}
	public T queryObject(String sql,Object[] objs) throws SQLException{
		return queryList(sql,objs).get(0);
	}
	
	public List<T> queryList(String sql) throws SQLException{
		return queryList(sql, new Object[]{});
	}
	
	public List<T> queryList(String sql,Object[] objs) throws SQLException{
		List<T> list=new ArrayList<T>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++){
				pstmt.setObject(i+1, objs[i]);
			}
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
	
	public abstract T mapper(ResultSet rs) throws SQLException;
}





















