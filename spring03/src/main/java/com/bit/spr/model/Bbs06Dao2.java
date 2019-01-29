package com.bit.spr.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import javax.sql.DataSource;

import com.bit.spr.model.entity.Bbs06Vo;

public class Bbs06Dao2 implements Bbs06Dao {
	private DataSource dataSource;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Bbs06Vo> selectAll() throws SQLException{
		String sql="select bbs_num,nvl((select name from user06 where user_num =A.user_num),'¼Õ´Ô') as name,sub,content,cnt from bbs06 A";
		List<Bbs06Vo> list = new ArrayList<Bbs06Vo>();
		try(Connection conn=dataSource.getConnection()){
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())list.add(new Bbs06Vo(
					rs.getInt("bbs_num"),rs.getString("name"),rs.getString("sub"),
					rs.getString("content"),rs.getInt("cnt")
					));
		}
		return list;
	}
	
	public void insertOne(Bbs06Vo bean) throws SQLException{
		String sql="INSERT INTO BBS06 VALUES (BBS06_SEQ.NEXTVAL,?,?,?,0)";
		try(Connection conn=dataSource.getConnection()){
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getUserNum());
			pstmt.setString(2, bean.getSub());
			pstmt.setString(3, bean.getContent());
			pstmt.executeUpdate();
		}
	}

	@Override
	public Bbs06Vo selectOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOne(Bbs06Vo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
