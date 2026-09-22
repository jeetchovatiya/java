class program34 {

    static class Inner {
        void display() {
            System.out.println("This is a Static Inner Class");
        }
    }

    public static void main(String[] args) {
        program34.Inner obj = new program34.Inner();
        obj.display();
    }
}