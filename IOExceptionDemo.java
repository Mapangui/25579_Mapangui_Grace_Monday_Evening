package EXCEPTIONS;

// Program to demonstrate IOException
import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            // Trying to read a non-existent file
            FileReader reader = new FileReader("non_existent_file.txt");
            reader.read();
        } catch (IOException e) {
            // Handling IOException
            System.out.println("IOException handled: File not found.");
        }
    }
}

