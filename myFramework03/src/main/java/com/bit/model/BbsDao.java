package com.bit.model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.core.JdbcTemplate;
import com.bit.model.entity.BbsVo;

public class BbsDao {
	
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

	public List<BbsVo> selectAll() throws SQLException{
		String sql="select * from bbs2";
		JdbcTemplate template = new JdbcTemplate() {
			
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
			}
			
			@Override
			public Object mapper(ResultSet rs) throws SQLException {
				BbsVo bean=new BbsVo(
						rs.getInt("idx"),
						rs.getString("sub"),
						rs.getString("content"),
						rs.getTimestamp("nalja"),
						rs.getInt("cnt")
						);
				return bean;
			}
		};
		
		return (List<BbsVo>)template.queryList(sql);
	}
	
	public BbsVo selectOne(int idx) throws SQLException{
		String sql="select * from bbs2 where idx=?";
		JdbcTemplate template=new JdbcTemplate() {
			
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, idx);
			}
			
			@Override
			public Object mapper(ResultSet rs) throws SQLException {
				
				return new BbsVo(
						rs.getInt("idx"),
						rs.getString("sub"),
						rs.getString("content"),
						rs.getTimestamp("nalja"),
						rs.getInt("cnt")
						);
			}
		};
		return (BbsVo) template.queryObject(sql);
	}
	
	public int insertOne(BbsVo bean) throws SQLException{
		String sql="insert into bbs2 (sub,content,nalja,cnt) values (?,?,now(),0)";
		JdbcTemplate template = new JdbcTemplate() {
			
			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, bean.getSub());
				pstmt.setString(2, bean.getContent());
			}

			@Override
			public Object mapper(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		};
		return template.executeUpdate(sql);
	}
}





















