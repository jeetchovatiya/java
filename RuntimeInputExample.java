import java.util.Scanner; // Step 1: Import the Scanner class

public class RuntimeInputExample {
    public static void main(String[] args) {

        // Step 2: Create a Scanner object for reading standard input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Capture Different Runtime Values ---");

        // 1. Getting a String (Full line of text)
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // 2. Getting an Integer (Whole number)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 3. Getting a Double (Decimal number)
        System.out.print("Enter your GPA or salary: ");
        double gpa = scanner.nextDouble();

        // 4. Getting a Boolean (true/false)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        /*
         * CRITICAL BUFFER CLEARING STEP:
         * Numeric methods like nextInt() and nextDouble() do not consume the 'Enter' key (newline character).
         * We must consume it manually before reading another String/Character via nextLine().
         */
        scanner.nextLine();

        // 5. Getting a single Character
        System.out.print("Enter your favorite letter/grade (A/B/C): ");
        char grade = scanner.nextLine().charAt(0);

        // Displaying all captured values back to the console
        System.out.println("\n--- Displaying Captured Values ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);

        // Step 3: Close the scanner to avoid resource leaks
        scanner.close();
    }
}
