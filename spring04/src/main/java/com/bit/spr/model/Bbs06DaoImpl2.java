package com.bit.spr.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.spr.model.entity.Bbs06Vo;
import com.ibatis.sqlmap.client.SqlMapClient;

public class Bbs06DaoImpl2 implements Bbs06Dao {
	SqlMapClient sqlMapClient;
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public List<Bbs06Vo> selectAll() throws SQLException {
		return (List<Bbs06Vo>)sqlMapClient.queryForList("selectAll");
	}

	@Override
	public void insertOne(Bbs06Vo bean) throws SQLException {
		sqlMapClient.insert("insertOne",bean);
	}

	@Override
	public Bbs06Vo selectOne(int idx) throws SQLException {
		return (Bbs06Vo) sqlMapClient.queryForObject("selectOne",idx);
	}

	@Override
	public int updateOne(Bbs06Vo bean) throws SQLException {
		return sqlMapClient.update("updateOne", bean);
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		return sqlMapClient.delete("deleteOne", idx);
	}

}












