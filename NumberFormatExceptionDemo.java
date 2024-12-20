package EXCEPTIONS;

// Program to demonstrate NumberFormatException
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempting to parse an invalid number string
            int number = Integer.parseInt("invalid_number");
        } catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println("NumberFormatException handled: Invalid number format.");
        }
    }
}
