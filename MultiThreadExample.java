import java.util.*;

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MultiThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 enter");
        MyThread t2 = new MyThread("Thread 2 enter");

        t1.start();
        t2.start();
    }
}
