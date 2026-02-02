package com.stream_API.forEach_questions;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
public class LoggingTransactionIds {
	

	public static void main(String[] args) {
		List<String> transactionIds = Arrays.asList("TXN9901", "TXN9902", "TXN9903");

		transactionIds.forEach(id -> 
		    System.out.println(LocalDateTime.now() + " - Transaction: " + id)
		);
	}
}
