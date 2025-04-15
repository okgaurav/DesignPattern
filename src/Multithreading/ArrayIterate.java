package Multithreading;

import java.util.Vector;

public class ArrayIterate {
    private final Vector<Integer> vec;
    private int sum = 0;  // Shared sum
    private int index = 0; // Shared index

    public ArrayIterate(Vector<Integer> vec) {
        this.vec = vec;
    }

    synchronized void arraySum() {
        while (index < vec.size()) {
            int value = vec.get(index);
            System.out.println(Thread.currentThread().getName() + " adding: " + value);
            sum += value;
            index++;

            notify();  // Notify the other thread
            if (index < vec.size()) { // Prevent unnecessary wait at the end
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        ArrayIterate iterate = new ArrayIterate(vec);

        Thread thread1 = new Thread(iterate::arraySum, "Thread-1");
        Thread thread2 = new Thread(iterate::arraySum, "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Sum: " + iterate.sum);
    }
}
