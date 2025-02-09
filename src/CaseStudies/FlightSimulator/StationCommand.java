package CaseStudies.FlightSimulator;

public interface StationCommand {
    void sendLocation(Flight flight, int runway);
    void  addFlight(Flight flight);
}
