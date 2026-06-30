import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);

        // 1. Prompt the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // 2. Create an integer array of that size
        int[] numbers = new int[size];

        // 3. Prompt the user to enter each array element
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Guard clause for empty array input
        if (size == 0) {
            System.out.println("\nThe array is empty.");
            scanner.close();
            return;
        }

        // 4. Search through the array to find the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // 5. Display the results clearly
        System.out.println("\n--- Results ---");
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index: " + maxIndex);

        scanner.close();
    }
}