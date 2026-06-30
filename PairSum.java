import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);

        // 1. Prompt the user for the array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // 2. Accept each array element from the user
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // 3. Prompt the user to enter a Target Sum
        System.out.print("Enter the Target Sum to search for: ");
        int targetSum = scanner.nextInt();

        // 4. Use Brute Force (Nested Loops) to search for a matching pair
        boolean pairFound = false;

        System.out.println("\n--- Search Results ---");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    // 5. If a pair is found, display indices, values, and the equation
                    System.out.println("Pair Found!");
                    System.out.println("Indices  : [" + i + "] and [" + j + "]");
                    System.out.println("Values   : " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation : " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    pairFound = true;
                    
                    // Break out of the loops if you only want the first unique pair
                    break; 
                }
            }
            if (pairFound) break;
        }

        // 6. If no pair exists, print an appropriate message
        if (!pairFound) {
            System.out.println("No distinct pair exists in the array that sums up to " + targetSum + ".");
        }

        scanner.close();
    }
}