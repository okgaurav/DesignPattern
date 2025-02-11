package Fintech.Insurance;

public class Runner {
    public static void main(String[] args) {
        FinancialProduct financialProduct=new Card();
        System.out.println("Cost of card:  "+financialProduct.getCost());
        financialProduct = new CardInsurance(financialProduct);
        System.out.println("Added Cost of card Insurance:  "+financialProduct.getCost());
        financialProduct = new TravelInsurance(financialProduct);
        System.out.println("Added Cost of card Insurance along with Travel Insurance:  "+financialProduct.getCost());
        financialProduct = new CardInsurance(financialProduct);
        System.out.println("Added Cost of 2 card Insurance along with Travel Insurance:  "+financialProduct.getCost());
    }
}
