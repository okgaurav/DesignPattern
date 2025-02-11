package PracticeSet_1.LOGGER_SINGLETON;

public class Runner {
    public static void main(String[] args) {
        LOGGER logger= LOGGER.getLog();
        LOGGER logger2= LOGGER.getLog();
        System.out.println(logger.equals(logger2));
    }
}
