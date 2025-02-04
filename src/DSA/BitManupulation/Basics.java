package DSA.BitManupulation;

public class Basics {
    public static void main(String[] args) {
        int n=10;
        while(n!=0){
            n=n^n; // 1010 & 1000
            System.out.print(n+"  "+(3&1));
        }
    }
}
