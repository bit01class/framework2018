package com.bit.spr.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Bbs06Dao1Test {
	static Bbs06Dao1 dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
//		dao=new Bbs06Dao1("oracle.jdbc.OracleDriver"
//				, "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:applicationContext.xml");
//		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ac=new FileSystemXmlApplicationContext("src/test/resources/applicationContext.xml");
		dao = (Bbs06Dao1) ac.getBean("dao");
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNewConnection() throws SQLException {
		assertNotNull(dao.newConnection());
	}

	@Test
	public void testSelectAll() throws SQLException {
		assertNotNull(dao.selectAll());
		assertNotSame(0, dao.selectAll().size());
	}

}







