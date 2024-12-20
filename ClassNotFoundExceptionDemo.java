package EXCEPTIONS;

// Program to demonstrate ClassNotFoundException
public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempting to load a missing class
            Class.forName("missing.ClassName");
        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException
            System.out.println("ClassNotFoundException handled: Class not found.");
        }
    }
}
