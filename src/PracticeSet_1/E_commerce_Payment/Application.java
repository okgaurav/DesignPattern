package PracticeSet_1.E_commerce_Payment;

public abstract class Application {
    PaymentType paymentType;
    public Application(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    abstract  void setPaymentType();
}
