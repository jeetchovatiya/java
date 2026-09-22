class MyException extends Exception {

    MyException(String message) {
        super(message);
    }
}

class program30 {
    public static void main(String[] args) {

        try {
            throw new MyException("This is my custom exception");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}