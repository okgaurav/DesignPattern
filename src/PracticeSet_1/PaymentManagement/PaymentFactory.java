package PracticeSet_1.PaymentManagement;

public class PaymentFactory {
    Payment initiate(String type) {
        return switch (type.toUpperCase()) {
            case "CARD" -> new CardPayment();
            case "EMI" -> new EMIPayment();
            case "CRYPTO" -> new CryptoPayment();
            default -> throw new IllegalStateException("Unexpected value: " + type.toUpperCase());
        };
    }
}
