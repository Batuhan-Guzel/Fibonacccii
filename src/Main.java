import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // This class follows the Single Responsibility Principle because it has a single, well-defined purpose:
    // to provide a simple user interface for printing the prime numbers up to a given number.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        int number = Integer.parseInt(reader.readLine());

        // This class uses the PrimeNumberChecker interface to determine whether a number is prime or not,
        // following the Dependency Inversion Principle, which states that high-level modules should not
        // depend on low-level modules, but rather both should depend on abstractions.
        PrimeNumberChecker checker = new BasicPrimeNumberChecker();

        // This class uses the PrimeNumberPrinter class to print the prime numbers,
        // following the Dependency Inversion Principle, which states that high-level modules should not
        // depend on low-level modules, but rather both should depend on abstractions.
        PrimeNumberPrinter printer = new PrimeNumberPrinter(checker);
        printer.printPrimeNumbers(number);
    }
}

