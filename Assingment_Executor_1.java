import java.util.concurrent.*;

public class ParallelNumberCalculator {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to calculate factorial
    public static long factorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate square
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int number = 5;

        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<Boolean> primeFuture =
                CompletableFuture.supplyAsync(() -> isPrime(number), executor);

        CompletableFuture<Long> factorialFuture =
                CompletableFuture.supplyAsync(() -> factorial(number), executor);

        CompletableFuture<Integer> squareFuture =
                CompletableFuture.supplyAsync(() -> square(number), executor);

        // Wait for all tasks to complete
        CompletableFuture.allOf(primeFuture, factorialFuture, squareFuture).join();

        System.out.println("Prime: " + primeFuture.join());
        System.out.println("Factorial: " + factorialFuture.join());
        System.out.println("Square: " + squareFuture.join());

        executor.shutdown();
    }
}