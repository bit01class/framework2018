package com.bit.model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class BbsDaoTest {

	@Test
	public void testSelectAll() throws SQLException {
		BbsDao dao = new BbsDao();
		assertNotNull(dao.selectAll());
		assertNotSame(0, dao.selectAll().size());
	}

}
