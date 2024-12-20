package EXCEPTIONS;


// Program to demonstrate FileNotFoundException
import java.io.*;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempting to open a file that doesn't exist
            FileReader reader = new FileReader("missing_file.txt");
        } catch (FileNotFoundException e) {
            // Handling FileNotFoundException
            System.out.println("FileNotFoundException handled: File not found.");
        }
    }
}
