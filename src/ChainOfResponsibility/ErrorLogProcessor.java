package ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(String logType, String message) {
        if(logType.equals("ERROR"))
            System.out.println("ERROR "+message);
        else
            super.log(logType, message);
    }
}
