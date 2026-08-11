interface InterfaceA {
    void methodA();
}

interface pro12 extends InterfaceA {
    void methodB();
}

class MyClass implements pro12 {
    public void methodA() {
        System.out.println("Method A from parent interface");
    }

    public void methodB() {
        System.out.println("Method B from child interface");
    }
}

class Main {
    public static void main(String[] args) {
        pro12 obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}