package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.core.JdbcTemplate;
import com.bit.core.RowMapper;
import com.bit.model.entity.BbsVo;

public class BbsDao {
	
	RowMapper mapper=new RowMapper<BbsVo>() {

		@Override
		public BbsVo mapRow(ResultSet rs) throws SQLException {
			return new BbsVo(
					rs.getInt("idx"),
					rs.getString("sub"),
					rs.getString("content"),
					rs.getTimestamp("nalja"),
					rs.getInt("cnt")
					);
		}
	};
	
	public List<BbsVo> selectAll() throws SQLException{
		String sql="select * from bbs2";
		JdbcTemplate<BbsVo> template = new JdbcTemplate<BbsVo>();
		return template.queryList(sql,mapper);
	}
	
	public BbsVo selectOne(int idx) throws SQLException{
		String sql="select * from bbs2 where idx=?";
		JdbcTemplate<BbsVo> template=new JdbcTemplate<BbsVo>();
		return template.queryObject(sql,mapper,new Object[]{idx});
	}
	
	public int insertOne(BbsVo bean) throws SQLException{
		String sql="insert into bbs2 (sub,content,nalja,cnt) values (?,?,now(),0)";
		JdbcTemplate<BbsVo> template = new JdbcTemplate<BbsVo>();
		return template.executeUpdate(sql,new Object[]{bean.getSub(),bean.getContent()});
	}
}





















