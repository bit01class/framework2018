package com.bit.spr.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.spr.model.entity.Bbs03Vo;
import com.bit.spr.util.MyOracle;

public class Bbs03Dao {
	
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<Bbs03Vo> selectAll() throws SQLException{
		String sql="SELECT * FROM BBS03 ORDER BY NUM DESC";
		List<Bbs03Vo> list=new ArrayList<Bbs03Vo>();
		try(Connection conn=MyOracle.getConnection()){
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())list.add(new Bbs03Vo(
					rs.getInt("num"),rs.getString("name"),rs.getString("sub"),
					rs.getString("content"),rs.getDate("nalja")
					));
		}
		return list;
	}

	public void insertOne(String name, String sub, String content) throws SQLException{
		String sql="INSERT INTO BBS03 VALUES (BBS03_SEQ.NEXTVAL,?,?,?,SYSDATE)";
		try(Connection conn=MyOracle.getConnection()){
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, sub);
			pstmt.setString(3, content);
			pstmt.executeUpdate();
		}
	}
	
	public Bbs03Vo selectOne(int num) throws SQLException{
		String sql="SELECT * FROM BBS03 WHERE NUM=?";
		try(Connection conn=MyOracle.getConnection()){
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(!rs.next())return null;
			return new Bbs03Vo(
					rs.getInt("num"),rs.getString("name"),rs.getString("sub"),
					rs.getString("content"),rs.getDate("nalja")
					);
		}
	}

	public int updateOne(String sub, String content, int num) throws SQLException {
		String sql="UPDATE BBS03 SET SUB=?, CONTENT=? WHERE NUM=?";
		try(Connection conn=MyOracle.getConnection()){
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sub);
			pstmt.setString(2, content);
			pstmt.setInt(3, num);
			return pstmt.executeUpdate();
		}
	}

	public int deleteOne(int num) throws SQLException {
		String sql="DELETE FROM BBS03 WHERE NUM=?";
		try(Connection conn=MyOracle.getConnection()){
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			return pstmt.executeUpdate();
		}
	}
}


















