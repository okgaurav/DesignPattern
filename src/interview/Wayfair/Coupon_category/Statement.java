package interview.Wayfair.Coupon_category;

import java.time.LocalDate;
import java.util.*;

class Coupon {
   public  String CategoryName;
    public String dateModified;

    public String getCategoryName() {
        return CategoryName;
    }

    public Coupon setCategoryName(String categoryName) {
        CategoryName = categoryName;
        return this;
    }

    public String getDateModified() {
        return dateModified;
    }

    public Coupon setDateModified(String dateModified) {
        this.dateModified = dateModified;
        return this;
    }

    public Coupon(String categoryName, String dateModified) {
        CategoryName = categoryName;
        this.dateModified = dateModified;
    }
}
public class Statement {
    Map<String, List<Coupon>> coupons = new HashMap<>();
    Map<String, String> parentCoupons = new HashMap<>();
    public void initCoupons(){

        coupons.put("Comforter Sets",  List.of (new Coupon("Comforters Sale", "2020-01-01"), new Coupon("Best Bedding Bargains", "2019-01-01")));
        coupons.put("Bedding", List.of (new Coupon("Savings on Bedding", "2019-01-01"), new Coupon("Best Bedding Bargains", "2019-01-01")));
        coupons.put("Bed & Bath", List.of(new Coupon("Bed & Bath extravaganza", "2019-01-01"), new Coupon("Big Savings for Bed & Bath", "2030-01-01"), new Coupon("Low price for Bed & Bath", "2018-01-01")));


        parentCoupons.put("Comforter Sets", "Bedding");
        parentCoupons.put("Bedding", "Bed & Bath");
        parentCoupons.put("Bed & Bath", null);
        parentCoupons.put("Soap Dispensers", "Bathroom Accessories");
        parentCoupons.put("Bathroom Accessories", "Bed & Bath");
        parentCoupons.put("Toy Organizers", "Baby And Kids");
        parentCoupons.put("Baby And Kids", null);
    }
//    public String firstBestCoupon(String categoryName){
//        return  coupons.get(categoryName);
//    }


    public String secondBestCoupon(String categoryName){
        return (coupons.get(categoryName).stream().filter(a-> a.dateModified.compareTo(LocalDate.now().toString())<0) .max(Comparator.comparing(Coupon::getDateModified)).get().CategoryName);
    }

    public String parent(String category){
        String ans = secondBestCoupon(category);
        while (ans!=null){
                ans = parentCoupons.get(ans);
        }
            return ans;
    }
    public static void main(String[] args) {
        Statement statement = new Statement();
        statement.initCoupons();
        String ques = "Comforter Sets";
       String ans=  Optional.of(statement.secondBestCoupon(ques)).orElse(
                statement.secondBestCoupon(statement.parent(ques)));
        //        System.out.println(statement.firstBestCoupon("Comforter Sets"));
        System.out.println(ans);
    }
}
