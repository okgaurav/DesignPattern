package NULLPattern;

public class NullVehicle implements Vehicle{

    @Override
    public int getEngineCC() {
        return 0;
    }

    @Override
    public String getFuelType() {
        return "No Fuel";
    }
}
