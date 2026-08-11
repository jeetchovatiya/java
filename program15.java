// program15.java

class A {
    void displayA() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("This is Class B");
    }
}

class C extends A {
    void displayC() {
        System.out.println("This is Class C");
    }
}

public class program15 {
    public static void main(String[] args) {

        B obj1 = new B();
        C obj2 = new C();

        System.out.println("Object of Class B:");
        obj1.displayA();
        obj1.displayB();

        System.out.println();

        System.out.println("Object of Class C:");
        obj2.displayA();
        obj2.displayC();
    }
}