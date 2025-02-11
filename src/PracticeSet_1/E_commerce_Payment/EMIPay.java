package PracticeSet_1.E_commerce_Payment;

public class EMIPay implements  PaymentType{
    @Override
    public void pay() {
        System.out.println("Proceeding with EMI Payment, connecting with Bank.......3.......2......1");
        System.out.println("Be ready with PAN card and CIBIL report");
    }
}
