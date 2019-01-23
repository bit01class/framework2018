package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		JdbcTemplate<BbsVo> template = new JdbcTemplate<BbsVo>() {
			
			@Override
			public BbsVo mapper(ResultSet rs) throws SQLException {
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
		
		return template.queryList(sql);
	}
	
	public BbsVo selectOne(int idx) throws SQLException{
		String sql="select * from bbs2 where idx=?";
		JdbcTemplate<BbsVo> template=new JdbcTemplate<BbsVo>() {
			
			@Override
			public BbsVo mapper(ResultSet rs) throws SQLException {
				
				return new BbsVo(
						rs.getInt("idx"),
						rs.getString("sub"),
						rs.getString("content"),
						rs.getTimestamp("nalja"),
						rs.getInt("cnt")
						);
			}
		};
		return template.queryObject(sql,new Object[]{idx});
	}
	
	public int insertOne(BbsVo bean) throws SQLException{
		String sql="insert into bbs2 (sub,content,nalja,cnt) values (?,?,now(),0)";
		JdbcTemplate<BbsVo> template = new JdbcTemplate<BbsVo>() {
			
			@Override
			public BbsVo mapper(ResultSet rs) throws SQLException {
				return null;
			}
		};
		return template.executeUpdate(sql,new Object[]{bean.getSub(),bean.getContent()});
	}
}





















