package PracticeSet_1.Logger;

public class InfoLogger extends BaseLogger {
    public InfoLogger(BaseLogger logger) {
        super(logger);
    }
    public void log(String logLevel, String message) {
        if (logLevel == "INFO")
            System.out.println(message);
        else
            super.log(logLevel, message);
    }
}
