interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {

    public void displayA() {
        System.out.println("Method of Interface A");
    }

    public void displayB() {
        System.out.println("Method of Interface B");
    }
}

public class program18 {
    public static void main(String[] args) {
        C obj = new C();

        obj.displayA();
        obj.displayB();
    }
}