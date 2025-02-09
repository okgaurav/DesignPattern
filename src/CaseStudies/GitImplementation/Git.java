package CaseStudies.GitImplementation;

import java.util.Stack;

public class Git {
    Stack<Stash> stack = new Stack<>();
    public void addStash(Stash stash){
        stack.add(stash);
    }

    public Stash pop(){
        if(!stack.empty()){
            return stack.pop();
        }
        return null;
    }

}
