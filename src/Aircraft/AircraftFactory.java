package Aircraft;
import Tower.WeatherTower;
import utils.Coordinates;

public class AircraftFactory {
    private long idCounter = 0;
    private WeatherTower tower;
    private static final AircraftFactory INSTANCE = new AircraftFactory();

    private AircraftFactory() {}

    public static AircraftFactory getInstance() {
        return INSTANCE;
    }

    private long nextId() {
        return idCounter++;
    }


    public void setTower(WeatherTower p_tower) {
        this.tower = p_tower;
        this.idCounter = 0;
    }
    
    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        Aircraft aircraft;
        switch (p_type) {
            case "Helicopter":
                aircraft = new Helicopter(nextId(), "Helicopter_" + p_name, p_coordinates);
                break;
            case "Baloon":
                aircraft = new Baloon(nextId(), "Baloon_" + p_name, p_coordinates);
                break;
            case "JetPlane":
                aircraft = new JetPlane(nextId(), "JetPlane_" + p_name, p_coordinates);
                break;
            default:
                throw new IllegalArgumentException("Unknown aircraft type: " + p_type);
        }
        aircraft.registerTower(tower);
        return aircraft;
    }
}
