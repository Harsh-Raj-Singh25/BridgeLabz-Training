package com.regex.advancedProblems;

import java.util.regex.Pattern;

public class IPValidator {
	public static void main(String[] args) {
		// Regex for 0-255: (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)
		String byteRegex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
		String ipRegex = "^" + byteRegex + "\\." + byteRegex + "\\." + byteRegex + "\\." + byteRegex + "$";

		String[] ips = { "192.168.1.1", "255.255.255.255", "256.0.0.1", "172.16.254.1" };
		for (String ip : ips) {
			System.out.println(ip + " -> " + Pattern.matches(ipRegex, ip));
		}
	}
}