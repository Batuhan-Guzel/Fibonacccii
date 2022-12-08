public class BasicPrimeNumberChecker implements PrimeNumberChecker {
    @Override
    public boolean isPrime(int number) {
        // This method follows the Single Responsibility Principle because it has a single, well-defined purpose:
        // to check whether a given number is prime or not.
        // This class follows the Single Responsibility Principle because it has a single, well-defined purpose:
        // to check whether a given number is prime or not using a basic algorithm.

        // This class follows the Open/Closed Principle because it is open for extension (by implementing the
        // PrimeNumberChecker interface) and closed for modification (by not changing the code of the isPrime method).
        if (number <= 1) return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0) return false;
        return true;
    }
}