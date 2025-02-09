package CaseStudies.FlightSimulator;

public class Main {
    public static void main(String[] args) {
        GroundCommand command = new GroundCommand();
        Flight flight1 = new Airplane("GlobeMaster",command);
        Flight flight2 = new Airplane("Chinnok",command);
        Flight flight3 = new Airplane("Tejas",command);
        Flight flight4 = new Airplane("Mig",command);
        flight1.sendCoordinates(1);
        flight2.sendCoordinates(2);

    }
}
