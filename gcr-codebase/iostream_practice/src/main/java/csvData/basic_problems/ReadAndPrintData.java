package csvData.basic_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndPrintData {
	public static void main(String[] args) {
		String file="C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\iostream_practice\\src\\main\\java\\csvData\\student.csv";
		String line="";
		
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			while((line=br.readLine())!=null) {
				// Split by comma delimiter
				String[] data=line.split(",");
				System.out.println(data[0]+" | "+data[1]);
			}
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
	}
}
