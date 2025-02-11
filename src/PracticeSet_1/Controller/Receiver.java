package PracticeSet_1.Controller;

public class Receiver {
    boolean isOn;
    int temp;

    public Receiver() {
        temp = 24;
        isOn=false;
    }

    public void turnOn(){
        System.out.println("AC is On");
        isOn=true;
    }
    public void tunOff(){
        System.out.println("AC is Off");
        isOn=false;
    }

    public void setTemp(int temp){
        this.temp=temp;
    }
}
