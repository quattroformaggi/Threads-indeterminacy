/**
 * Threads indeterminacy;
 * @author quattroformaggi
 */

class Main
{
    public static final int N = 7_000_000;
    public static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread th0 = new Thread(new Runnable()
        {
            public void run()
            { for(int k = 0; k < N; k++) i++; }
        });
        th0.start();

        // Thread th1 = new Thread(new Runnable()
        // {
        //     public void run()
        //     { for(int k = 0; k < N; k++) i++; }
        // });
        // th1.start();

        // th0.join();
        // th1.join();
        Thread.sleep(1);
        System.out.println(i);
        System.out.println(Thread.activeCount() + " active threads");
    }
}