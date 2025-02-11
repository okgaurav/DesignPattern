package PracticeSet_1.PaymentManagement;

public class CryptoPayment implements Payment{

    @Override
    public void initiate() {
        System.out.println("Crypto Payment Initiated");
    }
}
