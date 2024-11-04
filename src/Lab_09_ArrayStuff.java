import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        // Task 1: Declare an array of type int named dataPoints
        int[] dataPoints = new int[100];

        // Task 2: Initialize dataPoints array with random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; // Generates random values from 1 to 100
        }

        // Task 3: Display the dataPoints values with the format val1 | val2 | val3 ...
        System.out.println("Array dataPoints values:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + (i < dataPoints.length - 1 ? " | " : ""));
        }
        System.out.println(); // Newline for readability

        // Task 4: Calculate the sum and average, then display them
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("\nThe sum of the array values is: " + sum);
        System.out.println("The average of the array values is: " + average);

        // Task 5: Prompt the user for a value between 1 and 100
        int userValue = 0;
        do {
            System.out.print("\nEnter a value between 1 and 100: ");
            userValue = scanner.nextInt();
        } while (userValue < 1 || userValue > 100); // Repeat until a valid input is entered

        // Task 6: Count how many times the user's value is found in the array
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " appears " + count + " times in the array.");

        // Task 7: Find the first occurrence of the user's value and display the index
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index " + i + ".");
                found = true;
                break; // Exit the loop once the first occurrence is found
            }
        }
        if (!found) {
            System.out.println("The value " + userValue + " was not found in the array.");
        }
    }
}