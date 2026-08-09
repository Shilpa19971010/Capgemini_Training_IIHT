import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudentMarksProcessing {

    public static void main(String[] args) {

        String studentName = "Rahul";
        int[] marks = {80, 75, 90};

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Calculate total marks
        CompletableFuture<Integer> totalFuture =
                CompletableFuture.supplyAsync(() ->
                        Arrays.stream(marks).sum(), executor);

        // Calculate average marks
        CompletableFuture<Double> averageFuture =
                CompletableFuture.supplyAsync(() ->
                        Arrays.stream(marks).average().orElse(0.0), executor);

        // Find highest mark
        CompletableFuture<Integer> highestFuture =
                CompletableFuture.supplyAsync(() ->
                        Arrays.stream(marks).max().orElse(0), executor);

        // Determine PASS/FAIL
        CompletableFuture<String> resultFuture =
                CompletableFuture.supplyAsync(() -> {
                    boolean pass = Arrays.stream(marks)
                                         .allMatch(mark -> mark >= 35);
                    return pass ? "PASS" : "FAIL";
                }, executor);

        // Wait for all tasks to complete
        CompletableFuture.allOf(
                totalFuture,
                averageFuture,
                highestFuture,
                resultFuture
        ).join();

        // Display results
        System.out.println("Student: " + studentName);
        System.out.println("Total: " + totalFuture.join());
        System.out.printf("Average: %.2f%n", averageFuture.join());
        System.out.println("Highest: " + highestFuture.join());
        System.out.println("Result: " + resultFuture.join());

        executor.shutdown();
    }
}