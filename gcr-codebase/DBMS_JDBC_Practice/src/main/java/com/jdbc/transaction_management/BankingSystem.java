package com.jdbc.transaction_management;

import java.sql.*;
import java.util.Scanner;

public class BankingSystem {
	private static final String URL = "jdbc:mysql://localhost:3306/banking_system";
	private static final String USER = "root";
	private static final String PASS = "Harsh@SQL12";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n---  Banking Transaction System ---");
			System.out.println("1. Check Balance\n2. Transfer Money\n3. View History\n4. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> checkBalance(sc);
			case 2 -> transferMoney(sc);
			case 3 -> viewHistory();
			case 4 -> System.exit(0);
			}
		}
	}

	private static void transferMoney(Scanner sc) {
		System.out.print("Sender Account No: ");
		int fromAcc = sc.nextInt();
		System.out.print("Receiver Account No: ");
		int toAcc = sc.nextInt();
		System.out.print("Amount to Transfer: ");
		double amount = sc.nextDouble();

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			// STEP 1: Disable Auto-Commit (Starts Transaction)
			conn.setAutoCommit(false);

			// STEP 2: Deduct Money
			String deductSql = "UPDATE Account SET balance = balance - ? WHERE account_number = ? AND balance >= ?";
			PreparedStatement pstmt1 = conn.prepareStatement(deductSql);
			pstmt1.setDouble(1, amount);
			pstmt1.setInt(2, fromAcc);
			pstmt1.setDouble(3, amount);
			int rows1 = pstmt1.executeUpdate();

			// STEP 3: Add Money
			String addSql = "UPDATE Account SET balance = balance + ? WHERE account_number = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(addSql);
			pstmt2.setDouble(1, amount);
			pstmt2.setInt(2, toAcc);
			int rows2 = pstmt2.executeUpdate();

			// STEP 4: Record History
			String histSql = "INSERT INTO TransactionHistory (from_account, to_account, amount) VALUES (?, ?, ?)";
			PreparedStatement pstmt3 = conn.prepareStatement(histSql);
			pstmt3.setInt(1, fromAcc);
			pstmt3.setInt(2, toAcc);
			pstmt3.setDouble(3, amount);
			pstmt3.executeUpdate();

			if (rows1 > 0 && rows2 > 0) {
				conn.commit(); // ✅ COMMIT: Permanent change
				System.out.println(" Transfer Successful!");
			} else {
				conn.rollback(); // ❌ ROLLBACK: Undo everything
				System.out.println(" Transfer Failed (Insufficient Funds or Invalid Account).");
			}

		} catch (SQLException e) {
			try {
				if (conn != null)
					conn.rollback();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void checkBalance(Scanner sc) {
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		String sql = "SELECT balance FROM Account WHERE account_number = ?";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, accNo);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				System.out.println("Balance: ₹" + rs.getDouble("balance"));
			else
				System.out.println("Account not found.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewHistory() {
		String sql = "SELECT * FROM TransactionHistory ORDER BY timestamp DESC";
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			System.out.println("\n--- Transaction History ---");
			while (rs.next()) {
				System.out.printf("From: %d | To: %d | Amt: %.2f | Time: %s\n", rs.getInt("from_account"),
						rs.getInt("to_account"), rs.getDouble("amount"), rs.getTimestamp("timestamp"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
