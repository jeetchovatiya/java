import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks
        System.out.print("Enter student's total marks (0 - 100): ");
        double marks = scanner.nextDouble();

        // Check for valid marks range
        if (marks < 0 || marks > 100) {
            System.out.println("Error: Invalid marks! Please enter a value between 0 and 100.");
        } else {
            char grade;
            String result;

            // Determine grade using IF condition logic
            if (marks >= 90) {
                grade = 'A';
                result = "PASS";
            } else if (marks >= 75) {
                grade = 'B';
                result = "PASS";
            } else if (marks >= 50) {
                grade = 'C';
                result = "PASS";
            } else if (marks >= 35) {
                grade = 'D';
                result = "PASS";
            } else {
                grade = 'F';
                result = "FAIL";
            }

            // Print the final result and grade
            System.out.println("\n--- Student Result ---");
            System.out.println("Marks obtained: " + marks);
            System.out.println("Final Status  : " + result);
            System.out.println("Assigned Grade: " + grade);
        }

        scanner.close();
    }
}
