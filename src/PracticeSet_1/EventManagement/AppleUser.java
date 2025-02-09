package PracticeSet_1.EventManagement;

public class AppleUser implements IUser{
    private Store store;
    String notificationType;

    public AppleUser(Store store, String notificationType) {
        this.notificationType = notificationType;
        this.store = store;
        store.addUsers(this);
    }

    @Override
    public void update() {
        Notification type = new NotificationFactory().create(notificationType);
        type.initiate();
    }

}
