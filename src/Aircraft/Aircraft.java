package Aircraft;
import java.util.HashMap;
import java.util.Map;

import Tower.WeatherTower;
import utils.Coordinates;
import utils.OrthogonalCoordinates;
import utils.Weather;

public class Aircraft extends Flyable {
    long id;
    String name;
    Coordinates coordinates;
    protected Map<Weather, OrthogonalCoordinates> reactions = new HashMap<>();

    Aircraft(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void updateConditions() {
        Weather weather = weatherTower.getWeather(coordinates);
        OrthogonalCoordinates reaction = reactions.get(weather);

        if (reaction != null) {
            if (!coordinates.setCoordinate(reaction.longitude, reaction.latitude, reaction.height)) {
                System.out.println(this + ": " + weather + " - " + coordinates + " - Out of bounds");
                weatherTower.unregister(this);
                return;
            }
            System.out.println(this + ": " + weather + " - " + coordinates);
        } else {
            System.out.println(this + ": No reaction for weather " + weather);
        }
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
    }
}
