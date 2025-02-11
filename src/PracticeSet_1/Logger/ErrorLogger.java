package PracticeSet_1.Logger;

public class ErrorLogger extends BaseLogger {
    public ErrorLogger(BaseLogger logger) {
        super(logger);
    }
    public void log(String logLevel, String message) {
        if (logLevel == "ERROR")
            System.out.println(message);
        else
            super.log(logLevel, message);
    }
}
