package Fintech.ForeignCurrency;

public class ClientRate implements IFeesType {

    @Override
    public Number saleOperation(Number amount) {
        return amount.doubleValue()*0.05;
    }

    @Override
    public Number purchaseOperation(Number amount) {
        return amount.doubleValue()*0.7;
    }
}
