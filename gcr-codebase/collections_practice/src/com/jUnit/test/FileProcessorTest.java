package com.jUnit.test;

import org.junit.jupiter.api.*;

import com.jUnit.com.fileHandlingmethods.FileProcessor;

import java.io.IOException;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
	FileProcessor processor = new FileProcessor();
	String testFile = "test_output.txt";

	@AfterEach
	void cleanUp() throws IOException {
		// Delete the file after each test to keep the workspace clean
		Files.deleteIfExists(Path.of(testFile));
	}

	@Test
	void testWriteAndRead() throws IOException {
		String content = "Hello JUnit!";
		processor.writeToFile(testFile, content);

		assertTrue(Files.exists(Path.of(testFile)), "File should exist on disk");
		assertEquals(content, processor.readFromFile(testFile), "Content mismatch!");
	}

	@Test
	void testReadNonExistentFile() {
		// Verifying that an IOException is thrown when file is missing
		assertThrows(IOException.class, () -> {
			processor.readFromFile("ghost_file.txt");
		});
	}
}