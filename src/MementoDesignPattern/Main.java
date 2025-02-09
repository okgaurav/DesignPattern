package MementoDesignPattern;

import DSA.Graph.ConnectedComponents;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        //initiate state of Object
        Originator originator = new Originator(5,10);

        //save it
        ConfigureMomento configureMomento = originator.createMemento();
        careTaker.addMemento(configureMomento);

        originator.setHeight(25).setWeight(50);

        ConfigureMomento configureMomento2 = originator.createMemento();

        careTaker.addMemento(configureMomento2);

        originator.setWeight(55).setHeight(5);

        System.out.println(originator.getHeight()+"  "+ originator.getWeight());

        ConfigureMomento configureMomento3 = careTaker.undo();
        originator.restoreMemento(configureMomento3);

        System.out.println(originator.getHeight()+"  "+ originator.getWeight());

        ConfigureMomento configureMomento4 = careTaker.undo();
        originator.restoreMemento(configureMomento4);

        System.out.println(originator.getHeight()+"  "+ originator.getWeight());
    }
}
