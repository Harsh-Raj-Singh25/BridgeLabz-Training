package com.functional_interface.marker_interfaces.data_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BackupSystem {
	public static void main(String[] args) {
		PatientRecord record = new PatientRecord("Harsh", 25);

		// Backup process: Writing to a file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.ser"))) {
			out.writeObject(record);
			System.out.println(" Backup Successful: Object serialized.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
