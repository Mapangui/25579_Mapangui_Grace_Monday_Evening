package EXCEPTIONS;

// Program to demonstrate ArithmeticException
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            // Division by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("ArithmeticException handled: Division by zero.");
        }
    }
}
