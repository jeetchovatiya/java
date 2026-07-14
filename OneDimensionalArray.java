import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.util.in);

        // 1. Ask the user for the size of the array
        System.out.print("Enter the number of elements you want to store: ");
        int size = scanner.nextInt();

        // 2. Declare and instantiate the 1D array
        int[] numbers = new int[size];

        // 3. Store elements in the array using a loop
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Display the array elements using a loop
        System.out.println("\n--- Displaying 1D Array Elements ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " contains value: " + numbers[i]);
        }

        // 5. Calculate and display the sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of all array elements: " + sum);

        scanner.close();
    }
}
