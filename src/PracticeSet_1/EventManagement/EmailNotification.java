package PracticeSet_1.EventManagement;

public class EmailNotification implements Notification{
    @Override
    public void initiate() {
        System.out.println("EMAIL send!!!");
    }
}
