

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}


public class RunnableThread {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        
        Runnable obj1 = () -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1), t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // .join(), makes the thread wait for the MAIN thread also to join it
        
        System.out.println(c.count);


        // o/p may or may not be 2000, as if t1 & t2 may hit race condition and just update once rather than twice
        // to make only 1 thread call increment() once = 'synchronized' keyword
    }
}
