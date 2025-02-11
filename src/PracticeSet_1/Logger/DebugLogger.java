package PracticeSet_1.Logger;

public class DebugLogger extends BaseLogger {
    public DebugLogger(BaseLogger logger) {
        super(logger);
    }
    public void log(String logLevel, String message) {
        if (logLevel == "DEBUG")
            System.out.println(message);
        else
            super.log(logLevel, message);
    }
}
