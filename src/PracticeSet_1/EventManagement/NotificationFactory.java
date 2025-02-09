package PracticeSet_1.EventManagement;

import PracticeSet_1.EventManagement.Notification;
import PracticeSet_1.EventManagement.SMSNotification;

public class NotificationFactory {
    Notification create(String type){
        return switch (type.toUpperCase()) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            default -> null;
        };
    }
}
