// Program16.java


abstract class A {
    
    abstract void display();

    
    void show() {
        System.out.println("This is normal method.");
    }
}
class B extends A {

   
    void display() {
        System.out.println("This is abstract method.");
    }
}

public class program16 {
    public static void main(String[] args) {
        B obj = new B();

        obj.display();
        obj.show();
    }
}