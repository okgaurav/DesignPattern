package PracticeSet_1.EventManagement;

public class Runner {
    public static void main(String[] args) {
        /*
        * This is combination of factory Pattern and Observer Pattern
        */
        Store store = new AppleStore();
        IUser user=new AppleUser(store, "sms");
        IUser user2=new AppleUser(store, "sms");
        IUser user3=new AppleUser(store, "email");
        store.setData(10);

    }
}
