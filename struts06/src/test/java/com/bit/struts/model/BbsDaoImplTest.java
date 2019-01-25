package com.bit.struts.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.struts2.components.Select;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bit.struts.model.entity.BbsVo;

public class BbsDaoImplTest {
	static Logger log = Logger.getLogger("com.bit.struts.model.BbsDaoImplTest");
	static BbsDao dao;
	private BbsVo bean;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		log.debug("beforeClass run...");
		dao=new BbsDaoImpl();
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		log.debug("afterClass run...");
	}

	
	@Before
	public void setUp(){
		log.debug("setUp start...");
		bean=new BbsVo(6,"test","test",null,0);
	}
	
	@After
	public void tearDown(){
		log.debug("tearDown start...");
	}

	@Test
	public void testSelectAll() throws SQLException {
		log.debug("testSelectAll run...");
		assertNotNull(dao.selectAll());
		assertNotSame(0, dao.selectAll().size());
	}

	@Test
	public void testSelectOne() throws SQLException {
		log.debug("testSelectOne run...");
		assertNotNull(dao.selectOne(1));
		assertSame(1, dao.selectOne(1).getIdx());
		assertEquals("test1", dao.selectOne(1).getSub());
	}

	@Test
	public void testInsertOne() throws SQLException {
		log.debug("testInsertOne run...");
		
		assertTrue(dao.insertOne(bean)>0);
		dao.deleteOne(bean.getIdx());
	}

	@Test
	public void testUpdateOne() throws SQLException {
		log.debug("testUpdateOne run...");
		dao.insertOne(bean);
		bean=new BbsVo(6,"testtest","testtest",null,0);
		assertTrue(dao.updateOne(bean)>0);
		dao.deleteOne(bean.getIdx());
	}

	@Test
	public void testDeleteOne() throws SQLException {
		log.debug("testDeleteOne run...");
		dao.insertOne(bean);
		assertTrue(dao.deleteOne(bean.getIdx())>0);
	}

}









