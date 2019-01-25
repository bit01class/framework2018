package com.bit.struts.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bit.struts.model.entity.BbsVo;
import com.bit.struts.util.MyOracle;

public class BbsDaoImpl implements BbsDao {

	private boolean commit;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	public BbsDaoImpl() {
		commit=true;
	}
	
	public void isTest(){
		commit=false;
	}
	
	private BbsVo newVo(ResultSet rs) throws SQLException{
		return new BbsVo(
				rs.getInt("idx"),rs.getString("sub"),rs.getString("content"),
				rs.getTimestamp("nalja"),rs.getInt("cnt"));
	}

	@Override
	public List<BbsVo> selectAll() throws SQLException {
		String sql="SELECT * FROM BBS02 ORDER BY IDX DESC";
		List<BbsVo> list=new ArrayList<BbsVo>();
		try{
			conn=MyOracle.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())list.add(newVo(rs));
		}finally{
			isCommit(conn,commit);			
		}
		return list;
	}

	@Override
	public BbsVo selectOne(int idx) throws SQLException {
		String sql="SELECT * FROM BBS02 WHERE IDX=?";
		try{
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs=pstmt.executeQuery();
			if(!(rs.next()))return null;
			return newVo(rs);
		}finally{
			isCommit(conn,commit);			
		}
	}

	@Override
	public int insertOne(BbsVo bean) throws SQLException {
		String sql="INSERT INTO BBS02 (IDX,SUB,CONTENT) VALUES (BBS02_SEQ.NEXTVAL,?,?)";
		try{
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getSub());
			pstmt.setString(2, bean.getContent());
			return pstmt.executeUpdate();
		}finally{
			isCommit(conn,commit);			
		}
	}

	@Override
	public int updateOne(BbsVo bean) throws SQLException {
		String sql="UPDATE BBS02 SET SUB=?,CONTENT=?,NALJA=SYSDATE WHERE IDX=?";
		try{
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bean.getSub());
			pstmt.setString(2, bean.getContent());
			pstmt.setInt(3, bean.getIdx());
			return pstmt.executeUpdate();
		}finally{
			isCommit(conn,commit);			
		}
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		String sql="DELETE FROM BBS02 WHERE IDX=?";
		try{
			conn=MyOracle.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			return pstmt.executeUpdate();
		}finally{
			isCommit(conn,commit);			
		}
	}
	
	public void isCommit(Connection conn,boolean result) throws SQLException{
		if(result)conn.commit();
		else	conn.rollback();
	}

}



















