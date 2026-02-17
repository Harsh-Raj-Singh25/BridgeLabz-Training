package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.sun.tools.javac.launcher.Main;

public class Practice {
	private static final String URL="jdbc:mysql://localhost:3306/banking_system";
	private static final String USER="root";
	private static final String PASSWORD="Harsh@SQL12";
	
	public static void main(String[] args) {
		// 1. create (insert)
		createAccount("Sarthak",489165,48752.12);
		readAccounts();
		updateAccount(947852, "Harsh Raj Singh", 50075.25);
		readAccounts();
		deleteAccount(489165);
		
	}
	
	public static void createAccount(String name, int accountNum, double balance) {
		String querry="Insert into Account(name, account_number,balance) VALUES (?,?,?)";
		try(Connection conn = DriverManager.getConnection(URL,USER, PASSWORD);
				PreparedStatement pstmt=conn.prepareStatement(querry)){
					pstmt.setString(1,name);
					pstmt.setLong(2, accountNum);
					pstmt.setDouble(3, balance);
					pstmt.executeUpdate();
					System.out.println("Account inserted successfully");
				}catch(SQLException e) {
					e.printStackTrace(); 
				}
				
	}
	public static void readAccounts() {
		String querry="Select * from Account";
		try(Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt= conn.createStatement();
				ResultSet rs=stmt.executeQuery(querry)){
			while(rs.next()) {
				System.out.println(rs.getString("name")+ " | "+rs.getInt("account_number")+" | "+ rs.getDouble("balance"));
			}
		}catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	public static void updateAccount(int account_number, String name, double balance) {
		String querry="Update Account SET name=?, balance=? WHERE account_number=?";
		try(Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement pstmt=conn.prepareStatement(querry)){
			pstmt.setString(1, name);
			pstmt.setDouble(2,balance);
			pstmt.setInt(3, account_number);
			pstmt.executeUpdate();
			System.err.println("Account updated");
		}catch(SQLException e) { e.printStackTrace();}
	}
	
	public static void deleteAccount(int account) {
        String query = "DELETE FROM Account WHERE account_number = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, account);
            pstmt.executeUpdate();
            System.err.println("Account deleted!");
        } catch (SQLException e) { e.printStackTrace(); }
        
        
    
	}
}
