package ObserverPattern;

import ObserverPattern.observable.IphoneObservableImpl;
import ObserverPattern.observable.StockObservable;
import ObserverPattern.observer.EmailAlertObserverImpl;
import ObserverPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphone = new IphoneObservableImpl();
        NotificationAlertObserver observer1 =  new EmailAlertObserverImpl("gverma@gmail",iphone);
        NotificationAlertObserver observer2 =  new EmailAlertObserverImpl("badshahgv@gmail",iphone);
        iphone.add(observer1);
        iphone.add(observer2);
        iphone.setStockCount(10);
    }
}
