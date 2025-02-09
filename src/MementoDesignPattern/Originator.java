package MementoDesignPattern;

public class Originator {
    int height, weight;

    public Originator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public Originator setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Originator setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public ConfigureMomento createMemento() {
        //take a snapshot and returns it
        return new ConfigureMomento(this.height, this.weight);
    }

    public void restoreMemento(ConfigureMomento configureMomento) {
        this.height = configureMomento.height;
        this.weight = configureMomento.weight;
    }
}
