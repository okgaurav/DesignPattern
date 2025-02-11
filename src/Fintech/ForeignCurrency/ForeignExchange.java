package Fintech.ForeignCurrency;

public interface ForeignExchange {
    Number calculateSale(Number amount);
    Number calculatePurchase(Number amount);
}
