package com.bit.spr.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.spr.model.entity.Bbs06Vo;

public class Bbs06Dao3 extends JdbcDaoSupport implements Bbs06Dao {

	@Override
	public List<Bbs06Vo> selectAll() throws SQLException {
		String sql="select bbs_num,nvl((select name from user06 where user_num =A.user_num),'¼Õ´Ô') as name,sub,content,cnt from bbs06 A";
		return getJdbcTemplate().query(sql, new RowMapper<Bbs06Vo>(){

			@Override
			public Bbs06Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Bbs06Vo(
						rs.getInt("bbs_num"),rs.getString("name"),
						rs.getString("sub"),rs.getString("content"),rs.getInt("cnt")
						);
			}
			
		});
	}

	@Override
	public void insertOne(Bbs06Vo bean) throws SQLException {
		String sql="INSERT INTO BBS06 VALUES (BBS06_SEQ.NEXTVAL,?,?,?,0)";
		getJdbcTemplate().update(sql, 
				new Object[]{bean.getUserNum(),bean.getSub(),bean.getContent()});
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
