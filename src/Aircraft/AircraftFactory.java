package Aircraft;
import utils.Coordinates;

public class AircraftFactory {
    private static long idCounter = 0;

    private static long nextId() {
        return idCounter++;
    }
    public static Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        switch (p_type) {
            case "Helicopter":
                return new Helicopter(nextId(), p_name, p_coordinates);
            case "Baloon":
                return new Baloon(nextId(), p_name, p_coordinates);
            case "JetPlane":
                return new JetPlane(nextId(), p_name, p_coordinates);
            default:
                throw new IllegalArgumentException("Unknown aircraft type: " + p_type);
        }
    }
}
