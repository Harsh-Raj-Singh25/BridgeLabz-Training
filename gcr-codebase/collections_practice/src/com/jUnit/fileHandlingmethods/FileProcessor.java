package com.jUnit.fileHandlingmethods;

import java.io.*;
import java.nio.file.*;

public class FileProcessor {
	public void writeToFile(String filename, String content) throws IOException {
		Files.writeString(Path.of(filename), content);
	}

	public String readFromFile(String filename) throws IOException {
		return Files.readString(Path.of(filename));
	}
}