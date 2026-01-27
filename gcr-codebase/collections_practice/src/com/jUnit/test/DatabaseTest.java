package com.jUnit.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import com.jUnit.com.beforeEachAfterEach.*;

public class DatabaseTest {
	DatabaseConnection db;

	@BeforeEach
	void setup() {
		db = new DatabaseConnection();
		db.connect(); // Runs BEFORE every @Test
	}

	@Test
	void testConnectionIsActive() {
		assertTrue(db.isConnected(), "Connection should be active during the test");
	}

	@Test
	void testDataIntegrity() {
		// Simulating a database check
		assertNotNull(db);
	}

	@AfterEach
	void tearDown() {
		db.disconnect(); // Runs AFTER every @Test
	}
}