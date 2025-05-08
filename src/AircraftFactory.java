import Aircraft.Aircraft;
import Aircraft.Balloon;
import Aircraft.Helicopter;
import Aircraft.JetPlane;
import utils.Coordinates;

public class AircraftFactory {
    private static long idCounter = 0;

    private static long nextId() {
        return idCounter++;
    }
    public static Aircraft newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        switch (p_type) {
            case "Helicopter":
                return new Helicopter(nextId(), p_name, p_coordinates);
            case "Balloon":
                return new Balloon(nextId(), p_name, p_coordinates);
            case "JetPlane":
                return new JetPlane(nextId(), p_name, p_coordinates);
            default:
                throw new IllegalArgumentException("Unknown aircraft type: " + p_type);
        }
    }
}
