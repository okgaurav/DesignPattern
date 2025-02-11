package Fintech.TaxCalculation;

public class VAT extends Tax {
    BaseAmount amount;

    public VAT(BaseAmount amount) {
        this.amount = amount;
    }

    @Override
    public Number calculate() {
        return amount.calculate().doubleValue()*1.14;
    }
}
