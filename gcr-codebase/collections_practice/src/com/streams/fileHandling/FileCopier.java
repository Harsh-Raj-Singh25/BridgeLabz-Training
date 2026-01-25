package com.streams.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class FileCopier {
    public static void main(String[] args) {
        //  Define source and destination paths
        String sourcePath = "C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\collections_practice\\src\\com\\streams\\fileHandling\\source.txt";
        String destPath = "C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\collections_practice\\src\\com\\streams\\fileHandling\\destination.txt";
        // Check if source exists before attempting to open it
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("  Error: The source file '" + sourcePath + "' was not found.");
            return;
        }

        // Use try-with-resources for automatic closing
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            System.out.println("  Copying file...");
            
            int byteData;
            //   Read byte-by-byte until end of file (-1)
            while ((byteData = fis.read()) != -1) {
                //  Write that same byte to the destination
                fos.write(byteData);
            }

            System.out.println("  Success: Content copied to " + destPath);

        } catch (IOException e) {
            System.out.println("  An I/O error occurred during the copying process.");
            e.printStackTrace();
        }
    }
}