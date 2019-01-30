package com.bit.spr.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bit.spr.model.entity.Bbs06Vo;

public class Bbs06DaoImpl implements Bbs06Dao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	RowMapper<Bbs06Vo> rowMapper=new RowMapper<Bbs06Vo>() {
		
		@Override
		public Bbs06Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Bbs06Vo(
					rs.getInt("bbs_num"),rs.getString("name"),
					rs.getString("sub"),rs.getString("content"),rs.getInt("cnt")
					);
		}
	};
	

	@Override
	public List<Bbs06Vo> selectAll() throws SQLException {
		
		String sql="select bbs_num,nvl("
				+ "(select name from user06 where user_num =A.user_num),'¼Õ´Ô') as name,"
				+ "sub,content,cnt from bbs06 A";
		
		
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void insertOne(Bbs06Vo bean) throws SQLException {
		String sql="insert into bbs06 values (bbs06_seq.nextval,?,?,?,0)";
		jdbcTemplate.update(sql, new Object[]{bean.getUserNum(),bean.getSub(),bean.getContent()});
	}

	@Override
	public Bbs06Vo selectOne(int idx) throws SQLException {
		String sql="select bbs_num,nvl("
				+ "(select name from user06 where user_num =A.user_num),'¼Õ´Ô') as name,"
				+ "sub,content,cnt from bbs06 A"
				+" where bbs_num=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{idx}, rowMapper);
	}

	@Override
	public int updateOne(Bbs06Vo bean) throws SQLException {
		String sql="update bbs06 set sub=?,content=? where bbs_num=?";
		return jdbcTemplate.update(sql, new Object[]{bean.getSub(),bean.getContent(),bean.getNum()});
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}










