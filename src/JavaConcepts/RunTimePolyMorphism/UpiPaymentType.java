package JavaConcepts.RunTimePolyMorphism;

import java.util.Scanner;

public class UpiPaymentType implements PaymentType{
    private String upiId;
    private Integer upiPin;
    @Override
    public void processPayment() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("UPI Payment is Initiated");
        System.out.println("Enter your UPI");
        upiId = scanner.next();
        System.out.println("Enter pin of your UPI");
        upiPin = scanner.nextInt();
        System.out.println("Payment processed with UpiId"+ upiId);
    }
}
