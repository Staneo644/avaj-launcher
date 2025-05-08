package Aircraft;
import Tower.WeatherTower;
import utils.Coordinates;

public class Aircraft extends Flyable {
    long id;
    String name;
    Coordinates coordinates;

    Aircraft(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }

    public void updateConditions() {
        // Update the aircraft's coordinates based on its type and current conditions
        // This method should be overridden in subclasses to provide specific behavior
    }

    public void registerTower(WeatherTower weatherTower) {
        // Register the aircraft with the weather tower
        // This method should be overridden in subclasses to provide specific behavior
    }


}
