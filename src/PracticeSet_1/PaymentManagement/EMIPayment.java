package PracticeSet_1.PaymentManagement;

public class EMIPayment implements Payment{

    @Override
    public void initiate() {
        System.out.println("contact Bank for EMI Payments");
    }
}
