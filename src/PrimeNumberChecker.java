public interface PrimeNumberChecker {
    // This interface follows the Single Responsibility Principle because it has a single, well-defined purpose:
    // to define a contract for a class that can check whether a given number is prime or not.

    boolean isPrime(int number);
}