package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor log = new DebugLogProcessor(new ErrorLogProcessor(new InfoLogProcessor(null)));
        log.log("DEBUG", "Ohh Yeah");
        log.log("INFO", "Let me Show Info");
    }
}
