package com.bit.model;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.bit.model.entity.BbsVo;

public class BbsDaoTest {

	@Test
	public void testGetConnection() throws SQLException{
		BbsDao dao=new BbsDao();
		Connection conn = dao.getConnection();
		assertNotNull(conn);
	}

	@Test
	public void testSelectAll() throws SQLException{
		BbsDao dao=new BbsDao();
		List<BbsVo> list = dao.selectAll();
		assertNotNull(list);
		assertTrue(list.size()>0);
		assertNotSame(1, list.size());
	}
	
	@Test
	public void testInsertOne() throws SQLException{
		BbsDao dao=new BbsDao();
		BbsVo bean=new BbsVo(12, "test", "test", null, 0);
		int before=dao.selectAll().size();
		dao.insertOne(bean);
		int after=dao.selectAll().size();
		assertSame(before+1, after);
		
	}
	@Test
	public void testSelectOne() throws SQLException{
		BbsDao dao = new BbsDao();
		BbsVo bean=new BbsVo(5,"test5","test",null,0);
		BbsVo result=dao.selectOne(bean.getIdx());
		assertEquals(bean, result);
	}
}














