package EXCEPTIONS;

// Program to demonstrate ArrayIndexOutOfBoundsException
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            // Accessing invalid index in an array
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException handled: Invalid index accessed.");
        }
    }
}
