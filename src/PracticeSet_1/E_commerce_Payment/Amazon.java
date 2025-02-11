package PracticeSet_1.E_commerce_Payment;

public class Amazon extends Application {

    public Amazon(PaymentType paymentType) {
        super(paymentType);
    }

    @Override
    void setPaymentType() {
        paymentType.pay();
    }
}
