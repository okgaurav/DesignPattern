package PracticeSet_1.Controller;

public class SetAcTemp implements Command{
    Receiver receiver;
    public SetAcTemp(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Execute() {
        receiver.setTemp(16);
    }
}
