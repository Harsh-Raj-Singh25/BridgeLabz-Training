package com.jUnit.test;

import org.junit.jupiter.api.*;
import com.jUnit.com.performanceTesting.*;

import java.util.concurrent.TimeUnit;


// Performance Testing Using @Timeout
public class HeavytaskTest {

	@Test
	@Timeout(value = 2, unit = TimeUnit.SECONDS)
	void testTimeout() throws InterruptedException {
		Heavytask task = new Heavytask();
		// This test WILL FAIL because the task takes 3 seconds,
		// but the limit is 2 seconds.
		task.longRunningTask();
	}
}