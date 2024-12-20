package EXCEPTIONS;

// Program to demonstrate IllegalArgumentException
public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(-1);
        } catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException
            System.out.println("IllegalArgumentException handled: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}

