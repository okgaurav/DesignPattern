package ObserverPattern.observable;

import ObserverPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);

    void notifySubscribers();
    void setStockCount(int newStock);
    int getStockCount();
}
