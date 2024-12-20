package EXCEPTIONS;
// Program to demonstrate SQLException
import java.sql.*;

public class SQLExceptionDemo {
    public static void main(String[] args) {
        try {
            // Simulating a database error
            throw new SQLException("Simulated database connection error.");
        } catch (SQLException e) {
            // Handling SQLException
            System.out.println("SQLException handled: " + e.getMessage());
        }
    }
}
