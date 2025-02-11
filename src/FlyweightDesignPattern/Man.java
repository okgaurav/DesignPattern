package FlyweightDesignPattern;

public class Man implements IRobot{
    private String type;
    private String body;

    public Man(String type, String body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Man setType(String type) {
        this.type = type;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Man setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Position x: "+x+" y="+y);
    }
}
