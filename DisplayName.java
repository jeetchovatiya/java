import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get name from the user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Display the name
        System.out.println("Your name is: " + name);

        sc.close();
    }
}
