package com.jUnit.performanceTesting;

import org.junit.jupiter.api.*;
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