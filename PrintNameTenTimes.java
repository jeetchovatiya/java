import java.util.Scanner;

public class PrintNameTenTimes {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("\nPrinting your name 10 times:");

        // Loop 10 times (from i = 1 to 10) to print the name
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }

        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}
