package com.Algorithm_Analysis.String_Analysis;

public class StringBufferConcatenation {
	public static String concatenate(int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append("A");
        }
        return sb.toString();
    }
}
