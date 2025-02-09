package PracticeSet_1.EventManagement;

public class SMSNotification implements Notification{
    @Override
    public void initiate() {
        System.out.println("SMS send!!!");
    }
}
