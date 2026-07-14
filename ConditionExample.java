public class ConditionExample {
    public static void main(String[] args) {

        // 1. Standard IF Condition
        int age = 20;
        if (age >= 18) {
            System.out.println("1. Standard IF: You are eligible to vote.");
        }

        // 2. IF-ELSE Condition
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("2. IF-ELSE: " + number + " is even.");
        } else {
            System.out.println("2. IF-ELSE: " + number + " is odd.");
        }

        // 3. IF-ELSE-IF Ladder
        int score = 85;
        if (score >= 90) {
            System.out.println("3. Ladder: Grade A");
        } else if (score >= 80) {
            System.out.println("3. Ladder: Grade B");
        } else if (score >= 70) {
            System.out.println("3. Ladder: Grade C");
        } else {
            System.out.println("3. Ladder: Grade F");
        }

        // 4. NESTED IF Condition
        boolean hasIdCard = true;
        int guestAge = 21;

        if (guestAge >= 18) {
            // This inner if statement only executes if the outer condition is true
            if (hasIdCard) {
                System.out.println("4. Nested IF: Entry allowed (Adult with ID).");
            } else {
                System.out.println("4. Nested IF: Entry denied (No ID card).");
            }
        }
    }
}
