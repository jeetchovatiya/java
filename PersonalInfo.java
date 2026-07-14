import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input personal information
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter your Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter your Address: ");
        String address = sc.nextLine();

        // Display personal information
        System.out.println("\n--- Personal Information ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Gender  : " + gender);
        System.out.println("Address : " + address);

        sc.close();
    }
}
