class program22 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // Causes ArithmeticException

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }
        finally {
            System.out.println("Finally block is executed.");
        }
    }
}
