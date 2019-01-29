package com.bit.spr.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.spr.model.entity.Bbs06Vo;

public class Bbs06Dao1 {
	
	private String driver;
	private String url;
	private String user;
	private String password;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Bbs06Dao1(String driver,String url,String user,String password){
		this.driver=driver;
		this.url=url;
		this.user=user;
		this.password=password;
	}
	
	public Connection newConnection() throws SQLException{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(url, user, password);
	}

	public List<Bbs06Vo> selectAll() throws SQLException{
		String sql="select bbs_num,nvl((select name from user06 where user_num =A.user_num),'¼Õ´Ô') as name,sub,content,cnt from bbs06 A";
		List<Bbs06Vo> list = new ArrayList<Bbs06Vo>();
		try(Connection conn=newConnection()){
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())list.add(new Bbs06Vo(
					rs.getInt("bbs_num"),rs.getString("name"),rs.getString("sub"),
					rs.getString("content"),rs.getInt("cnt")
					));
		}
		return list;
	}
}











