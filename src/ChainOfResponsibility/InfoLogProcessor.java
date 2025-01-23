package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(String logType, String message) {
        if(logType.equals("INFO"))
            System.out.println("INFO : "+message);
        else
            super.log(logType, message);
    }
}
