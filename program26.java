class program26 {
    public static void main(String args[]) {
        try {
            throw new ArithmeticException("Custom Exception");
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}