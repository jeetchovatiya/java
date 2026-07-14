public class OddEvenCommandLine {
    public static void main(String[] args) {
        // Check if the user provided an argument
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            System.out.println("Usage: java OddEvenCommandLine <number>");
            return;
        }

        try {
            // Convert the first command line argument string into an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is divisible by 2
            if (number % 2 == 0) {
                System.out.println(number + " is an EVEN number.");
            } else {
                System.out.println(number + " is an ODD number.");
            }
        } catch (NumberFormatException e) {
            // Handle cases where the input is not a valid integer
            System.out.println("Error: '" + args[0] + "' is not a valid integer.");
        }
    }
}
