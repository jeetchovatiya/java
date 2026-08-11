interface pro11 {
    void makeSound();
}

class Dog implements pro11 {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat implements pro11 {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class main {
    public static void main(String[] args) {
        pro11 myDog = new Dog();
        pro11 myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}