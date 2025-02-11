package Fintech.ForeignCurrency;

public class BookingCreditTransfer implements ForeignExchange{
    IFeesType feesType;
    public BookingCreditTransfer(IFeesType feesType) {
        this.feesType = feesType;
    }
    @Override
    public Number calculateSale(Number amount) {
        return  amount.doubleValue() + feesType.saleOperation(amount).doubleValue();
    }

    @Override
    public Number calculatePurchase(Number amount) {
        return amount.doubleValue() - feesType.saleOperation(amount).doubleValue();
    }
}
