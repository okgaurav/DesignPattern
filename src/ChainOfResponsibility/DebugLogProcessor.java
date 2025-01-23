package ChainOfResponsibility;

public class DebugLogProcessor extends  LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logType, String message) {
        if(logType.equals("DEBUG"))
            System.out.println("DEBUG "+message);
        else
            super.log(logType, message);
    }
}
