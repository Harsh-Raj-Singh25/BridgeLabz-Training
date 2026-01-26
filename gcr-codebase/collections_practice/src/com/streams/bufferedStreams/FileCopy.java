package com.streams.bufferedStreams;

import java.io.*;

public class FileCopy {
	private static final int BUFFER_SIZE = 4096; // 4 KB chunks

	public static void main(String[] args) {
		String source = "C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\collections_practice\\src\\com\\streams\\fileHandling\\source.txt"; // Ensure this file exists for testing
		String destBuffered = "dest_buffered.zip";
		String destNormal = "dest_normal.zip";

		System.out.println( " Starting performance comparison...");

		//   Measure Buffered Stream Performance
		long startTime = System.nanoTime();
		copyFileBuffered(source, destBuffered);
		long endTime = System.nanoTime();
		double bufferedTime = (endTime - startTime) / 1_000_000_000.0;

		//   Measure Normal Stream Performance
		startTime = System.nanoTime();
		copyFileNormal(source, destNormal);
		endTime = System.nanoTime();
		double normalTime = (endTime - startTime) / 1_000_000_000.0;

		//  Output Comparison
		System.out.println("\n --- RESULTS ---");
		System.out.printf("Buffered Stream Time: %.4f seconds\n", bufferedTime);
		System.out.printf("Normal Stream Time:   %.4f seconds\n", normalTime);
		System.out.printf("Speed Improvement:    %.2fx faster\n", (normalTime / bufferedTime));
	}

	private static void copyFileBuffered(String src, String dest) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
		} catch (IOException e) {
			System.err.println("Error in Buffered Copy: " + e.getMessage());
		}
	}

	private static void copyFileNormal(String src, String dest) {
		try (FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(dest)) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
		} catch (IOException e) {
			System.err.println("Error in Normal Copy: " + e.getMessage());
		}
	}
}