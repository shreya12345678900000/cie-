import java.util.Scanner;

public class Fibonacci {

    // Method to generate and print the Fibonacci series
    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        if (n == 1) {
            System.out.println(first);
            return;
        }

        System.out.print(first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println(); // Move to the next line after printing the series
    }

  public static void main(String[] args) {
    if (args.length < 1) {
        System.out.println("Usage: java Fibonacci <number_of_terms>");
        return;
    }

    try {
        int n = Integer.parseInt(args[0]);
        generateFibonacci(n);
    } catch (NumberFormatException e) {
        System.out.println("Please enter a valid integer.");
    }
}
