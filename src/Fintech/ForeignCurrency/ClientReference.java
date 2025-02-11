package Fintech.ForeignCurrency;

public class ClientReference implements IFeesType {

    @Override
    public Number saleOperation(Number amount) {
        return amount.doubleValue()*0.015;
    }

    @Override
    public Number purchaseOperation(Number amount) {
        return amount.doubleValue()*0.17;
    }
}
