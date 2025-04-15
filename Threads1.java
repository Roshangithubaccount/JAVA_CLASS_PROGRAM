package THREADS;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread is Starting...");
        int i = 0;
        while (i < 5) {
            System.out.println("Thread is starting..." + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread is not Starting...." + e);
            }
            i++;
        }
    }
}

public class Threads1{
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start(); // starts the thread
    }
}

