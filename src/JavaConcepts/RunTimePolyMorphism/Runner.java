package JavaConcepts.RunTimePolyMorphism;

import java.util.Scanner;
/*
This is a demonstration of runtime polymorphism using a simple Runner class
where the user selects a payment type (Card or UPI), and based on that,
an appropriate class (CardPaymentType or UpiPaymentType) processes the payment.
* */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentType paymentType;
        System.out.println("Enter your Payment Type \n1-Card\n2-UPI");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                paymentType = new CardPaymentType();
                paymentType.processPayment();
            }
            case 2 -> {
                paymentType = new UpiPaymentType();
                paymentType.processPayment();
            }
        }
    }
}
