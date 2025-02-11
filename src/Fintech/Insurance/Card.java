package Fintech.Insurance;

public class Card implements FinancialProduct{
    @Override
    public String getDescription() {
        return "MasterCard No. [1234 1452 4785] Exp. [01/29]";
    }

    @Override
    public Double getCost() {
        return 1000.0;
    }
}
