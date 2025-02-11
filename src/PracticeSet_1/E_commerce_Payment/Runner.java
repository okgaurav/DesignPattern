package PracticeSet_1.E_commerce_Payment;

public class Runner {
    public static void main(String[] args) {
        PaymentType type = new UPIPay();
        Application application = new Amazon(type);
        application.setPaymentType();
    }
}
