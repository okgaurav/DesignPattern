package PracticeSet_1.Controller;

public class TurnOnAC implements Command{
    Receiver receiver;

    public TurnOnAC(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Execute() {
        this.receiver.turnOn();
    }
}
