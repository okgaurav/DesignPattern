package PracticeSet_1.E_commerce_Payment;

public class UPIPay implements  PaymentType{
    @Override
    public void pay() {
        System.out.println("Proceeding with UPI Payment System.......3.......2......1");
        System.out.println("Be ready with UPI id and Transaction Pin");
    }
}
