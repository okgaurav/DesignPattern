package PracticeSet_1.EventManagement;

import java.util.ArrayList;
import java.util.List;

public class AppleStore implements   Store{
    List<IUser> userList;
    int quantity;
    public AppleStore() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void addUsers(IUser user) {
        userList.add(user);
    }

    @Override
    public void removeUsers(IUser user) {
        userList.remove(user);
    }

    @Override
    public void sendNotification() {
        for (IUser user: userList){
            user.update();
        }
    }

    @Override
    public void setData(int quantity) {
        this.quantity = quantity;
        sendNotification();
    }
}
