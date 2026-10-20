
class p41 extends Thread
{
    public void run()
    {
        System.out.println("Thread name: " + getName());
        System.out.println("Thread priority: " + getPriority());
    }

    public static void main(String args[])
    {
        p41 t = new p41();

        t.setName("MyThread");
        t.setPriority(8);

        t.start();
    }
}
