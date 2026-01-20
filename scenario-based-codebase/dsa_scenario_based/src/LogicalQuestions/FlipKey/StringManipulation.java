package LogicalQuestions.FlipKey;

public class StringManipulation {
	public static String CleanseAndInvert(String input) {
		if(input.length()<=5) {
			return "";
		}
		// initializing a string builder for storing the manipulated String
		StringBuilder s=new StringBuilder();
		for(int i=0;i<input.length();i++) {
			Character ch=input.charAt(i);
			int ascii=ch;
			if((ascii>=65 && ascii<91) || (ascii>=97 && ascii<=122)) {
				if(ascii %2 !=0) {
					s.append(Character.toLowerCase(ch));
				}
			}else {
				return "";
			}
		}
		s.reverse();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				result.append(Character.toUpperCase(s.charAt(i)));
			}else {
				result.append(s.charAt(i));
			}
		}
		
		return result.toString();
	}
}
