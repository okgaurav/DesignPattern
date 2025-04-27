package JavaConcepts.RunTimePolyMorphism;

import java.beans.Transient;
import java.util.Scanner;

public class CardPaymentType implements PaymentType{
    private Long cardNo;
    private Integer cvvPin;
    @Override
    public void processPayment() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Card Payment is Initiated");
        System.out.println("Enter Last 4 digit of your card");
        cardNo = scanner.nextLong();
        System.out.println("Enter CVV of your card");
        cvvPin = scanner.nextInt();
        System.out.println("Payment processed with cardNo"+cardNo);
    }
}
