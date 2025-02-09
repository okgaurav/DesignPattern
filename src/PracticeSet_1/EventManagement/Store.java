package PracticeSet_1.EventManagement;

import java.util.List;

public interface Store {
    void addUsers(IUser user);
    void removeUsers(IUser user);
    void sendNotification();
    void setData(int q);
}
