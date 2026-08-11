class A {
    private int num;

    public void setNum(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }
}

public class program21 {
    public static void main(String[] args) {
        A obj = new A();

        obj.setNum(100);
        System.out.println("Number = " + obj.getNum());
    }
}