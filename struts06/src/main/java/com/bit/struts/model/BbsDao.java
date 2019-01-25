package com.bit.struts.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.struts.model.entity.BbsVo;

public interface BbsDao {

	List<BbsVo> selectAll() throws SQLException;
	BbsVo selectOne(int idx) throws SQLException;
	int insertOne(BbsVo bean) throws SQLException;
	int updateOne(BbsVo bean) throws SQLException;
	int deleteOne(int idx) throws SQLException;
}
