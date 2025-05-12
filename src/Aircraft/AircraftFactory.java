package Aircraft;
import Tower.WeatherTower;
import utils.Coordinates;

public class AircraftFactory {
    private long idCounter;
    private WeatherTower tower;

    private long nextId() {
        return idCounter++;
    }

    public AircraftFactory(WeatherTower p_tower) {
        tower = p_tower;
        idCounter = 0;
    }
    
    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
        Aircraft aircraft;
        switch (p_type) {
            case "Helicopter":
                aircraft = new Helicopter(nextId(), p_name, p_coordinates);
                break;
            case "Baloon":
                aircraft = new Baloon(nextId(), p_name, p_coordinates);
                break;
            case "JetPlane":
                aircraft = new JetPlane(nextId(), p_name, p_coordinates);
                break;
            default:
                throw new IllegalArgumentException("Unknown aircraft type: " + p_type);
        }
        aircraft.registerTower(tower);
        return aircraft;
    }
}
