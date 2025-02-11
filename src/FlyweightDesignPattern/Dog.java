package FlyweightDesignPattern;

public class Dog implements IRobot{
    private String type;
    private String body;

    public Dog(String type, String body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Dog setType(String type) {
        this.type = type;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Dog setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Position x: "+x+" y="+y);
    }
}
