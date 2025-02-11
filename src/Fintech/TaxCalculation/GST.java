package Fintech.TaxCalculation;

public class GST extends Tax {
    BaseAmount amount;

    public GST(BaseAmount amount) {
        this.amount = amount;
    }

    @Override
    public Number calculate() {
        return amount.calculate().doubleValue()*1.05;
    }
}
