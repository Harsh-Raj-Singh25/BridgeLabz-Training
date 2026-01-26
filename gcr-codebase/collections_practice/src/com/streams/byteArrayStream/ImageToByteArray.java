package com.streams.byteArrayStream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageToByteArray {
	public static void main(String[] args) {
		File sourceImage = new File("D:\\20240421_173640(1).jpg"); // Replace with your image name
		File destinationImage = new File("reconstructed_photo.jpg");

		try {
			// 1. Read Image File into Byte Array using ByteArrayOutputStream
			byte[] imageData = imageToBytes(sourceImage);
			System.out.println(" Image converted to Byte Array. Size: " + imageData.length + " bytes");

			// 2. Write Byte Array back to Image File using ByteArrayInputStream
			bytesToImage(imageData, destinationImage);
			System.out.println(" Byte Array written back to: " + destinationImage.getName());

			// 3. Verification: Check if files are identical
			verifyFiles(sourceImage, destinationImage);

		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	private static byte[] imageToBytes(File file) throws IOException {
		try (FileInputStream fis = new FileInputStream(file);
				ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}
			return baos.toByteArray(); // Returns the full byte array from memory
		}
	}

	private static void bytesToImage(byte[] data, File destFile) throws IOException {
		try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
				FileOutputStream fos = new FileOutputStream(destFile)) {

			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = bais.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
		}
	}

	private static void verifyFiles(File f1, File f2) throws IOException {
		byte[] f1Bytes = Files.readAllBytes(f1.toPath());
		byte[] f2Bytes = Files.readAllBytes(f2.toPath());

		if (Arrays.equals(f1Bytes, f2Bytes)) {
			System.out.println(" Verification Successful: The files are 100% identical!");
		} else {
			System.out.println(" Verification Failed: The files differ.");
		}
	}
}