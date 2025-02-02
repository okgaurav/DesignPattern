package CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("pics");
        FileSystem dj = new File("Gaurav Pics");
        dir.add(dj);

        Directory second = new Directory("videos");
        FileSystem video1 = new File("Rishikesh.mp4");
        FileSystem video2 = new File("Manali.mp4");
        second.add(video1);
        second.add(video2);
        dir.add(second);

        dir.ls();
    }
}
