class program32 {
    public static void main(String[] args) {

        try {
            Exception e = new Exception("Original Exception");

            throw new Exception("New Exception", e);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }
}