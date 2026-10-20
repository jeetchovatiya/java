
class p43 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(getName() + " : " + i);
        }
    }

    public static void main(String args[]) throws InterruptedException
    {
        p43 t1 = new p43();
        p43 t2 = new p43();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Both threads completed");
    }
}
