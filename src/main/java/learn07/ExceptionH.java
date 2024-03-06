package learn07;

import java.util.Scanner;

public class ExceptionH{
    public static void main(String[] args) {
        // Declare resources inside the try-with-resources statement
        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
            if (i == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            if (10 / i == 1) {
                System.out.println("i is one");
            } else {
                System.out.println("i is not one");
            }
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            // Code that will always execute regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }
    }
}
