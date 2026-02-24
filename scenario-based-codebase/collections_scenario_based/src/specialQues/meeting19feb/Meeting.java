package specialQues.meeting19feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Meeting {
	public static void main(String[] args) throws InvalidPatternException, IOException {
		Scanner hrs = new Scanner(System.in);
		String regex = "^[A-Z]{2}[a-z]{2}@[2-9][0-9]{3}$";
		Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter your passCode");
//		String input = hrs.next();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String input =reader.readLine();
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("Valid code");
		} else {
			throw new InvalidPatternException("Your code doesn't matches with the prescribed pattern");
		}
		
		
//		try {
//			String s=reader.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		int n=Integer.parseInt(reader.readLine());
		System.out.println("number:" + n);
		double d= Double.parseDouble(reader.readLine());
		System.out.println("double:"+ d);
		
		
		
		
		
		/*
		 *Test + main
		 *push whole maven project to UC1 but don't keep the name
		 *
		 *readme files
		 *
		 * 
		 * */
		
	}
}