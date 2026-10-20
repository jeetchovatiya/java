
class Table
{
    synchronized void printTable(int n)
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(n * i);
        }
    }
}

class p42 extends Thread
{
    Table t;
    int n;

    p42(Table t, int n)
    {
        this.t = t;
        this.n = n;
    }

    public void run()
    {
        t.printTable(n);
    }

    public static void main(String args[])
    {
        Table obj = new Table();

        p42 t1 = new p42(obj, 2);
        p42 t2 = new p42(obj, 5);

        t1.start();
        t2.start();
    }
}
