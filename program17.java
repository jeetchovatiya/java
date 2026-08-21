interface A {
    void display();
}

class B implements A {

    public void display() {
        System.out.println("Interface method implemented.");
    }
}

public class program17 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}