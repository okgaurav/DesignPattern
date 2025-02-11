package PracticeSet_1.Logger;

public class Runner {
    public static void main(String[] args) {
        BaseLogger logger = new DebugLogger(new InfoLogger(new ErrorLogger(null)));
        logger.log("ERROR", "Error Occurred");
    }
}
