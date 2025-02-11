package Fintech.Insurance;

public class TravelInsurance extends InsuranceDecorator{
    private FinancialProduct financialProduct;

    public TravelInsurance(FinancialProduct financialProduct) {
        this.financialProduct = financialProduct;
    }

    @Override
    public String getDescription() {
        return "Added Travel Insurance";
    }

    @Override
    public Double getCost() {
        return financialProduct.getCost()+100.1;
    }
}
