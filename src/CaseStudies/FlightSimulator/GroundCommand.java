package CaseStudies.FlightSimulator;

import java.util.ArrayList;
import java.util.List;

public class GroundCommand implements StationCommand{
    List<Flight> flightList;
    public GroundCommand() {
        this.flightList = new ArrayList<>();
    }

    @Override
    public void sendLocation(Flight flight, int runway) {
        for (Flight f: flightList){
            if( !f.equals(flight) ){
                f.receiveNotification(flight.getName() +"is taking runway no. "+runway);
            }
        }
    }

    @Override
    public void addFlight(Flight flight) {
        flightList.add(flight);
    }
}
