
class p40 implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String args[])
    {
        p40 obj = new p40();
        Thread t = new Thread(obj);
        t.start();
    }
}
