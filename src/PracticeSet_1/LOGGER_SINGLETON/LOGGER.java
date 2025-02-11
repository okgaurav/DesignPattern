package PracticeSet_1.LOGGER_SINGLETON;

public class LOGGER {
    private static volatile LOGGER log;

    private LOGGER() {
    }

    public static LOGGER getLog() {
        if(log==null){
            synchronized (LOGGER.class){
                if(log==null)
                    log=new LOGGER();
                else
                    return log;
            }
        }
        return log;
    }
}
