package com.Searching.FileReading;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderConvertByteToChar {
	public static void main(String [] args) {
		String filepath="src/com/Searching/FileReading/sample.txt";
		try(BufferedReader br=new BufferedReader(  new InputStreamReader(new FileInputStream(filepath),"UTF-8"))){
			String line;
			
			// read the file line by line
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("Error reading file : "+e.getMessage());
		}
	}
}