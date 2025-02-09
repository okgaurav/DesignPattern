package CaseStudies.FlightSimulator;

public class Airplane implements Flight {
    private String name;
    private StationCommand stationCommand;

    public Airplane(String name, StationCommand stationCommand) {
        this.name = name;
        this.stationCommand = stationCommand;
        stationCommand.addFlight(this);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("Notification Recieved By "+name+ " that "+  message);
    }

    @Override
    public void sendCoordinates(int runway) {
        stationCommand.sendLocation(this,runway);
    }

    public String getName() {
        return name;
    }

    public Airplane setName(String name) {
        this.name = name;
        return this;
    }

    public StationCommand getStationCommand() {
        return stationCommand;
    }

    public Airplane setStationCommand(StationCommand stationCommand) {
        this.stationCommand = stationCommand;
        return this;
    }
}
