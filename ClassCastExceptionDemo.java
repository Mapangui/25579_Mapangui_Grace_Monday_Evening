package EXCEPTIONS;

// Program to demonstrate ClassCastException
public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        try {
            // Invalid type casting
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            // Handling ClassCastException
            System.out.println("ClassCastException handled: Invalid type cast.");
        }
    }
}

