package PracticeSet_1.Logger;

public abstract class BaseLogger {
    BaseLogger logger;
    public BaseLogger(BaseLogger logger) {
        this.logger = logger;
    }
    public void log(String logLevel, String message) {
        if (this.logger != null) {
            logger.log(logLevel, message);
        }
    }
}
