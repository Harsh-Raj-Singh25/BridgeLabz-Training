package com.streams.dataStreams;
import java.io.*;

public class StoreRetrievePrimitiveData {
    private static final String FILE_NAME = "students.bin";

    public static void main(String[] args) {
        // Data to be stored
        int rollNo = 78;
        String name = "Harsh Raj Singh";
        double gpa = 8.75;

        //  Writing Primitive Data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            dos.writeInt(rollNo);
            dos.writeUTF(name); // writeUTF is used for Strings
            dos.writeDouble(gpa);
            
            System.out.println("  Student data successfully saved to binary file.");
        } catch (IOException e) {
            System.err.println(" Error writing data: " + e.getMessage());
        }

        System.out.println("--- Reading Data Back ---");

        // Reading Primitive Data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            // IMPORTANT: Must read in the exact same order as written!
            int savedRollNo = dis.readInt();
            String savedName = dis.readUTF();
            double savedGpa = dis.readDouble();

            System.out.println("Roll Number: " + savedRollNo);
            System.out.println("Name       : " + savedName);
            System.out.println("GPA        : " + savedGpa);
        } catch (IOException e) {
            System.err.println(" Error reading data: " + e.getMessage());
        }
    }
}