package PracticeSet_1.E_commerce_Payment;

public class CardPay implements  PaymentType{
    @Override
    public void pay() {
        System.out.println("Proceeding with Card Payment System.......3.......2......1");
        System.out.println("Be ready with Card Number and Cvv code");
    }
}
