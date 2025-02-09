package CaseStudies.FlightSimulator;

public interface Flight {
    void receiveNotification(String message);
    void sendCoordinates(int runway);
    String getName();
}
