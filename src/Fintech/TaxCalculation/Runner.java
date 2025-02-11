package Fintech.TaxCalculation;

public class Runner {
    public static void main(String[] args) {
        BaseAmount baseAmount= new Transaction();
        System.out.println("Transaction Amount:  "+baseAmount.calculate());
        baseAmount=new GST(baseAmount);
        System.out.println("Including GST:  "+baseAmount.calculate());
        baseAmount=new VAT(baseAmount);
        System.out.println("Including VAT:  "+baseAmount.calculate());
        baseAmount=new Cess(baseAmount);
        System.out.println("Including CESS:  "+baseAmount.calculate());
    }
}
