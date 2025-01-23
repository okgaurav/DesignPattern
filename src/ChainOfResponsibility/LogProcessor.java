package ChainOfResponsibility;

public abstract class LogProcessor {
    LogProcessor nextLogger;
    public LogProcessor(LogProcessor nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void log(String logType, String message){
        if(nextLogger!=null)
            nextLogger.log(logType,message);
    }
}
