package EXCEPTIONS;

// Program to demonstrate NullPointerException
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            // Accessing a null reference
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("NullPointerException handled: Null reference accessed.");
        }
    }
}
