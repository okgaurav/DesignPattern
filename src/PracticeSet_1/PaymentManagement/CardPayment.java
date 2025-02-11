package PracticeSet_1.PaymentManagement;

public class CardPayment implements Payment{

    @Override
    public void initiate() {
        System.out.println("Card Payment Initiated");
    }
}
