package PracticeSet_1.Controller;

public class Runner {
    public static void main(String[] args) {
        Receiver receiver=new Receiver();
        Command command=new TurnOffAC(receiver);
        command.Execute();
    }
}
