// program14.java

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

class C extends B {
    void displayC() {
        System.out.println("This is Class C");
    }
}

public class program14 {
    public static void main(String[] args) {
        C obj = new C();

        obj.displayA(); // Method from Class A
        obj.displayB(); // Method from Class B
        obj.displayC(); // Method from Class C
    }
}