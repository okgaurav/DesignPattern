package ObserverPattern.observer;

import ObserverPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable stockObservable; //Iphone, macbook, S23

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sentEmail(emailId, "product is in stock Hurry");
    }
   void sentEmail(String emailId, String message){
        System.out.println("Email sent to "+emailId);
    }
}
