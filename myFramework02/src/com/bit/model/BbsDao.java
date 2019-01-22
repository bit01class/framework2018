package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.model.entity.BbsVo;
import com.bit.util.JdbcTemplate1;
import com.bit.util.JdbcTemplate2;

public class BbsDao {
	
	// 디자인 패턴
	// Template Method 패턴

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
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

	public ArrayList<BbsVo> selectAll() throws SQLException{
		ArrayList<BbsVo> list=new ArrayList<BbsVo>();
		String sql="SELECT * FROM BBS2 ORDER BY IDX DESC";
		
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())list.add(new BbsVo(
					rs.getInt("idx"),rs.getString("sub"),
					rs.getString("content"),rs.getTimestamp("nalja"),rs.getInt("cnt")
					));
		}finally{
			close();
		}
		
		return list;
	}
	
	public BbsVo selectOne(int idx) throws SQLException{
		String sql="SELECT * FROM BBS2 WHERE IDX=?";
		JdbcTemplate2 template = new JdbcTemplate2() {
			
			@Override
			public void setParameter(PreparedStatement pstmt)
					throws SQLException {
				pstmt.setInt(1, idx);
			}
			
			@Override
			public Object mapper(ResultSet rs) throws SQLException {
				BbsVo bean=new BbsVo();
				bean.setIdx(rs.getInt("idx"));
				bean.setSub(rs.getString("sub"));
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getTimestamp("nalja"));
				bean.setCnt(rs.getInt("cnt"));
				return bean;
			}
		};
		return (BbsVo) template.executeQuery(sql);
	}
	
	public int insertOne(BbsVo bean) throws SQLException{
		JdbcTemplate1 template = new JdbcTemplate1(){
			@Override
			public void setParameter(PreparedStatement pstmt)
					throws SQLException {
				pstmt.setString(1, bean.getSub());
				pstmt.setString(2, bean.getContent());
				
			}
		};
		return template.executeUpdate(
				"INSERT INTO BBS2 (SUB,CONTENT,NALJA,CNT) VALUES (?,?,NOW(),0)");
	}
	
	public int updateOne(BbsVo bean) throws SQLException{
		String sql="UPDATE BBS2 SET SUB=?,CONTENT=? WHERE IDX=?";
		JdbcTemplate1 template =new JdbcTemplate1() {
			
			@Override
			public void setParameter(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, bean.getSub());
				pstmt.setString(2, bean.getContent());
				pstmt.setInt(3, bean.getIdx());
			}
		};
		return template.executeUpdate(sql);
	}
	public int delOne(int idx) throws SQLException{
		String sql="DELETE FROM BBS2 WHERE IDX=?";
		JdbcTemplate1 template =new JdbcTemplate1() {
			
			@Override
			public void setParameter(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, idx);
			}
		};
		return template.executeUpdate(sql);
	}
}




















