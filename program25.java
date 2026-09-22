class program25 {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[10] = 50;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception Caught");
        }
        catch (Exception e) {
            System.out.println("General Exception Caught");
        }
    }
}