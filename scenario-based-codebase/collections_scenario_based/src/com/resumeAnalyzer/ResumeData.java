package com.resumeAnalyzer;

import java.util.*;

class ResumeData implements Comparable<ResumeData> {
	private String email;
	private String phone;
	private int keywordCount;
	private String fileName;

	public ResumeData(String email, String phone, int keywordCount, String fileName) {
		this.email = email;
		this.phone = phone;
		this.keywordCount = keywordCount;
		this.fileName = fileName;
	}

	public String getEmail() {
		return email;
	}

	// Sort descending: Higher keyword match count comes first
	@Override
	public int compareTo(ResumeData other) {
		return Integer.compare(other.keywordCount, this.keywordCount);
	}

	@Override
	public String toString() {
		return String.format("File: %-15s | Matches: %-2d | Email: %-20s | Phone: %s", fileName, keywordCount, email,
				phone);
	}
}