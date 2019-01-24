package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.entity.BbsVo;
import com.bit.strut.util.MySqlDb;

public class BbsDao {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<BbsVo> selectAll() throws SQLException{
		return selectAll("");
	}
	public List<BbsVo> selectAll(String where) throws SQLException{
		String sql="select * from bbs2";
		sql+=where;
		List<BbsVo> list=new ArrayList<BbsVo>();
		try{
			conn=MySqlDb.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(new BbsVo(
						rs.getInt("idx"),rs.getString("sub"),rs.getString("content"),
						rs.getTimestamp("nalja"),rs.getInt("cnt")
						));
			}
		}finally{
			if(conn!=null)conn.close();
		}
		return list;
	}

	public BbsVo selectOne(int idx) throws SQLException {
		return selectAll(" where idx="+idx).get(0);
	}
	public void insertOne(String sub, String content) throws SQLException {
		String sql="insert into bbs2 (sub,content,nalja,cnt) values (?,?,now(),0)";
		try{
			conn=MySqlDb.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sub);
			pstmt.setString(2, content);
			pstmt.executeUpdate();
		}finally{
			if(conn!=null)conn.close();
		}
	}
	public int updateOne(String sub, String content, int idx) throws SQLException {
		String sql="update bbs2 set sub=?,content=? where idx=?";
		try(Connection conn1=MySqlDb.getConnection()){
			pstmt=conn1.prepareStatement(sql);
			pstmt.setString(1,sub);
			pstmt.setString(2, content);
			pstmt.setInt(3, idx);
			return pstmt.executeUpdate();
		}
	}

}













