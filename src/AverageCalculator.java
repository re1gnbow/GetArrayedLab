import java.util.Arrays; // Import statement for potential future use (not strictly necessary for this task)

public class AverageCalculator {

    public static void main(String[] args) {
        // Example array of double values
        double[] dataPoints = {5.0, 3.5, 8.2, 1.0, 9.8, 4.5};

        // Calculate and print the average
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Static method to calculate the average of an array of double values
    public static double getAverage(double values[]) {
        double sum = 0.0;

        // Calculate the sum of the values
        for (double value : values) {
            sum += value;
        }

        // Return the average
        return sum / values.length;
    }
}