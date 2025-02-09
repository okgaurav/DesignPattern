package MementoDesignPattern;

public class ConfigureMomento {
    int height,weight;

    public ConfigureMomento(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public ConfigureMomento setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public ConfigureMomento setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public ConfigureMomento() {
    }
}
