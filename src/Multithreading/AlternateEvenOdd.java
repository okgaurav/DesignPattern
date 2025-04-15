package Multithreading;

public class AlternateEvenOdd {
    private int range;
    private int num = 1;
    public AlternateEvenOdd(int range) {
        this.range = range;
    }

    public static void main(String[] args) {
        AlternateEvenOdd alternateEvenOdd = new AlternateEvenOdd(20);
        Thread t1 = new Thread(() -> alternateEvenOdd.printEven(1), "OddThread");
        Thread t2 = new Thread(() -> alternateEvenOdd.printEven(0), "EvenThread");
        t1.start();
        t2.start();
    }

    synchronized void printEven(int rem) {
        while (num <= range) {
            while (num % 2 != rem) { //if odd wait
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "\t" + num);
            num++;
            notify();
        }
    }
}
