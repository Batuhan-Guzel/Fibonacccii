public class PrimeNumberPrinter {
    // This class follows the Single Responsibility Principle because it has a single, well-defined purpose:
    // to print the prime numbers up to a given number.

    private final PrimeNumberChecker checker;

    public PrimeNumberPrinter(PrimeNumberChecker checker) {
        this.checker = checker;
    }

    public void printPrimeNumbers(int number) {
        // This method follows the Single Responsibility Principle because it has a single, well-defined purpose:
        // to print the prime numbers up to a given number.

        System.out.println("Prime numbers: ");
        for (int i = 1; i <= number; i++)
            if (checker.isPrime(i))
                System.out.println(i);
    }
}