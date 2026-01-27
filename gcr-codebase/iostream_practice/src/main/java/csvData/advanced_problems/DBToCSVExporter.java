package csvData.advanced_problems;

import java.sql.*;
import java.io.*;

public class DBToCSVExporter {
    public static void main(String[] args) {
        String csvFile = "db_report.csv";
        String url = "jdbc:mysql://localhost:3306/COLLEGE";
        String user = "root";
        String pass = "Harsh@SQL12";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT ID, NAME, AGE FROM students");
             PrintWriter pw = new PrintWriter(new File(csvFile))) {

            //  Write Header
            pw.println("student ID,Name,age ");

            // Stream rows to file
            while (rs.next()) {
                pw.printf("%d,%s,%s,%.2f\n", 
                    rs.getInt("ID"), rs.getString("NAME"), 
                  rs.getInt("AGE"));
            }
            System.out.println(" Report generated: " + csvFile);
        } catch (Exception e) { e.printStackTrace(); }
    }
}