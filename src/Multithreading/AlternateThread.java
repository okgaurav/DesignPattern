package Multithreading;
public class AlternateThread {
    private int count = 1;
    synchronized void count(){
        for(int i=1;i<5;i++){
            while (count!=1){
                try {
                    wait();
                }catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
            System.out.println("Thread 1");
            count=2;
            notify();
        }
    }
    synchronized void count2(){
        for(int i=1;i<5;i++){
            while (count!=2){
                try {
                    wait();
                }catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
            System.out.println("Thread 2");
            count=1;
            notify();
        }
    }
    public static void main(String[] args) {
        AlternateThread alternateThread = new AlternateThread();
        Thread t1=new Thread(()-> alternateThread.count());
        Thread t2=new Thread(()-> alternateThread.count2());
        t1.start();
        t2.start();
    }
}
