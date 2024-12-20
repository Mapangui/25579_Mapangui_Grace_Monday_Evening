package EXCEPTIONS;

// Program to demonstrate EOFException
import java.io.*;

public class EOFExceptionDemo {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
            while (true) {
                // Reading beyond file content
                dis.readByte();
            }
        } catch (EOFException e) {
            // Handling EOFException
            System.out.println("EOFException handled: End of file reached.");
        } catch (IOException e) {
            System.out.println("IOException handled.");
        }
    }
}
