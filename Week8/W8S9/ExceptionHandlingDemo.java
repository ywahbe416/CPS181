package F25.CPS181.Week8.W8S9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates several exception handling patterns for SI Session Week 8, Session 9.
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===\n");

        demonstrateUncheckedException();
        demonstrateCheckedException();
        demonstrateMultiCatch();
        demonstrateFinally();
        demonstrateCustomException();
    }

    private static void demonstrateUncheckedException() {
        System.out.println("1. Unchecked exception (NumberFormatException)");
        String userInput = "abc"; // Pretend this came from a user
        try {
            int number = Integer.parseInt(userInput);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException ex) {
            System.out.println("Caught NumberFormatException: " + ex.getMessage());
        }
        System.out.println();
    }

    private static void demonstrateCheckedException() {
        System.out.println("2. Checked exception (IOException)");
        try (BufferedReader reader = new BufferedReader(new FileReader("missing-file.txt"))) {
            System.out.println(reader.readLine());
        } catch (FileNotFoundException ex) {
            System.out.println("Caught FileNotFoundException: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Caught IOException while reading: " + ex.getMessage());
        }
        System.out.println();
    }

    private static void demonstrateMultiCatch() {
        System.out.println("3. Multi-catch (ArrayIndexOutOfBoundsException | NullPointerException)");
        String[] data = { "apple", "banana" };
        try {
            String value = data[3].toUpperCase();
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
            System.out.println("Caught multi-catch exception: " + ex.getClass().getSimpleName());
        }
        System.out.println();
    }

    private static void demonstrateFinally() {
        System.out.println("4. Finally block execution");
        try {
            System.out.println("Inside try block");
            if (true) {
                throw new IllegalStateException("Something went wrong");
            }
        } catch (IllegalStateException ex) {
            System.out.println("Caught IllegalStateException: " + ex.getMessage());
        } finally {
            System.out.println("Finally block runs whether or not an exception occurs.");
        }
        System.out.println();
    }

    private static void demonstrateCustomException() {
        System.out.println("5. Custom exception (InvalidGradeException)");
        try {
            recordGrade(105);
        } catch (InvalidGradeException ex) {
            System.out.println("Caught InvalidGradeException: " + ex.getMessage());
        }
        System.out.println();
    }

    private static void recordGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException(grade);
        }
        System.out.println("Recorded grade: " + grade);
    }

    private static class InvalidGradeException extends Exception {
        InvalidGradeException(int invalidGrade) {
            super("Grade must be between 0 and 100. Received: " + invalidGrade);
        }
    }
}