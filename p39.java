class p39 extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String args[])
    {
        p39 t = new p39();
        t.start();
    }
}