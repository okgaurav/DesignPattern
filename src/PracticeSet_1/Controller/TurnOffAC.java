package PracticeSet_1.Controller;

public class TurnOffAC implements Command{
    Receiver receiver;
    public TurnOffAC(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Execute() {
        receiver.tunOff();
    }
}
