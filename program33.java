class program33 {

    int number = 10;

    class Inner {
        void display() {
            System.out.println("Number = " + number);
        }
    }

    public static void main(String[] args) {

        program33 obj = new program33();

        program33.Inner in = obj.new Inner();

        in.display();
    }
}