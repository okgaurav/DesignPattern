package PracticeSet_1.PaymentManagement;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String s;
        Scanner sc =new Scanner(System.in);
        s=sc.next();
        PaymentFactory paymentFactory=new PaymentFactory();
        paymentFactory.initiate(s).initiate();
    }
}
