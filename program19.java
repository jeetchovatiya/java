class A {
    void display() {
        System.out.println("This is class A");
    }
}

class B extends A {

    void display() {
        System.out.println("This is class B");
    }
}

public class program19 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}