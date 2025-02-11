package PracticeSet_1.E_commerce_Payment;

public class Flipkart extends Application {

    public Flipkart(PaymentType paymentType) {
        super(paymentType);
    }

    @Override
    void setPaymentType() {
        paymentType.pay();
    }
}
