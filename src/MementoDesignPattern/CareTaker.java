package MementoDesignPattern;

import java.util.Stack;

public class CareTaker {
    Stack<ConfigureMomento>stack = new Stack<>();
    public void addMemento(ConfigureMomento configureMomento){
        stack.add(configureMomento);
    }
    public ConfigureMomento undo(){
        if(!stack.empty()){
            return stack.pop();
        }
        return null;
    }
}
