package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.model.entity.BbsVo;

public class BbsDao {
	//url - protocol//[hosts][/database][?properties]
	//		jdbc:mysql://localhost:3306/my?useUnicode=true&amp;characterEncoding=utf8
	String url="jdbc:mysql://10.10.10.40:3306/my?useUnicode=true&amp;characterEncoding=utf8";
	String user="class01";
	String password="1234";
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection(url,user,password);
		return conn;
	}
	
	public void close(){
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public ArrayList<BbsVo> selectAll(){
		ArrayList<BbsVo> list = new ArrayList<BbsVo>();
		try {
			conn=getConnection();
			pstmt= conn.prepareStatement("select * from bbs order by num desc");
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(new BbsVo(rs.getInt("num"), rs.getString("sub"), 
						rs.getString("content"), rs.getInt("cnt")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return list;
	}
	
	public BbsVo selectOne(int num){
		String sql="select * from bbs where num=?";
		BbsVo bean =null;
		try {
			conn = getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			while(rs.next()){
				bean=new BbsVo(rs.getInt("num"), rs.getString("sub"), 
						rs.getString("content"), rs.getInt("cnt"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return bean;
	}
	
	public void executeUpdate(String sql,Object[] objs){
		try {
			conn = getConnection();
			pstmt= conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++){
				pstmt.setObject(i+1, objs[i]);
			}
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	public void insertOne(BbsVo bean){
		String sql="insert into bbs (sub,content) values (?,?)";
		executeUpdate(sql,new Object[]{bean.getSub(),bean.getContent()});
	}
	
	public void deleteOne(int num){
		String sql="delete from bbs where num=?";
		executeUpdate(sql, new Object[]{num});
	}
	
	public void UpdateOne(BbsVo bean){
		String sql="update bbs set sub=?,content=? where num=?";
		executeUpdate(sql, new Object[]{bean.getSub(),bean.getContent(),bean.getNum()});
	}
}
















