package com.bit.struts.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.bit.struts.model.entity.BbsVo;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class BbsDaoImpl2 implements BbsDao {
	private SqlMapClient smc;
	
	public BbsDaoImpl2() {
		try {
			Reader reader= Resources.getResourceAsReader("SqlMapConfig.xml");
			smc=SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<BbsVo> selectAll() throws SQLException {
		
		return smc.queryForList("selectAll");
	}

	@Override
	public BbsVo selectOne(int idx) throws SQLException {
		return (BbsVo) smc.queryForObject("selectOne",idx);
	}

	@Override
	public int insertOne(BbsVo bean) throws SQLException {
		smc.insert("insertOne",bean);
		return 1;
	}

	@Override
	public int updateOne(BbsVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
