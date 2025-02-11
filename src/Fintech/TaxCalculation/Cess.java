package Fintech.TaxCalculation;

public class Cess extends Tax {
    BaseAmount amount;

    public Cess(BaseAmount amount) {
        this.amount = amount;
    }

    @Override
    public Number calculate() {
        return amount.calculate().doubleValue()*1.02;
    }
}
