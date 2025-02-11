package Fintech.Insurance;

public class CardInsurance extends InsuranceDecorator{
    private FinancialProduct financialProduct;

    public CardInsurance(FinancialProduct financialProduct) {
        this.financialProduct = financialProduct;
    }

    @Override
    public String getDescription() {
        return "Added Card Insurance";
    }

    @Override
    public Double getCost() {
        return financialProduct.getCost()+120.5;
    }
}
