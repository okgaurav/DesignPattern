package Fintech.ForeignCurrency;

public class Runner {
    public static void main(String[] args) {
        IFeesType feesType = new ClientReference();
        ForeignExchange foreignExchange = new BookingCreditTransfer(feesType);
        System.out.println(foreignExchange.calculateSale(1000));
    }
}
