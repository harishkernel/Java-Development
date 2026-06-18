
class A extends Thread{
    
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);    // wait for 10 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);    // wait for 10 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);  // suggesting scheduler to give max priority, depends on scheduler


        obj1.start();   // now 'obj1' is a thread, .start() looks for run() method (mandatory to have run())
        obj2.start();
    }

}
