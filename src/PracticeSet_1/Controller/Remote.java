package PracticeSet_1.Controller;

public class Remote {
    Command command;
    public Remote(Command command) {
        this.command = command;
    }
    void setCommand(Command command){
        this.command=command;
    }
    void pressButton(){
        command.Execute();
    }
}
